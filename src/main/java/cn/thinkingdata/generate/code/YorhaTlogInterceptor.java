package cn.thinkingdata.generate.code;

import cn.thinkingdata.ta.interceptor.CustomInterceptor;
import cn.thinkingdata.ta.interceptor.data.TaDataDo;
import com.alibaba.fastjson.JSON;

import java.lang.reflect.Method;

public class YorhaTlogInterceptor implements CustomInterceptor {

    @Override
    public TaDataDo transFrom(String s, String s1)  {
        String className = s.substring(0, s.indexOf("|"));
        switch (className) {
            case "CncPlayerLogin":
                return (new CncPlayerLogin()).transFrom(s, s1);
            case "CncPlayerLogout":
                return (new CncPlayerLogout()).transFrom(s, s1);
            case "CncItemFlow":
                return (new CncItemFlow()).transFrom(s, s1);
            case "CncOnlineCnt":
                return (new CncOnlineCnt()).transFrom(s, s1);
            case "CncGuildExpansion":
                return (new CncGuildExpansion()).transFrom(s, s1);
            case "UserSnapshot":
                return (new UserSnapshot()).transFrom(s, s1);
            case "ComplexTypeEvent":
                return (new ComplexTypeEvent().transFrom(s, s1));
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
        String data = "ComplexTypeEvent|2022-08-05 06:31:38|{\"key\":\"value\"}|[{\"key1\":\"value1\",\"key2\":\"value2\"},{\"key1\":\"value3\",\"key2\":\"value4\"}]";
        YorhaTlogInterceptor xxx = new YorhaTlogInterceptor();
        TaDataDo taDataDo =  xxx.transFrom(data,"");
        System.out.println(JSON.toJSONString(taDataDo));
    }
}
