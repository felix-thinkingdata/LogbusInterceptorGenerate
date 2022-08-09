package cn.thinkingdata.generate.code;

import cn.thinkingdata.generate.code.header.ServerHead;
import cn.thinkingdata.generate.utils.DateUtil;
import cn.thinkingdata.ta.interceptor.CustomInterceptor;
import cn.thinkingdata.ta.interceptor.data.TaDataDo;
import com.alibaba.fastjson.JSON;
import lombok.Data;

@Data
public class CncOnlineCnt extends ServerHead implements CustomInterceptor {
    private String DtEventTime;
    private String VGameAppid;
    private String TimeKey;
    private String OnlinecntIos;
    private Long OnlinecntAndroid;


    @Override
    public TaDataDo transFrom(String s, String s1) {
        String[] split = s.split("\\|");
        TaDataDo taDataDo = new TaDataDo();
        //parse
        CncOnlineCnt cncOnlineCnt = new CncOnlineCnt();
        cncOnlineCnt.setServerType(split[0]);
        cncOnlineCnt.setIZoneAreaId(split[1]);
        cncOnlineCnt.setServerOpenTime(DateUtil.parseDateString(split[2]));
        cncOnlineCnt.setServerOpenTimeFar(Long.valueOf(split[3]));
        cncOnlineCnt.setServerOnline(Long.valueOf(split[4]));
        cncOnlineCnt.setServerCondition(split[5]);
        cncOnlineCnt.setServerMilestoneStage(split[6]);

        cncOnlineCnt.setDtEventTime(split[7]);
        cncOnlineCnt.setVGameAppid(split[8]);
        cncOnlineCnt.setTimeKey(split[9]);
        cncOnlineCnt.setOnlinecntIos(split[10]);
        cncOnlineCnt.setOnlinecntAndroid(Long.valueOf(split[11]));

        taDataDo.setAccountId(cncOnlineCnt.getOnlinecntAndroid());
        taDataDo.setTime(DateUtil.parseDateString(cncOnlineCnt.getDtEventTime()));
        taDataDo.setEventName("CncOnlineCnt");
        taDataDo.setPropertyObj(JSON.parseObject(JSON.toJSONString(cncOnlineCnt)));
        return taDataDo;
    }


}
