package cn.thinkingdata.generate.code.service;

import cn.thinkingdata.generate.code.domain.EntryDO;
import com.alibaba.fastjson.JSON;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class XMLMetaService {

    private static int index = 0;

    public static void main(String[] args) throws DocumentException {
        new XMLMetaService().getAllEntrys("x");
    }

    public LinkedList<EntryDO> getAllEntrys(String structName) throws DocumentException {
        LinkedList<EntryDO> entryList = new LinkedList<EntryDO>();
        parserXml(structName, entryList);
        return entryList;
    }

    private void parserXml(String fileName, LinkedList<EntryDO> entryList) throws DocumentException {

        InputStream in = this.getClass().getClassLoader().getResourceAsStream(fileName);
        SAXReader reader = new SAXReader();
        Document doc = reader.read(in);
        Element root = doc.getRootElement();
        index = 0;
        readNode(root, entryList);
        System.out.println(JSON.toJSONString(entryList));


    }

    public void readNode(Element root, LinkedList<EntryDO> entryList) {
        if (root == null) {
            return;
        }

        // 获取属性
        List<Attribute> attrs = root.attributes();
        if (attrs != null && attrs.size() > 0) {
            if ("entry".equals(root.getName())) {
                EntryDO entryDO = new EntryDO();
                entryDO.setIndex(index);

                for (Attribute attr : attrs) {

                    if ("name".equals(attr.getName())) {
                        entryDO.setColumnName(attr.getValue());
                    }
                    if ("type".equals(attr.getName())) {
                        entryDO.setDataType(attr.getValue());
                    }
                }
                entryList.add(entryDO);
            }

        }

        // 获取他的子节点
        List<Element> childNodes = root.elements();
        for (Element e : childNodes) {
            readNode(e, entryList);
        }
        index++;
    }


}
