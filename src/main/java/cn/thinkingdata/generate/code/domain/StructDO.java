package cn.thinkingdata.generate.code.domain;

import lombok.Data;

import java.util.List;

public class StructDO {

    //表的名称
    private String StructName;
    //表的列名(不包含主键)
    private List<EntryDO> columns;

    //类名(第一个字母大写)，如：sys_user => SysUser
    private String className;
    //类名(第一个字母小写)，如：sys_user => sysUser
    private String classname;


    public String getStructName() {
        return StructName;
    }

    public void setStructName(String structName) {
        StructName = structName;
    }

    public List<EntryDO> getColumns() {
        return columns;
    }

    public void setColumns(List<EntryDO> columns) {
        this.columns = columns;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}
