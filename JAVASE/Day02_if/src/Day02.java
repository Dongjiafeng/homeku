import javax.print.attribute.standard.PrinterLocation;

public class Day02 {
 public static void main(String[] args){
//	 定义一个变量,表示你的java成绩
	 int javaScore = 
			 50;
	 if(javaScore>90){
		 System.out.println("成绩优秀");
		 
	 }
	 if(javaScore>700){
		 System.out.println("厉害了厉害了,小兄弟.");
	 }else {
		System.out.println("不好意思,滚去重读.");
	}
//	 当要执行的语句只有一条时
//	 if语句后面可以不写{}
	 if(javaScore<60)
		 System.out.println("你就回家种田");
//	 当成绩大于80并且小于100的时候
//	 会进入{}中执行语句
//	 同时成立则执行
//	 &&:当左侧判断条件不成立时,不会判断右侧条件
//	 &:当左侧判断条件不成立时,
//	 依然会判断右侧条件
	 if(javaScore>80 &&
			 javaScore<100){
		 System.out.println("没毛病,老铁");
		 
	 }
//	 ||和|
	 if(javaScore>60|| javaScore<90){
//		 左右表达式,只有一个为true
//		 那么if判断的结果就是true
		 /*
		  * ||如果左侧为true,则不会判断右侧
		  * 
		  * |:不管左侧是什么,都会判断右侧.
		  */
	 }
	 if(!(javaScore<60)){
//		 !:非 !true = flase
//		    !false = true 
		 System.out.println("说明>=60");
		 
	 }
//	 如何交换两个变量的值?
	int a =10;
	int b =20;
//	第一种方法
/*
 * 第一种方法
 * 1.定义一个新的变量c
 * 2.将a的值赋值给c
 * 3.将b的值赋值给a
 * 4.将c的值赋值给b
 */
	int c = a;
	a=b;
	b=c;
	System.out.println("a:"+a);
	System.out.println("b:"+b);
/*
 * 第二种方法
 * 不适用变量,直接使用加减法运算
 */
	a = a+b;
	b = a-b;
	a = a-b;
	/*
	 * 第三种方法
	 * 不使用第三方变量,使用异或^
	 * 一个数异或另一个数两次,结果还是这个数
	 * 5^6^6 = 5
	 * |操作2进制
	 * 有一个是1,则结果就是1
	 * ^异或操作二进制
	 * 两者不相等,则为1,相等则为0
	 * 也就是不同时为1或0
	 */
	System.out.println(26^23^23);
	a = a ^ b;
	b = a ^ b;
	a = a ^ b;
	if(javaScore>=60&&javaScore<=80){
		System.out.println("中等");
	}else if(javaScore>=80){
		System.out.println("优秀");
	}else {
		System.out.println("差");
	}
	int speed = 15;
	
	int gender = 0;
	
	if(speed>10){
		System.out.println("进决赛");
		if(gender==0){
			System.out.println("进入男生组");
		}else if(gender==1){
			System.out.println("进入女生组");
		}else{
			System.out.println("人妖太猛了,pass");
		}
	}
 }
}
