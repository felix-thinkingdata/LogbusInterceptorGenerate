package cn.thinkingdata.generate.code.service;

import cn.thinkingdata.generate.GenUtils;
import cn.thinkingdata.generate.code.domain.EntryDO;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.InputStream;
import java.util.*;

public class XMLMetaService {

    private static int index = 0;

    HashMap<String, LinkedList<EntryDO>> headMaps = new HashMap();

    public LinkedList<EntryDO> getAllEntries(String structName) throws DocumentException {
        LinkedList<EntryDO> entryList = new LinkedList<>();
        parserXml(structName, entryList);
        return entryList;
    }

    public Map<String, LinkedList<EntryDO>> getEntriesListFromFile(String fileName) throws DocumentException {
        Map<String, LinkedList<EntryDO>> entriesMap = new HashMap<>();
        parserXmlFromFile(fileName, entriesMap);
        return entriesMap;
    }

    public void init() throws DocumentException {
        File[] files = (new File("src/main/resources/head")).listFiles();
        for (File file : files) {
            if (file.getName().endsWith(".xml")) {
                try {
                    String filename = file.getName();
                    LinkedList<EntryDO> entries = getAllEntries("head/" + filename);
                    headMaps.put(filename.substring(0, filename.indexOf(".xml")), entries);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void parserXml(String fileName, LinkedList<EntryDO> entryList) throws DocumentException {
        InputStream in = this.getClass().getClassLoader().getResourceAsStream(fileName);
        SAXReader reader = new SAXReader();
        Document doc = reader.read(in);
        Element root = doc.getRootElement();
        index = 0;
        readNode(root, entryList);
    }

    private void parserXmlFromFile(String fileName, Map<String, LinkedList<EntryDO>> entriesMap) throws DocumentException {
        InputStream in = this.getClass().getClassLoader().getResourceAsStream(fileName);
        SAXReader reader = new SAXReader();
        Document doc = reader.read(in);
        Element root = doc.getRootElement();
        List<Element> elements = root.elements("struct");
        for (Element element : elements) {
            index = 0;
            if ("struct".equals(element.getName())) {
                String classname = "";
                List<Attribute> attrs = element.attributes();
                for (Attribute attr : attrs) {
                    if (attr.getName().equalsIgnoreCase("name")) {
                        classname = attr.getValue();
                    }
                }

                LinkedList<EntryDO> entryList = new LinkedList<>();
                readNode(element, entryList);
                entriesMap.put(classname,entryList);
            }
        }
        //readNode(root, entriesList);
    }

    public void readNode(Element root, LinkedList<EntryDO> entryList) {
        if (root == null) {
            return;
        }

        // ????????????
        List<Attribute> attrs = root.attributes();
        if (attrs != null && attrs.size() > 0) {
            if ("entry".equals(root.getName())) {
                EntryDO entryDO = new EntryDO();
                for (Attribute attr : attrs) {
                    if ("name".equals(attr.getName())) {
                        entryDO.setColumnName(attr.getValue());
                    }
                    if ("type".equals(attr.getName())) {
                        LinkedList<EntryDO> headList = headMaps.get(attr.getValue());
                        if (headList != null) {
                            index = index + headList.size() - 1;
                            entryList.addAll(headList);
                        } else {
                            entryDO.setDataType(attr.getValue());
                            entryDO.setIndex(index);
                            entryList.add(entryDO);
                        }
                    }
                }
            }
        }

        // ?????????????????????
        List<Element> childNodes = root.elements();
        for (Element e : childNodes) {
            readNode(e, entryList);
        }
        index++;
    }


}
