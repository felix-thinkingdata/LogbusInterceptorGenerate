package cn.thinkingdata.generate;

import cn.thinkingdata.generate.code.domain.EntryDO;
import cn.thinkingdata.generate.code.domain.StructDO;
import cn.thinkingdata.generate.code.service.XMLMetaService;
import cn.thinkingdata.generate.utils.CommonUtil;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.dom4j.DocumentException;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GenUtils {
    public static void main(String[] args) throws DocumentException {
        XMLMetaService xmlMetaService = new XMLMetaService();

        LinkedList<EntryDO> ClanHead = xmlMetaService.getAllEntrys("ClanHead.xml");
        LinkedList<EntryDO> PlayerHead = xmlMetaService.getAllEntrys("PlayerHead.xml");
        LinkedList<EntryDO> ServerHead = xmlMetaService.getAllEntrys("ServerHead.xml");
        LinkedList<EntryDO> CncPlayerLogin = xmlMetaService.getAllEntrys("CncPlayerLogin.xml");


       // GenUtils.generatorCode();


    }

    public static void generatorCode(String structName,
                                     List<Map<String, String>> columns, boolean subFlag, HashMap<String, String> mapping) throws Exception {
        //配置信息
        Configuration config = getConfig();
        StructDO struct = new StructDO();
        struct.setStructName(structName);


        EntryDO entry = new EntryDO();
    }

    /**
     * 获取类型映射配置信息
     */
    public static Configuration getConfig() throws Exception {
        try {
            return new PropertiesConfiguration(CommonUtil.getContentFromResFile("/generator.properties"));
        } catch (ConfigurationException e) {
            e.printStackTrace();
            throw new Exception("获取配置文件失败，", e);
        }
    }


}
