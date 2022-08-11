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
public class UserSnapshot implements CustomInterceptor{
    private static final Logger logger = LoggerFactory.getLogger(UserSnapshot.class);

    private  String  gameappid;
    private  String  vopenid;
    private  String  accountcreatetime;
    private  String  accountregtime;
    private  String  servertype;
    private  String  izoneareaid;
    private  String  gamesvrid;
    private  String  nowcoordinate;
    private  String  vroleid;
    private  String  vrolename;
    private  Integer  rolenum;
    private  String  roletype;
    private  String  rolecreatetime;
    private  Integer  ilevel;
    private  Integer  iviplevel;
    private  Integer  irolece;
    private  Integer  highestrolepower;
    private  Integer  playerfriendsnum;
    private  String  rechargesum;
    private  Integer  iguildid;
    private  String  vguildname;
    private  String  guildgrade;
    private  String  guildclass;
    private  Integer  platid;
    private  String  gamelanguage;
    private  String  vclientid;
    private  String  vclientipv6;
    private  String  killnum;
    private  String  clientversion;
    private  Integer  moneyconfig;
    private  Integer  transferornot;
    private  String  dteventtime;
    private  String  systemsoftware;
    private  String  systemhardware;
    private  String  deviceid;
    private  String  accountname;


    public void setGameappid( String  gameappid){
            this.gameappid = gameappid;
    }

    public  String getGameappid(){
            return gameappid;
    }

    public void setVopenid( String  vopenid){
            this.vopenid = vopenid;
    }

    public  String getVopenid(){
            return vopenid;
    }

    public void setAccountcreatetime( String  accountcreatetime){
            this.accountcreatetime = accountcreatetime;
    }

    public  String getAccountcreatetime(){
            return accountcreatetime;
    }

    public void setAccountregtime( String  accountregtime){
            this.accountregtime = accountregtime;
    }

    public  String getAccountregtime(){
            return accountregtime;
    }

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

    public void setGamesvrid( String  gamesvrid){
            this.gamesvrid = gamesvrid;
    }

    public  String getGamesvrid(){
            return gamesvrid;
    }

    public void setNowcoordinate( String  nowcoordinate){
            this.nowcoordinate = nowcoordinate;
    }

    public  String getNowcoordinate(){
            return nowcoordinate;
    }

    public void setVroleid( String  vroleid){
            this.vroleid = vroleid;
    }

    public  String getVroleid(){
            return vroleid;
    }

    public void setVrolename( String  vrolename){
            this.vrolename = vrolename;
    }

    public  String getVrolename(){
            return vrolename;
    }

    public void setRolenum( Integer  rolenum){
            this.rolenum = rolenum;
    }

    public  Integer getRolenum(){
            return rolenum;
    }

    public void setRoletype( String  roletype){
            this.roletype = roletype;
    }

    public  String getRoletype(){
            return roletype;
    }

    public void setRolecreatetime( String  rolecreatetime){
            this.rolecreatetime = rolecreatetime;
    }

    public  String getRolecreatetime(){
            return rolecreatetime;
    }

    public void setIlevel( Integer  ilevel){
            this.ilevel = ilevel;
    }

    public  Integer getIlevel(){
            return ilevel;
    }

    public void setIviplevel( Integer  iviplevel){
            this.iviplevel = iviplevel;
    }

    public  Integer getIviplevel(){
            return iviplevel;
    }

    public void setIrolece( Integer  irolece){
            this.irolece = irolece;
    }

    public  Integer getIrolece(){
            return irolece;
    }

    public void setHighestrolepower( Integer  highestrolepower){
            this.highestrolepower = highestrolepower;
    }

    public  Integer getHighestrolepower(){
            return highestrolepower;
    }

    public void setPlayerfriendsnum( Integer  playerfriendsnum){
            this.playerfriendsnum = playerfriendsnum;
    }

    public  Integer getPlayerfriendsnum(){
            return playerfriendsnum;
    }

    public void setRechargesum( String  rechargesum){
            this.rechargesum = rechargesum;
    }

    public  String getRechargesum(){
            return rechargesum;
    }

    public void setIguildid( Integer  iguildid){
            this.iguildid = iguildid;
    }

    public  Integer getIguildid(){
            return iguildid;
    }

    public void setVguildname( String  vguildname){
            this.vguildname = vguildname;
    }

    public  String getVguildname(){
            return vguildname;
    }

    public void setGuildgrade( String  guildgrade){
            this.guildgrade = guildgrade;
    }

    public  String getGuildgrade(){
            return guildgrade;
    }

    public void setGuildclass( String  guildclass){
            this.guildclass = guildclass;
    }

    public  String getGuildclass(){
            return guildclass;
    }

    public void setPlatid( Integer  platid){
            this.platid = platid;
    }

    public  Integer getPlatid(){
            return platid;
    }

    public void setGamelanguage( String  gamelanguage){
            this.gamelanguage = gamelanguage;
    }

    public  String getGamelanguage(){
            return gamelanguage;
    }

    public void setVclientid( String  vclientid){
            this.vclientid = vclientid;
    }

    public  String getVclientid(){
            return vclientid;
    }

    public void setVclientipv6( String  vclientipv6){
            this.vclientipv6 = vclientipv6;
    }

    public  String getVclientipv6(){
            return vclientipv6;
    }

    public void setKillnum( String  killnum){
            this.killnum = killnum;
    }

    public  String getKillnum(){
            return killnum;
    }

    public void setClientversion( String  clientversion){
            this.clientversion = clientversion;
    }

    public  String getClientversion(){
            return clientversion;
    }

    public void setMoneyconfig( Integer  moneyconfig){
            this.moneyconfig = moneyconfig;
    }

    public  Integer getMoneyconfig(){
            return moneyconfig;
    }

    public void setTransferornot( Integer  transferornot){
            this.transferornot = transferornot;
    }

    public  Integer getTransferornot(){
            return transferornot;
    }

    public void setDteventtime( String  dteventtime){
            this.dteventtime = dteventtime;
    }

    public  String getDteventtime(){
            return dteventtime;
    }

    public void setSystemsoftware( String  systemsoftware){
            this.systemsoftware = systemsoftware;
    }

    public  String getSystemsoftware(){
            return systemsoftware;
    }

    public void setSystemhardware( String  systemhardware){
            this.systemhardware = systemhardware;
    }

    public  String getSystemhardware(){
            return systemhardware;
    }

    public void setDeviceid( String  deviceid){
            this.deviceid = deviceid;
    }

    public  String getDeviceid(){
            return deviceid;
    }

    public void setAccountname( String  accountname){
            this.accountname = accountname;
    }

    public  String getAccountname(){
            return accountname;
    }


    @Override
    public TaDataDo transFrom(String s,String s1) {
        s = s.substring(s.indexOf("|")+1);
        if (s.endsWith("|")) {
            s = s+" ";
        }
        String[] split = s.split("\\|");
        //parse
        UserSnapshot userSnapshot = new UserSnapshot();
        userSnapshot.setGameappid(split[0]);
        userSnapshot.setVopenid(split[1]);
        userSnapshot.setAccountcreatetime(split[2]);
        userSnapshot.setAccountregtime(split[3]);
        userSnapshot.setServertype(split[4]);
        userSnapshot.setIzoneareaid(split[5]);
        userSnapshot.setGamesvrid(split[6]);
        userSnapshot.setNowcoordinate(split[7]);
        userSnapshot.setVroleid(split[8]);
        userSnapshot.setVrolename(split[9]);
        userSnapshot.setRolenum(Integer.valueOf(split[10]));
        userSnapshot.setRoletype(split[11]);
        userSnapshot.setRolecreatetime(split[12]);
        userSnapshot.setIlevel(Integer.valueOf(split[13]));
        userSnapshot.setIviplevel(Integer.valueOf(split[14]));
        userSnapshot.setIrolece(Integer.valueOf(split[15]));
        userSnapshot.setHighestrolepower(Integer.valueOf(split[16]));
        userSnapshot.setPlayerfriendsnum(Integer.valueOf(split[17]));
        userSnapshot.setRechargesum(split[18]);
        userSnapshot.setIguildid(Integer.valueOf(split[19]));
        userSnapshot.setVguildname(split[20]);
        userSnapshot.setGuildgrade(split[21]);
        userSnapshot.setGuildclass(split[22]);
        userSnapshot.setPlatid(Integer.valueOf(split[23]));
        userSnapshot.setGamelanguage(split[24]);
        userSnapshot.setVclientid(split[25]);
        userSnapshot.setVclientipv6(split[26]);
        userSnapshot.setKillnum(split[27]);
        userSnapshot.setClientversion(split[28]);
        userSnapshot.setMoneyconfig(Integer.valueOf(split[29]));
        userSnapshot.setTransferornot(Integer.valueOf(split[30]));
        userSnapshot.setDteventtime(split[31]);
        userSnapshot.setSystemsoftware(split[32]);
        userSnapshot.setSystemhardware(split[33]);
        userSnapshot.setDeviceid(split[34]);
        userSnapshot.setAccountname(split[35]);
        
        TaDataDo taDataDo = new TaDataDo();
        JSONObject propertyObj = JSON.parseObject(JSON.toJSONString(userSnapshot));
        taDataDo.setPropertyObj(propertyObj);

        if (UserSnapshot.class.getSimpleName().equalsIgnoreCase("UserSnapshot")) {
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
            taDataDo.setEventName(propertyObj.getString("UserSnapshot"));
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
            taDataDo.setEventName(propertyObj.getString("UserSnapshot"));
            taDataDo.setDistinctId("UserSnapshot");
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
        String data = "UserSnapshot||5c42e476e00d433bb7d61c9fe40723c9|||null|1|1||32089626189|Commander _LszSP3|5|1|2022-08-05 06:31:38|25|0|67667086|67667086|0|xxx|0|xxx|xxx|xxx|2|zh|58.34.218.250||0||0|0|2022-08-08 12:01:42|Windows 10 (10.0.19041) 64bit|OptiPlex 7080 (Dell Inc.)|b064267bb37b28b4093b59ccc98873aea972a3d2|james";
        UserSnapshot xxx = new UserSnapshot();
        TaDataDo taDataDo =  xxx.transFrom(data,"");
        System.out.println(JSON.toJSONString(taDataDo));
    }

}
