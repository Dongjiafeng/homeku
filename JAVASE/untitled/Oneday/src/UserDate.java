
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public  class UserDate {
       static   Document document = null;
        static SAXReader saxReader = new SAXReader();
    public static void bbq(Person person) throws IOException, DocumentException {

        document = saxReader.read(new File("src/Date.xml"));
//        Element element = document.addElement("persons");
//        Element element1 = element.addElement("person");
        Element rootElement = document.getRootElement();
        Element element = rootElement.addElement("person");
        element.addAttribute("name",person.getName());
        element.addAttribute("usename",person.getUsername());
        element.addAttribute("password",person.getPassword());
        element.addAttribute("job",person.getJob());
        OutputFormat compactFormat = OutputFormat.createPrettyPrint();
        compactFormat.setEncoding("utf-8");
        XMLWriter xmlWriter = new XMLWriter(new FileWriter("src/Date.xml"),compactFormat);
        xmlWriter.write(UserDate.document);
        xmlWriter.close();
        System.out.println("注册成功");



    }

}
