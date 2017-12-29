
public class Student {
	//这三行都叫属性
	//现在这三个属性还没有值呢
	String name;
	String school;
	int id ;
	
	
	public void play(){
		System.out.println(name+"玩游戏去了");
	}
	
	public void goToStudy(){
		System.out.println(name+"");
	}
	/*
	 * public 权限修饰符
	 * void   返回值类型
	 *         没有返回值
	 * show    方法名  
	 * (String str)  参数列表 ,可以有多个参数的
	 *   			String 是参数的类型
	 *   					对于类型的内容
	 *   			str    是参数的名字  
	 *   					是任意的,想怎么写就怎么写
	 *   					但需要建名之意
	 *   			
	 * {}     方法体:当这个方法被调用时,要执行的代码
	 */
	public void show(String str){
		 
	}
	public void 买外卖(int money){
		System.out.println("拿着老师的钱"+money+"去打游戏了");
	}
	//pulic 后面的这个String 
	//表示返回值的类型是String ,是字符串.
	public String hot(String food){
		return "加热的"+food;
	}
}
