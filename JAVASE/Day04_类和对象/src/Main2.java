import java.util.regex.Matcher;

public class Main2 {
public static void main(String[] args) {

	Father father = new Father();
	Mother mother = new Mother();
	Child child = new Child();
	//使用对象,调用它的方法去做一些事情
	//对象名.方法名();
	father.showInfo();
	mother.showInfo();
	child.showInfo();
	//对象名.属性
	System.out.println(father.name);
	Student student = new Student();
	//对象名.属性名 = 属性值;
	//这是一个赋值过程
	student.name ="王老六";
	student.school = ("蓝鸥科技欢迎你");
	System.out.println(student.name);
	//调用play这个方法	
	student.play();
	student.买外卖(100);
	//这个方法是有返回值得
	//返回值得类型为String 
	//的变量去接收这个方法的返回值
	String f      = 	 student.hot("冷面");
	System.out.println(f);
}
}


