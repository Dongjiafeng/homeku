package com.homework.h1;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;

public class Login {
    public static void Login1(String username, String  password) throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("src/users.xml"));
        Element root = document.getRootElement();



    }
}
