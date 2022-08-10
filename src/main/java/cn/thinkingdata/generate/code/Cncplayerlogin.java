package cn.thinkingdata.generate.code;

import cn.thinkingdata.generate.code.header.ServerHead;
import cn.thinkingdata.generate.utils.DateUtil;
import cn.thinkingdata.ta.interceptor.CustomInterceptor;
import cn.thinkingdata.ta.interceptor.data.TaDataDo;
import com.alibaba.fastjson.JSON;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author felix
 * @email felix@thinkingdata
 */
public class Cncplayerlogin  implements CustomInterceptor{
        private static final Logger logger=LoggerFactory.getLogger(Cncplayerlogin.class);

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

        public void setMemory( Integer  memory){
                this.memory = memory;
        }

        public  Integer getMemory(){
                return memory;
        }

        public void setGlversion( String  glversion){
                this.glversion = glversion;
        }

        public  String getGlversion(){
                return glversion;
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
        public TaDataDo transFrom(String s,String s1){
                String[]split=s.split("\\|");
                //parse
                Cncplayerlogin cncplayerlogin =new Cncplayerlogin();
                cncplayerlogin.setGameappid(  split[0]);
                cncplayerlogin.setVopenid(  split[1]);
                cncplayerlogin.setAccountcreatetime(  split[2]);
                cncplayerlogin.setAccountregtime(  split[3]);
                cncplayerlogin.setServertype(  split[4]);
                cncplayerlogin.setIzoneareaid(  split[5]);
                cncplayerlogin.setGamesvrid(  split[6]);
                cncplayerlogin.setNowcoordinate(  split[7]);
                cncplayerlogin.setVroleid(  split[8]);
                cncplayerlogin.setVrolename(  split[9]);
                cncplayerlogin.setRolenum(  Integer.valueOf(split[10]));
                cncplayerlogin.setRoletype(  split[11]);
                cncplayerlogin.setRolecreatetime(  split[12]);
                cncplayerlogin.setIlevel(  Integer.valueOf(split[13]));
                cncplayerlogin.setIviplevel(  Integer.valueOf(split[14]));
                cncplayerlogin.setIrolece(  Integer.valueOf(split[15]));
                cncplayerlogin.setHighestrolepower(  Integer.valueOf(split[16]));
                cncplayerlogin.setPlayerfriendsnum(  Integer.valueOf(split[17]));
                cncplayerlogin.setRechargesum(  split[18]);
                cncplayerlogin.setIguildid(  Integer.valueOf(split[19]));
                cncplayerlogin.setVguildname(  split[20]);
                cncplayerlogin.setGuildgrade(  split[21]);
                cncplayerlogin.setGuildclass(  split[22]);
                cncplayerlogin.setPlatid(  Integer.valueOf(split[23]));
                cncplayerlogin.setGamelanguage(  split[24]);
                cncplayerlogin.setVclientid(  split[25]);
                cncplayerlogin.setVclientipv6(  split[26]);
                cncplayerlogin.setKillnum(  split[27]);
                cncplayerlogin.setClientversion(  split[28]);
                cncplayerlogin.setMoneyconfig(  Integer.valueOf(split[29]));
                cncplayerlogin.setTransferornot(  Integer.valueOf(split[30]));
                cncplayerlogin.setDteventtime(  split[32]);
                cncplayerlogin.setSystemsoftware(  split[33]);
                cncplayerlogin.setSystemhardware(  split[34]);
                cncplayerlogin.setMemory(  Integer.valueOf(split[35]));
                cncplayerlogin.setGlversion(  split[36]);
                cncplayerlogin.setDeviceid(  split[37]);
                cncplayerlogin.setAccountname(  split[38]);

                TaDataDo taDataDo=new TaDataDo();
                taDataDo.setPropertyObj(JSON.parseObject(JSON.toJSONString(cncplayerlogin)));
                return taDataDo;

        }

        public static void main(String[] args) {
                String data="CncPlayerLogin||5c42e476e00d433bb7d61c9fe40723c9|||null|1|1||32089626189|Commander_LszSP3|5|1|2022-08-05 06:31:38|25|0|67667086|67667086|0|xxx|0|xxx|xxx|xxx|2|zh|58.34.218.250||0||0|0|2022-08-08 12:01:11|Windows 10 (10.0.19041) 64bit|OptiPlex 7080 (Dell Inc.)|65249|3001|b064267bb37b28b4093b59ccc98873aea972a3d2|james";
                Cncplayerlogin xxx = new Cncplayerlogin();
                TaDataDo taDataDo =  xxx.transFrom(data,"");

                System.out.println(JSON.toJSONString(taDataDo));
        }

}
