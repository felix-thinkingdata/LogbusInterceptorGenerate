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
public class CncItemFlow implements CustomInterceptor{
    private static final Logger logger = LoggerFactory.getLogger(CncItemFlow.class);

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
    private  String  igoodsid;
    private  Long  beforecount;
    private  Long  aftercount;
    private  Long  icount;
    private  Integer  addorreduce;
    private  String  reason;
    private  String  subreason;


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

    public void setIgoodsid( String  igoodsid){
            this.igoodsid = igoodsid;
    }

    public  String getIgoodsid(){
            return igoodsid;
    }

    public void setBeforecount( Long  beforecount){
            this.beforecount = beforecount;
    }

    public  Long getBeforecount(){
            return beforecount;
    }

    public void setAftercount( Long  aftercount){
            this.aftercount = aftercount;
    }

    public  Long getAftercount(){
            return aftercount;
    }

    public void setIcount( Long  icount){
            this.icount = icount;
    }

    public  Long getIcount(){
            return icount;
    }

    public void setAddorreduce( Integer  addorreduce){
            this.addorreduce = addorreduce;
    }

    public  Integer getAddorreduce(){
            return addorreduce;
    }

    public void setReason( String  reason){
            this.reason = reason;
    }

    public  String getReason(){
            return reason;
    }

    public void setSubreason( String  subreason){
            this.subreason = subreason;
    }

    public  String getSubreason(){
            return subreason;
    }


    @Override
    public TaDataDo transFrom(String s,String s1) {
        s = s.substring(s.indexOf("|")+1);
        if (s.endsWith("|")) {
            s = s+" ";
        }
        String[] split = s.split("\\|");
        //parse
        CncItemFlow cncItemFlow = new CncItemFlow();
        cncItemFlow.setGameappid(split[0]);
        cncItemFlow.setVopenid(split[1]);
        cncItemFlow.setAccountcreatetime(split[2]);
        cncItemFlow.setAccountregtime(split[3]);
        cncItemFlow.setServertype(split[4]);
        cncItemFlow.setIzoneareaid(split[5]);
        cncItemFlow.setGamesvrid(split[6]);
        cncItemFlow.setNowcoordinate(split[7]);
        cncItemFlow.setVroleid(split[8]);
        cncItemFlow.setVrolename(split[9]);
        cncItemFlow.setRolenum(Integer.valueOf(split[10]));
        cncItemFlow.setRoletype(split[11]);
        cncItemFlow.setRolecreatetime(split[12]);
        cncItemFlow.setIlevel(Integer.valueOf(split[13]));
        cncItemFlow.setIviplevel(Integer.valueOf(split[14]));
        cncItemFlow.setIrolece(Integer.valueOf(split[15]));
        cncItemFlow.setHighestrolepower(Integer.valueOf(split[16]));
        cncItemFlow.setPlayerfriendsnum(Integer.valueOf(split[17]));
        cncItemFlow.setRechargesum(split[18]);
        cncItemFlow.setIguildid(Integer.valueOf(split[19]));
        cncItemFlow.setVguildname(split[20]);
        cncItemFlow.setGuildgrade(split[21]);
        cncItemFlow.setGuildclass(split[22]);
        cncItemFlow.setPlatid(Integer.valueOf(split[23]));
        cncItemFlow.setGamelanguage(split[24]);
        cncItemFlow.setVclientid(split[25]);
        cncItemFlow.setVclientipv6(split[26]);
        cncItemFlow.setKillnum(split[27]);
        cncItemFlow.setClientversion(split[28]);
        cncItemFlow.setMoneyconfig(Integer.valueOf(split[29]));
        cncItemFlow.setTransferornot(Integer.valueOf(split[30]));
        cncItemFlow.setDteventtime(split[31]);
        cncItemFlow.setIgoodsid(split[32]);
        cncItemFlow.setBeforecount(Long.valueOf(split[33]));
        cncItemFlow.setAftercount(Long.valueOf(split[34]));
        cncItemFlow.setIcount(Long.valueOf(split[35]));
        cncItemFlow.setAddorreduce(Integer.valueOf(split[36]));
        cncItemFlow.setReason(split[37]);
        cncItemFlow.setSubreason(split[38]);
        
        TaDataDo taDataDo = new TaDataDo();
        JSONObject propertyObj = JSON.parseObject(JSON.toJSONString(cncItemFlow));
        taDataDo.setPropertyObj(propertyObj);

        if (CncItemFlow.class.getSimpleName().equalsIgnoreCase("UserSnapshot")) {
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
            taDataDo.setEventName("CncItemFlow");
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
            taDataDo.setEventName("CncItemFlow");
            taDataDo.setDistinctId("CncItemFlow");
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
        String data = "CncItemFlow||204b1964eed64d979a68b7f16f818346|||null|1|1||32339158980|Commander_Fq QdxB|17|1|2022-08-08 10:59:52|1|0|4763|4763|0|xxx|0|xxx|xxx|xxx|2|en|58.34.218.250||0||0|0|2022-08-08 12:01:05|10350050|91|31|60|1|ICR_NONE|";
        CncItemFlow xxx = new CncItemFlow();
        TaDataDo taDataDo =  xxx.transFrom(data,"");
        System.out.println(JSON.toJSONString(taDataDo));
    }

}
