import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class UserOpern {
    public static void register(Person person) throws IOException, DocumentException {
        UserDate.bbq(person);


    }

    public static void Login(String username, String password) throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document read = saxReader.read(new File("src/Date.xml"));
        Element rootElement = read.getRootElement();
        List<Element> person = rootElement.elements("person");

        int i = 0;
        for (Element e :
                person) {
            Attribute attribute = e.attribute("usename");
            Attribute password1 = e.attribute("password");

            if (username.equals(attribute.getValue()) && password.equals(password1.getValue())) {
                i =1;
                System.out.println("登陆成功");
            }

        }

        if (i == 0){
            System.out.println("你的帐号密码不正确");
        }
//        System.out.println("你的帐号密码不正确");





    }
}
