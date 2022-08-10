package cn.thinkingdata.generate.code;

import cn.thinkingdata.generate.utils.DateUtil;
import cn.thinkingdata.ta.interceptor.CustomInterceptor;
import cn.thinkingdata.ta.interceptor.data.TaDataDo;
import com.alibaba.fastjson.JSON;

public class CncOnlineCnt  implements CustomInterceptor {
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
    private  Integer  memory;
    private  String  glversion;
    private  String  deviceid;
    private  String  accountname;


    public void setGameappid( String  gameappid) {
        this.gameappid = gameappid;
    }

    public  String getGameappid() {
        return gameappid;
    }

    public void setVopenid( String  vopenid) {
        this.vopenid = vopenid;
    }

    public  String getVopenid() {
        return vopenid;
    }

    public void setAccountcreatetime( String  accountcreatetime) {
        this.accountcreatetime = accountcreatetime;
    }

    public  String getAccountcreatetime() {
        return accountcreatetime;
    }

    public void setAccountregtime( String  accountregtime) {
        this.accountregtime = accountregtime;
    }

    public  String getAccountregtime() {
        return accountregtime;
    }

    public void setServertype( String  servertype) {
        this.servertype = servertype;
    }

    public  String getServertype() {
        return servertype;
    }

    public void setIzoneareaid( String  izoneareaid) {
        this.izoneareaid = izoneareaid;
    }

    public  String getIzoneareaid() {
        return izoneareaid;
    }

    public void setGamesvrid( String  gamesvrid) {
        this.gamesvrid = gamesvrid;
    }

    public  String getGamesvrid() {
        return gamesvrid;
    }

    public void setNowcoordinate( String  nowcoordinate) {
        this.nowcoordinate = nowcoordinate;
    }

    public  String getNowcoordinate() {
        return nowcoordinate;
    }

    public void setVroleid( String  vroleid) {
        this.vroleid = vroleid;
    }

    public  String getVroleid() {
        return vroleid;
    }

    public void setVrolename( String  vrolename) {
        this.vrolename = vrolename;
    }

    public  String getVrolename() {
        return vrolename;
    }

    public void setRolenum( Integer  rolenum) {
        this.rolenum = rolenum;
    }

    public  Integer getRolenum() {
        return rolenum;
    }

    public void setRoletype( String  roletype) {
        this.roletype = roletype;
    }

    public  String getRoletype() {
        return roletype;
    }

    public void setRolecreatetime( String  rolecreatetime) {
        this.rolecreatetime = rolecreatetime;
    }

    public  String getRolecreatetime() {
        return rolecreatetime;
    }

    public void setIlevel( Integer  ilevel) {
        this.ilevel = ilevel;
    }

    public  Integer getIlevel() {
        return ilevel;
    }

    public void setIviplevel( Integer  iviplevel) {
        this.iviplevel = iviplevel;
    }

    public  Integer getIviplevel() {
        return iviplevel;
    }

    public void setIrolece( Integer  irolece) {
        this.irolece = irolece;
    }

    public  Integer getIrolece() {
        return irolece;
    }

    public void setHighestrolepower( Integer  highestrolepower) {
        this.highestrolepower = highestrolepower;
    }

    public  Integer getHighestrolepower() {
        return highestrolepower;
    }

    public void setPlayerfriendsnum( Integer  playerfriendsnum) {
        this.playerfriendsnum = playerfriendsnum;
    }

    public  Integer getPlayerfriendsnum() {
        return playerfriendsnum;
    }

    public void setRechargesum( String  rechargesum) {
        this.rechargesum = rechargesum;
    }

    public  String getRechargesum() {
        return rechargesum;
    }

    public void setIguildid( Integer  iguildid) {
        this.iguildid = iguildid;
    }

    public  Integer getIguildid() {
        return iguildid;
    }

    public void setVguildname( String  vguildname) {
        this.vguildname = vguildname;
    }

    public  String getVguildname() {
        return vguildname;
    }

    public void setGuildgrade( String  guildgrade) {
        this.guildgrade = guildgrade;
    }

    public  String getGuildgrade() {
        return guildgrade;
    }

    public void setGuildclass( String  guildclass) {
        this.guildclass = guildclass;
    }

    public  String getGuildclass() {
        return guildclass;
    }

    public void setPlatid( Integer  platid) {
        this.platid = platid;
    }

    public  Integer getPlatid() {
        return platid;
    }

    public void setGamelanguage( String  gamelanguage) {
        this.gamelanguage = gamelanguage;
    }

    public  String getGamelanguage() {
        return gamelanguage;
    }

    public void setVclientid( String  vclientid) {
        this.vclientid = vclientid;
    }

    public  String getVclientid() {
        return vclientid;
    }

    public void setVclientipv6( String  vclientipv6) {
        this.vclientipv6 = vclientipv6;
    }

    public  String getVclientipv6() {
        return vclientipv6;
    }

    public void setKillnum( String  killnum) {
        this.killnum = killnum;
    }

    public  String getKillnum() {
        return killnum;
    }

    public void setClientversion( String  clientversion) {
        this.clientversion = clientversion;
    }

    public  String getClientversion() {
        return clientversion;
    }

    public void setMoneyconfig( Integer  moneyconfig) {
        this.moneyconfig = moneyconfig;
    }

    public  Integer getMoneyconfig() {
        return moneyconfig;
    }

    public void setTransferornot( Integer  transferornot) {
        this.transferornot = transferornot;
    }

    public  Integer getTransferornot() {
        return transferornot;
    }

    public void setDteventtime( String  dteventtime) {
        this.dteventtime = dteventtime;
    }

    public  String getDteventtime() {
        return dteventtime;
    }

    public void setSystemsoftware( String  systemsoftware) {
        this.systemsoftware = systemsoftware;
    }

    public  String getSystemsoftware() {
        return systemsoftware;
    }

    public void setSystemhardware( String  systemhardware) {
        this.systemhardware = systemhardware;
    }

    public  String getSystemhardware() {
        return systemhardware;
    }

    public void setMemory( Integer  memory) {
        this.memory = memory;
    }

    public  Integer getMemory() {
        return memory;
    }

    public void setGlversion( String  glversion) {
        this.glversion = glversion;
    }

    public  String getGlversion() {
        return glversion;
    }

    public void setDeviceid( String  deviceid) {
        this.deviceid = deviceid;
    }

    public  String getDeviceid() {
        return deviceid;
    }

    public void setAccountname( String  accountname) {
        this.accountname = accountname;
    }

    public  String getAccountname() {
        return accountname;
    }
    @Override
    public TaDataDo transFrom(String s, String s1) {
        String[] split = s.split("\\|");
        TaDataDo taDataDo = new TaDataDo();
        //parse
        CncOnlineCnt cncOnlineCnt = new CncOnlineCnt();
//        cncOnlineCnt.setServerType(split[0]);
//        cncOnlineCnt.setIZoneAreaId(split[1]);
//        cncOnlineCnt.setServerOpenTime(DateUtil.parseDateString(split[2]));
//        cncOnlineCnt.setServerOpenTimeFar(Long.valueOf(split[3]));
//        cncOnlineCnt.setServerOnline(Long.valueOf(split[4]));
//        cncOnlineCnt.setServerCondition(split[5]);
//        cncOnlineCnt.setServerMilestoneStage(split[6]);
//
//        cncOnlineCnt.setDtEventTime(split[7]);
//        cncOnlineCnt.setVGameAppid(split[8]);
//        cncOnlineCnt.setTimeKey(split[9]);
//        cncOnlineCnt.setOnlinecntIos(split[10]);
//        cncOnlineCnt.setOnlinecntAndroid(Long.valueOf(split[11]));
//
//        taDataDo.setAccountId(cncOnlineCnt.getOnlinecntAndroid());
//        taDataDo.setTime(DateUtil.parseDateString(cncOnlineCnt.getDtEventTime()));
//        taDataDo.setEventName("CncOnlineCnt");
//        taDataDo.setPropertyObj(JSON.parseObject(JSON.toJSONString(cncOnlineCnt)));
        return taDataDo;
    }


}
