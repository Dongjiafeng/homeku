package com.lanou3g.study;

import com.lanou3g.study.Student;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    static SAXReader saxReader = new SAXReader();
    static Document document = null;

    public static void main(String[] args) throws DocumentException {
        document = saxReader.read(new File("src/data.xml"));
        List<Student> students = listElement();
        System.out.println(
                Arrays.toString(students.toArray())
        );
        //listElement();
        // allEles(document.getRootElement());


    }

    public static void allEles(Element e) {
        List<Attribute> attributes = e.attributes();
        List<Element> elements = e.elements();
        for (int i = 0; i < attributes.size(); i++) {
            //这特么啥意思
            Attribute attr = attributes.get(i);
            System.out.println("属性名:" + attr.getName() + "属性值:" + attr.getValue());

        }
        String text = e.getText();
        System.out.println("当前元素的文本为:" + text);
        List<Element> elements1 = e.elements();
        //如果没有子标签,则结束这个方法
        if (elements.size() == 0) {
            return;
        }
        for (int i = 0; i < elements.size(); i++) {
            //获得第i个子标签
            Element ele = elements.get(i);
            //扔到allEles这个方法中
            allEles(ele);

        }
    }

    private static List<Student> listElement() throws DocumentException {

        Element rootElement = document.getRootElement();
        List<Element> student = rootElement.elements("student");
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < student.size(); i++) {
            Element ele = student.get(i);
            Student stu = new Student();

            Attribute name = ele.attribute("name");
            //获得name属性的值
            String namevalue = name.getValue();
            //设置到stu这个对象中
            stu.setName(namevalue);
            //拿到score标签
            Element score = ele.element("score");
            //拿到score标签中的文本
           String text = score.getText();
            //"10001"--->1001
            stu.setScore(Integer.parseInt(text));
            students.add(stu);


            System.out.println("学生名为:" + namevalue + "\t" + "分数:" + text);
        }
        return students;
    }

}
