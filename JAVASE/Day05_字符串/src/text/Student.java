package text;

public class Student {
	//封装
	private String name = "天山童姥";
	
	//暴露出一个公共的去设置/去获得
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	
	public  void smile(){
		System.out.println("心里是乐开了");
		
	}
	protected void cry(){
		System.out.println("哭的像一个可怜人");
	}
	private void angry(){
	System.out.println("气的像一只dog");
	}
	 String sad(){
		return "爱是一道光";
	}
}
