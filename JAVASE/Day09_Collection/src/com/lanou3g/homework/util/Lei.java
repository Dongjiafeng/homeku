package com.lanou3g.homework.util;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;

public class Lei {

    public static  void show(String names,String usern,String usern1,String usern2) throws DocumentException {
        SAXReader reader =new SAXReader();
        Document document = null;
        document = reader.read(new File("src/output"));

        Element person = document.getRootElement();
        person.addText(names+" "+usern+" "+usern1+" "+usern2);




    }
}
