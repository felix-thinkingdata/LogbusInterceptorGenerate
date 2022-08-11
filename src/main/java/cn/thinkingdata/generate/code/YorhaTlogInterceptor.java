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
        String data = "CncPlayerLogout||5c42e476e00d433bb7d61c9fe40723c9|||null|1|1||32089626189|Commander _LszSP3|5|1|2022-08-05 06:31:38|25|0|67667086|67667086|0|xxx|0|xxx|xxx|xxx|2|zh|58.34.218.250||0||0|0|2022-08-08 12:01:42|Windows 10 (10.0.19041) 64bit|OptiPlex 7080 (Dell Inc.)|65249|3001|b064267bb37b28b4093b59ccc98873aea972a3d2|31|1|james\n";
        YorhaTlogInterceptor xxx = new YorhaTlogInterceptor();
        TaDataDo taDataDo =  xxx.transFrom(data,"");
        System.out.println(JSON.toJSONString(taDataDo));
    }
}
