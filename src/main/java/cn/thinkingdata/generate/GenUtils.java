package cn.thinkingdata.generate;

import cn.thinkingdata.generate.utils.CommonUtil;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class GenUtils {

    public static void generatorCode() throws Exception {
        //配置信息
        Configuration config = getConfig();
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
