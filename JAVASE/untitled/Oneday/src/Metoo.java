import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;
import Exception.Metooexception;

public class Metoo {
   public static void show(String username) throws DocumentException, Metooexception {
       SAXReader saxReader = new SAXReader();
       Document document =saxReader.read(new File("src/Date.xml"));
       Element rootElement = document.getRootElement();
       List<Element> elements = rootElement.elements();

       for (Element e:elements
            ) {
           if (username.equals(e.attribute("usename").getValue())){
               throw new Metooexception();

//               System.out.println("已有人使用该名注册");
           }

       }

   }



}
