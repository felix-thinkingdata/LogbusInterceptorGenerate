package cn.thinkingdata.generate.code;

import cn.thinkingdata.ta.interceptor.CustomInterceptor;
import cn.thinkingdata.ta.interceptor.data.TaDataDo;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.lang.reflect.Method;

public class YorhaTlogInterceptor implements CustomInterceptor {

    @Override
    public TaDataDo transFrom(String s, String s1)  {

        //以下处理逻辑为特殊逻辑，取决于具体数据的格式，如果数据格式为tlog原始格式可忽略
        String log = s;
        int start = s.indexOf("\"log\":\"");
        int end = s.indexOf("\\n\",\"dir\":\"");
        if (start > 0 && end > start) {
             log = s.substring(start+7, end);
        }

        //解析tlog格式数据
        String className = log.substring(0, log.indexOf("|"));
        switch (className) {
            case "CncPlayerLogin":
                return (new CncPlayerLogin()).transFrom(log, s1);
            case "CncPlayerLogout":
                return (new CncPlayerLogout()).transFrom(log, s1);
            case "CncItemFlow":
                return (new CncItemFlow()).transFrom(log, s1);
            case "CncOnlineCnt":
                return (new CncOnlineCnt()).transFrom(log, s1);
            case "CncGuildExpansion":
                return (new CncGuildExpansion()).transFrom(log, s1);
            case "UserSnapshot":
                return (new UserSnapshot()).transFrom(log, s1);
            case "ComplexTypeEvent":
                return (new ComplexTypeEvent().transFrom(log, s1));
            default:
                return null;
        }

//        try {
//            Class cla = Class.forName("cn.thinkingdata.generate.code." + className);
//            Object obj = cla.newInstance();
//            Method method = cla.getDeclaredMethod("transFrom", String.class, String.class);
//            return (TaDataDo) method.invoke(obj, s, s1);
//        } catch (Exception e) {
//
//        }

    }

    public static void main(String[] args) {
        String data = "{\"@timestamp\":1660321091.944,\"logfilename\":\"qlog_flow_log\",\"log\":\"ComplexTypeEvent|2022-08-05 06:31:38|0.5|0.888|\"a\",\"b\",\"c\"|1,2,3|{\"key\":\"value\"}|[{\"key1\":\"value1\",\"key2\":\"value2\"},{\"key1\":\"value3\",\"key2\":\"value4\"}]|1660537266｜1660537266179\\n\",\"dir\":\"204.1.2.0\",\"filepath\":\"/var/log/containers/204.1.2.0/qlog_flow_log\",\"time\":\"2022-08-12 16:18:11.944\"}";
        YorhaTlogInterceptor xxx = new YorhaTlogInterceptor();
        TaDataDo taDataDo =  xxx.transFrom(data,"");
        System.out.println(JSON.toJSONString(taDataDo));
    }
}
