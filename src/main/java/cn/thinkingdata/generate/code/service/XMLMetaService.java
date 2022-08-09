package cn.thinkingdata.generate.code.service;

import com.alibaba.fastjson.JSON;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;

public class XMLMetaService {

    public static void main(String[] args) throws DocumentException {
        new XMLMetaService().getAllEntrys("x");
    }

    public LinkedHashMap<String, String> getAllEntrys(String structName) throws DocumentException {
        LinkedHashMap entryMap = new LinkedHashMap();
        parserXml("CncPlayerLogin.xml", entryMap);
        entryMap = new LinkedHashMap();
        parserXml("ClanHead.xml", entryMap);
        entryMap = new LinkedHashMap();
        parserXml("PlayerHead.xml", entryMap);
        entryMap = new LinkedHashMap();
        parserXml("ServerHead.xml", entryMap);
        return entryMap;
    }

    private void parserXml(String fileName, LinkedHashMap entryMap) throws DocumentException {

        InputStream in = this.getClass().getClassLoader().getResourceAsStream(fileName);
        SAXReader reader = new SAXReader();
        Document doc = reader.read(in);
        Element root = doc.getRootElement();
        readNode(root, entryMap);
        System.out.println(JSON.toJSONString(entryMap));


    }

    public void readNode(Element root, LinkedHashMap entryMap) {
        if (root == null) {
            return;
        }
        String entryName = null;
        String entryType = null;
        // 获取属性
        List<Attribute> attrs = root.attributes();
        if (attrs != null && attrs.size() > 0) {

            for (Attribute attr : attrs) {
                if ("entry".equals(root.getName())) {
                    if ("name".equals(attr.getName())) {
                        entryName = attr.getValue();
                    }
                    if ("type".equals(attr.getName())) {
                        entryType = attr.getValue();
                    }
                }
            }
        }
        entryMap.put(entryName, entryType);
        // 获取他的子节点
        List<Element> childNodes = root.elements();
        for (Element e : childNodes) {
            readNode(e, entryMap);
        }
    }


}
