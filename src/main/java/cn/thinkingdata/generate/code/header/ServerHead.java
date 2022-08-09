package cn.thinkingdata.generate.code.header;

import lombok.Data;

import java.util.Date;

@Data
public class ServerHead {

    private String ServerType;
    private String IZoneAreaId;
    private Date ServerOpenTime;
    private Long ServerOpenTimeFar;
    private Long ServerOnline;
    private String ServerCondition;
    private String ServerMilestoneStage;
}
