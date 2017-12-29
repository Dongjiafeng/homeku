import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.security.auth.kerberos.KerberosKey;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Main2 {
	public static void main(String[] args){
	//	System.out.println("1");
/*
 * while 循环
 * 先判定括号中的内容,是否为true
 * 如果为ture则执行
 * 大括号里面的内容,然后
 * 在判断括号里的内容是否为true,
 * 如果.... 一遍遍
 *   当括号内容为false时
 *   while循环停止
 */
		int i = 51;
		
		
		while(i<50 );
		{
			//大括号中的内容叫做循环体
//			小括号的内容叫做循环条件
			System.out.println(i);
			//循环增量
			//为了跳出循环,防止出现死循环
			//i = i+1;
			//i++;
//			++i;
//			i = i*7;
			i*=7;
			
		}
		int progress = 1;
		do{
			progress+=2;
			System.out.println(progress);
		}while(progress<10);
		/*
		 * do-while 与 while的区别
		 * do-while 是先执行一次循环体,然后在判断
		 * while是先判断然后在执行的循环体
		 */
		
		int b = 1000;
		while(b<100){
			System.out.println("好好学习天天向上");
			b++;
		}
	/*
	 * int o = 0;设置初始条件
	 * k<100;循环条件
	 * k++;循环增量
	 * {}中的内容:循环 体
	 */
		for(int o = 1000;o<100;o++){
			System.out.println("大吉大利,晚上吃鸡!");
		}
		//下面这两个一样的
//		while(true){
//			
//		}
//		for(;;){
//			
//		}
		int f = 0;
		for(;f<10;f++){
			
		}
		for(;f<10;f+=5){
			
		}
		//固定格式,就是一个工具
		Scanner input = new Scanner(System.in);
		//下面这句话,会得到控制台输入的内容
		//我们建立一个变量去接收得到的内容
		//String c = input.nextLine();
	//	System.out.println("我们得到了c:"+c);
		/*
		 * import
		 * Scanner
		 * Console
		 */
		System.out.println("请输入五门课成绩:");
//		定义一个变量来存储
		int sum = 0;
		
	
	for(int g=1;g<6;g++){
		
		//String t = input.nextLine();
		System.out.println("第"+g+"门:");
		int k = input.nextInt();
		sum+=k;
		System.out.println("第"+g+"门"+"的成绩为:"+k);
	}
	int pingjun = sum/5;
	System.out.println("五门的平均值是:"+pingjun);
 }
}
