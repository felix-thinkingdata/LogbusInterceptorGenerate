package cn.thinkingdata.generate;

import cn.thinkingdata.generate.code.domain.EntryDO;
import cn.thinkingdata.generate.code.domain.StructDO;
import cn.thinkingdata.generate.code.service.XMLMetaService;

import com.alibaba.fastjson.JSON;
import org.apache.commons.configuration.Configuration;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.WordUtils;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import java.io.File;
import java.io.StringWriter;
import java.util.*;

public class GenUtils {
    public static void main(String[] args) throws Exception {
        XMLMetaService xmlMetaService = new XMLMetaService();

        //每个文件对应一个struct
        xmlMetaService.init();

        File[] files = (new File("src/main/resources")).listFiles();
        for (File file : files) {
            if (file.getName().endsWith(".xml") &&
                    !file.getPath().contains("/head/") && !file.getPath().contains("code/")
                    && !file.getPath().contains("template/")) {
                try {
                    LinkedList<EntryDO> entries = xmlMetaService.getAllEntries(file.getName());
                    GenUtils.generatorCode(file.getName().replace(".xml",""), entries, null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        //解析整个tlog xml 配置文件
        try {
            Map<String, LinkedList<EntryDO>> entriesMap = xmlMetaService.getEntriesListFromFile("template/Nova20220902.xml");
            for (String key : entriesMap.keySet()) {
                GenUtils.generatorCode(key, entriesMap.get(key), null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void generatorCode(String structName,
                                     LinkedList<EntryDO> entryDOS, HashMap<String, String> mapping) throws Exception {
        //配置信息
        Configuration config = getConfig();
        StructDO struct = new StructDO();
        struct.setStructName(structName);
        //Java类名
        String className = structName;//tableToJava(struct.getStructName());
        struct.setClassName(className);
        struct.setClassname(StringUtils.uncapitalize(className));

        for (EntryDO columnDO : entryDOS) {

            //列名转换成Java属性名
            //String attrName = columnToJava(columnDO.getColumnName());
            String attrName = columnDO.getColumnName();
            columnDO.setAttrName(attrName);
            columnDO.setAttrname(StringUtils.uncapitalize(attrName));
            //列的数据类型，转换成Java类型
            String attrType = config.getString(columnDO.getDataType(), "unknowType");
            columnDO.setAttrType(attrType);
            columnDO.setStructFlag(false);
            // columsList.add(columnDO);
        }

        System.out.println(JSON.toJSONString(entryDOS));

        struct.setColumns(entryDOS);
        //设置velocity资源加载器
        Properties prop = new Properties();
        prop.put("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        Velocity.init(prop);
        //封装模板数据
        Map<String, Object> map = new HashMap<>(16);
        map.put("tableName", struct.getStructName());
        map.put("className", struct.getClassName());
        map.put("classname", struct.getClassname());
        map.put("pathName", config.getString("package").substring(config.getString("package").lastIndexOf(".") + 1));
        map.put("columns", struct.getColumns());
        map.put("package", config.getString("package"));
        map.put("author", config.getString("author"));
        map.put("email", config.getString("email"));
        VelocityContext context = new VelocityContext(map);

        String template = "code/domain.java.vm";

        //渲染模板
        StringWriter sw = new StringWriter();
        Template tpl = Velocity.getTemplate(template, "UTF-8");
        tpl.merge(context, sw);
        File exportShellFile = new File("generate/impl/" + className + ".java");
        FileUtils.writeStringToFile(exportShellFile, sw.toString(), "UTF-8");

    }

    /**
     * 获取类型映射配置信息
     */
    public static Configuration getConfig() throws Exception {

        return new PropertiesConfiguration("generator.properties");

    }

    /**
     * 表名转换成Java类名
     */
    public static String tableToJava(String tableName) {
        return columnToJava(tableName);
    }


    /**
     * 列名转换成Java属性名
     */
    public static String columnToJava(String columnName) {
        return WordUtils.capitalizeFully(columnName, new char[]{'_'}).replace("_", "");
    }

}
