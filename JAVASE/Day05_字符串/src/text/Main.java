package text;

public class Main {
	public static void main(String[] args){
		
		Student s = new Student();
		Student stu = new Student();
//		s.name = "张三";
		//通过getName方法,
		//拿到s对象的name属性
		String name = s.getName();
		//当执行setName方法时,就将这个字
		//传给了参数列表中的参数n
		name = stu.getName();
		System.out.println("改制前:"+name);
		stu.setName("她师妹");
		name = stu.getName();
		System.out.println("改制后:"+name);
		
//		System.out.println(name);
		
		
		
		//得到sad 方法执行的结果
		//把这个结果赋值给了result这个变量
		String result = s.sad();
		//输出
		System.out.println(result);
	}
}
