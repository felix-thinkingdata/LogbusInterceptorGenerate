package cn.thinkingdata.generate.code.domain;

public class EntryDO {

    // 列名
    private String columnName;
    // 列名类型
    private String dataType;


    // 属性名称(第一个字母大写)，如：user_name => UserName
    private String attrName;
    // 属性名称(第一个字母小写)，如：user_name => userName
    private String attrname;
    // 属性类型
    private String attrType;

    private Boolean structFlag;
}
