package cn.thinkingdata.generate.code;

import cn.thinkingdata.generate.utils.DateUtil;
import cn.thinkingdata.ta.interceptor.CustomInterceptor;
import cn.thinkingdata.ta.interceptor.data.TaDataDo;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @author felix
 * @email felix@thinkingdata
 */
public class CncOnlineCnt implements CustomInterceptor{
    private static final Logger logger = LoggerFactory.getLogger(CncOnlineCnt.class);

    private  String  servertype;
    private  String  izoneareaid;
    private  Date  serveropentime;
    private  Long  serveropentimefar;
    private  Integer  serveronline;
    private  String  servercondition;
    private  String  servermilestonestage;
    private  String  dteventtime;
    private  String  vgameappid;
    private  String  timekey;
    private  Integer  onlinecntios;
    private  Integer  onlinecntandroid;


    public void setServertype( String  servertype){
            this.servertype = servertype;
    }

    public  String getServertype(){
            return servertype;
    }

    public void setIzoneareaid( String  izoneareaid){
            this.izoneareaid = izoneareaid;
    }

    public  String getIzoneareaid(){
            return izoneareaid;
    }

    public void setServeropentime( Date  serveropentime){
            this.serveropentime = serveropentime;
    }

    public  Date getServeropentime(){
            return serveropentime;
    }

    public void setServeropentimefar( Long  serveropentimefar){
            this.serveropentimefar = serveropentimefar;
    }

    public  Long getServeropentimefar(){
            return serveropentimefar;
    }

    public void setServeronline( Integer  serveronline){
            this.serveronline = serveronline;
    }

    public  Integer getServeronline(){
            return serveronline;
    }

    public void setServercondition( String  servercondition){
            this.servercondition = servercondition;
    }

    public  String getServercondition(){
            return servercondition;
    }

    public void setServermilestonestage( String  servermilestonestage){
            this.servermilestonestage = servermilestonestage;
    }

    public  String getServermilestonestage(){
            return servermilestonestage;
    }

    public void setDteventtime( String  dteventtime){
            this.dteventtime = dteventtime;
    }

    public  String getDteventtime(){
            return dteventtime;
    }

    public void setVgameappid( String  vgameappid){
            this.vgameappid = vgameappid;
    }

    public  String getVgameappid(){
            return vgameappid;
    }

    public void setTimekey( String  timekey){
            this.timekey = timekey;
    }

    public  String getTimekey(){
            return timekey;
    }

    public void setOnlinecntios( Integer  onlinecntios){
            this.onlinecntios = onlinecntios;
    }

    public  Integer getOnlinecntios(){
            return onlinecntios;
    }

    public void setOnlinecntandroid( Integer  onlinecntandroid){
            this.onlinecntandroid = onlinecntandroid;
    }

    public  Integer getOnlinecntandroid(){
            return onlinecntandroid;
    }


    @Override
    public TaDataDo transFrom(String s,String s1) {
        s = s.substring(s.indexOf("|")+1);
        if (s.endsWith("|")) {
            s = s+" ";
        }
        String[] split = s.split("\\|");
        //parse
        CncOnlineCnt cncOnlineCnt = new CncOnlineCnt();
        cncOnlineCnt.setServertype(split[0]);
        cncOnlineCnt.setIzoneareaid(split[1]);
        cncOnlineCnt.setServeropentime(DateUtil.parseDateString(split[2]));
        cncOnlineCnt.setServeropentimefar(Long.valueOf(split[3]));
        cncOnlineCnt.setServeronline(Integer.valueOf(split[4]));
        cncOnlineCnt.setServercondition(split[5]);
        cncOnlineCnt.setServermilestonestage(split[6]);
        cncOnlineCnt.setDteventtime(split[7]);
        cncOnlineCnt.setVgameappid(split[8]);
        cncOnlineCnt.setTimekey(split[9]);
        cncOnlineCnt.setOnlinecntios(Integer.valueOf(split[10]));
        cncOnlineCnt.setOnlinecntandroid(Integer.valueOf(split[11]));
        
        TaDataDo taDataDo = new TaDataDo();
        JSONObject propertyObj = JSON.parseObject(JSON.toJSONString(cncOnlineCnt));
        taDataDo.setPropertyObj(propertyObj);

        if (CncOnlineCnt.class.getSimpleName().equalsIgnoreCase("UserSnapshot")) {
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
            taDataDo.setEventName(propertyObj.getString("CncOnlineCnt"));
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
            taDataDo.setEventName(propertyObj.getString("CncOnlineCnt"));
            taDataDo.setDistinctId("CncOnlineCnt");
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
        String data = "CncOnlineCnt|null||2022-08-04 04:12:46|373889|0|xxx|xxx|2022-08-08 12:04:15||1659960255584|0|0";
        CncOnlineCnt xxx = new CncOnlineCnt();
        TaDataDo taDataDo =  xxx.transFrom(data,"");
        System.out.println(JSON.toJSONString(taDataDo));
    }

}
