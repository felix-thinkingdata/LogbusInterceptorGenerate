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
public class CncGuildExpansion implements CustomInterceptor{
    private static final Logger logger = LoggerFactory.getLogger(CncGuildExpansion.class);

    private  String  servertype;
    private  String  izoneareaid;
    private  String  guildcreatetime;
    private  String  guildid;
    private  String  guildname;
    private  String  guildshortname;
    private  Integer  guildlevel;
    private  Integer  guildpopulation;
    private  Integer  guildonline;
    private  Integer  guildgiftlevel;
    private  Long  guildpower;
    private  Long  guildinfluence;
    private  String  guildleaderid;
    private  String  dteventtime;
    private  Integer  buildingid;
    private  String  buildingcoordinate;
    private  String  action;
    private  Long  optionroleid;


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

    public void setGuildcreatetime( String  guildcreatetime){
            this.guildcreatetime = guildcreatetime;
    }

    public  String getGuildcreatetime(){
            return guildcreatetime;
    }

    public void setGuildid( String  guildid){
            this.guildid = guildid;
    }

    public  String getGuildid(){
            return guildid;
    }

    public void setGuildname( String  guildname){
            this.guildname = guildname;
    }

    public  String getGuildname(){
            return guildname;
    }

    public void setGuildshortname( String  guildshortname){
            this.guildshortname = guildshortname;
    }

    public  String getGuildshortname(){
            return guildshortname;
    }

    public void setGuildlevel( Integer  guildlevel){
            this.guildlevel = guildlevel;
    }

    public  Integer getGuildlevel(){
            return guildlevel;
    }

    public void setGuildpopulation( Integer  guildpopulation){
            this.guildpopulation = guildpopulation;
    }

    public  Integer getGuildpopulation(){
            return guildpopulation;
    }

    public void setGuildonline( Integer  guildonline){
            this.guildonline = guildonline;
    }

    public  Integer getGuildonline(){
            return guildonline;
    }

    public void setGuildgiftlevel( Integer  guildgiftlevel){
            this.guildgiftlevel = guildgiftlevel;
    }

    public  Integer getGuildgiftlevel(){
            return guildgiftlevel;
    }

    public void setGuildpower( Long  guildpower){
            this.guildpower = guildpower;
    }

    public  Long getGuildpower(){
            return guildpower;
    }

    public void setGuildinfluence( Long  guildinfluence){
            this.guildinfluence = guildinfluence;
    }

    public  Long getGuildinfluence(){
            return guildinfluence;
    }

    public void setGuildleaderid( String  guildleaderid){
            this.guildleaderid = guildleaderid;
    }

    public  String getGuildleaderid(){
            return guildleaderid;
    }

    public void setDteventtime( String  dteventtime){
            this.dteventtime = dteventtime;
    }

    public  String getDteventtime(){
            return dteventtime;
    }

    public void setBuildingid( Integer  buildingid){
            this.buildingid = buildingid;
    }

    public  Integer getBuildingid(){
            return buildingid;
    }

    public void setBuildingcoordinate( String  buildingcoordinate){
            this.buildingcoordinate = buildingcoordinate;
    }

    public  String getBuildingcoordinate(){
            return buildingcoordinate;
    }

    public void setAction( String  action){
            this.action = action;
    }

    public  String getAction(){
            return action;
    }

    public void setOptionroleid( Long  optionroleid){
            this.optionroleid = optionroleid;
    }

    public  Long getOptionroleid(){
            return optionroleid;
    }


    @Override
    public TaDataDo transFrom(String s,String s1) {
        s = s.substring(s.indexOf("|")+1);
        if (s.endsWith("|")) {
            s = s+" ";
        }
        String[] split = s.split("\\|");
        //parse
        CncGuildExpansion cncGuildExpansion = new CncGuildExpansion();
        cncGuildExpansion.setServertype(split[0]);
        cncGuildExpansion.setIzoneareaid(split[1]);
        cncGuildExpansion.setGuildcreatetime(split[2]);
        cncGuildExpansion.setGuildid(split[3]);
        cncGuildExpansion.setGuildname(split[4]);
        cncGuildExpansion.setGuildshortname(split[5]);
        cncGuildExpansion.setGuildlevel(Integer.valueOf(split[6]));
        cncGuildExpansion.setGuildpopulation(Integer.valueOf(split[7]));
        cncGuildExpansion.setGuildonline(Integer.valueOf(split[8]));
        cncGuildExpansion.setGuildgiftlevel(Integer.valueOf(split[9]));
        cncGuildExpansion.setGuildpower(Long.valueOf(split[10]));
        cncGuildExpansion.setGuildinfluence(Long.valueOf(split[11]));
        cncGuildExpansion.setGuildleaderid(split[12]);
        cncGuildExpansion.setDteventtime(split[13]);
        cncGuildExpansion.setBuildingid(Integer.valueOf(split[14]));
        cncGuildExpansion.setBuildingcoordinate(split[15]);
        cncGuildExpansion.setAction(split[16]);
        cncGuildExpansion.setOptionroleid(Long.valueOf(split[17]));
        
        TaDataDo taDataDo = new TaDataDo();
        JSONObject propertyObj = JSON.parseObject(JSON.toJSONString(cncGuildExpansion));
        taDataDo.setPropertyObj(propertyObj);

        if (CncGuildExpansion.class.getSimpleName().equalsIgnoreCase("UserSnapshot")) {
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
            taDataDo.setEventName(propertyObj.getString("CncGuildExpansion"));
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
            taDataDo.setEventName(propertyObj.getString("CncGuildExpansion"));
            taDataDo.setDistinctId("CncGuildExpansion");
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
        String data = "CncGuildExpansion|null|1|2022-08-08 10:21:55|32339155233|明星大乱 斗|SDN|0|2|0|0|64902048|10|32269952230|2022-08-08 11:02:24|10066|178000,112000|leave_defence_guild_building|32089647769";
        CncGuildExpansion xxx = new CncGuildExpansion();
        TaDataDo taDataDo =  xxx.transFrom(data,"");
        System.out.println(JSON.toJSONString(taDataDo));
    }

}
