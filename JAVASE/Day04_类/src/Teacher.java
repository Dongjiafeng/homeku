

public class Teacher {
	int age;
	String school;
	String name;
	int id;
	
	public void showInfo(){
		System.out.println("不带参数,不带返还值");
	}
	
	public void eat(int money){
		 System.out.println("不带返回值,带参数"+money);
	}
	public String sleep(){
		
		return "带返回值,不带参数";
		
	}
	public void walk(String place){
		System.out.println("不带返回值,带参数的"+place);
	}

}
