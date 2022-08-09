package cn.thinkingdata.generate.code.domain;

import lombok.Data;

import java.util.List;

@Data
public class StructDO {

    //表的名称
    private String StructName;
    //表的列名(不包含主键)
    private List<EntryDO> columns;

    //类名(第一个字母大写)，如：sys_user => SysUser
    private String className;
    //类名(第一个字母小写)，如：sys_user => sysUser
    private String classname;
}
