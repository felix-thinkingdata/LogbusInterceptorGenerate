package cn.thinkingdata.generate.code;

import cn.thinkingdata.generate.utils.DateUtil;
import cn.thinkingdata.ta.interceptor.CustomInterceptor;
import cn.thinkingdata.ta.interceptor.data.TaDataDo;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @author felix
 * @email felix@thinkingdata
 */
public class ComplexTypeEvent implements CustomInterceptor{
    private static final Logger logger = LoggerFactory.getLogger(ComplexTypeEvent.class);

    private  String  dteventtime;
    private  Float  floattype;
    private  Double  doubletype;
    private  JSONObject  objecttype;
    private  JSONArray  objectarraytype;


    public void setDteventtime( String  dteventtime){
            this.dteventtime = dteventtime;
    }

    public  String getDteventtime(){
            return dteventtime;
    }

    public void setFloattype( Float  floattype){
            this.floattype = floattype;
    }

    public  Float getFloattype(){
            return floattype;
    }

    public void setDoubletype( Double  doubletype){
            this.doubletype = doubletype;
    }

    public  Double getDoubletype(){
            return doubletype;
    }

    public void setObjecttype( JSONObject  objecttype){
            this.objecttype = objecttype;
    }

    public  JSONObject getObjecttype(){
            return objecttype;
    }

    public void setObjectarraytype( JSONArray  objectarraytype){
            this.objectarraytype = objectarraytype;
    }

    public  JSONArray getObjectarraytype(){
            return objectarraytype;
    }


    @Override
    public TaDataDo transFrom(String s,String s1) {
        s = s.substring(s.indexOf("|")+1);
        if (s.endsWith("|")) {
            s = s+" ";
        }
        String[] split = s.split("\\|");
        //parse
        ComplexTypeEvent complexTypeEvent = new ComplexTypeEvent();
        complexTypeEvent.setDteventtime(split[0]);
        complexTypeEvent.setFloattype(Float.valueOf(split[1]));
        complexTypeEvent.setDoubletype(Double.valueOf(split[2]));
        complexTypeEvent.setObjecttype(JSONObject.parseObject(split[3]));
        complexTypeEvent.setObjectarraytype(JSONArray.parseArray(split[4]));
        
        TaDataDo taDataDo = new TaDataDo();
        JSONObject propertyObj = JSON.parseObject(JSON.toJSONString(complexTypeEvent));
        taDataDo.setPropertyObj(propertyObj);

        if (ComplexTypeEvent.class.getSimpleName().equalsIgnoreCase("UserSnapshot")) {
            taDataDo.setType("user_set");
            if(propertyObj.containsKey("VOpenID".toLowerCase())){
                taDataDo.setDistinctId(propertyObj.getString("VOpenID".toLowerCase()));
            }
            if(propertyObj.containsKey("VRoleId".toLowerCase())){
                taDataDo.setAccountId(propertyObj.getString("VRoleId".toLowerCase()));
            }
            if(propertyObj.containsKey("DtEventTime".toLowerCase())){
                taDataDo.setTime(propertyObj.getDate("DtEventTime".toLowerCase()));
            }
        } else if (propertyObj.containsKey("VOpenID".toLowerCase())){
            taDataDo.setType("track");
            taDataDo.setEventName("ComplexTypeEvent");
            if(propertyObj.containsKey("VOpenID".toLowerCase())){
                taDataDo.setDistinctId(propertyObj.getString("VOpenID".toLowerCase()));
            }
            if(propertyObj.containsKey("VRoleId".toLowerCase())){
                taDataDo.setAccountId(propertyObj.getString("VRoleId".toLowerCase()));
            }
            if(propertyObj.containsKey("DtEventTime".toLowerCase())){
                taDataDo.setTime(propertyObj.getDate("DtEventTime".toLowerCase()));
            }
            if(propertyObj.containsKey("VClientId".toLowerCase())){
                taDataDo.setIp(propertyObj.getString("VClientId".toLowerCase()));
            }
        } else {
            taDataDo.setType("track");
            taDataDo.setEventName("ComplexTypeEvent");
            taDataDo.setDistinctId("ComplexTypeEvent");
            if(propertyObj.containsKey("DtEventTime".toLowerCase())){
                taDataDo.setTime(propertyObj.getDate("DtEventTime".toLowerCase()));
            } else {
                taDataDo.setTime(new Date());
            }
        }

        return taDataDo;

    }

    public static void main(String[] args) {
        //事件测试数据
        String data = "";
        ComplexTypeEvent xxx = new ComplexTypeEvent();
        TaDataDo taDataDo =  xxx.transFrom(data,"");
        System.out.println(JSON.toJSONString(taDataDo));
    }

}
