package com.homework.h1;

import com.homework.exception.ChongmingException;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class Chongming {
    public  static void show(String username) throws ChongmingException, DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document =saxReader.read(new File("src/users.xml"));
        Element rootElement = document.getRootElement();
        List<Element> elements = rootElement.elements();

        for (Element e:elements
                ) {
            if (username.equals(e.attribute("usename").getValue())){
                throw new ChongmingException();


            }

        }
    }
}
