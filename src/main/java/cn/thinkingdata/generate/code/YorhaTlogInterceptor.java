package cn.thinkingdata.generate.code;

import cn.thinkingdata.ta.interceptor.CustomInterceptor;
import cn.thinkingdata.ta.interceptor.data.TaDataDo;
import com.alibaba.fastjson.JSON;

import java.lang.reflect.Method;

public class YorhaTlogInterceptor implements CustomInterceptor {

    @Override
    public TaDataDo transFrom(String s, String s1)  {
        String className = s.substring(0, s.indexOf("|"));
        try {
            Class cla = Class.forName("cn.thinkingdata.generate.code." + className);
            Object obj = cla.newInstance();
            Method method = cla.getDeclaredMethod("transFrom", String.class, String.class);
            return (TaDataDo) method.invoke(obj, s, s1);
        } catch (Exception e) {

        }
        return null;
    }

    public static void main(String[] args) {
        String data = "CncItemFlow||204b1964eed64d979a68b7f16f818346|||null|1|1||32339158980|Commander_Fq QdxB|17|1|2022-08-08 10:59:52|1|0|4763|4763|0|xxx|0|xxx|xxx|xxx|2|en|58.34.218.250||0||0|0|2022-08-08 12:01:05|10350050|91|31|60|1|ICR_NONE|";
        YorhaTlogInterceptor xxx = new YorhaTlogInterceptor();
        TaDataDo taDataDo =  xxx.transFrom(data,"");
        System.out.println(JSON.toJSONString(taDataDo));
    }
}
