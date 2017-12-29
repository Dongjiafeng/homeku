
public class Fuck {
	public static void main(String[] args) {
		
//		我是注释
		/*
		 * 我是多行注释
		 */
		/**
		 * 我是文档注释
		 */
		System.out.println("第二个java程序");
//		定义一个变量
//		这个变量的值是18
//		18是内存中的,我们如果使用
//		内存地址去找18的话,太费劲了
//		所以我们是用一个变量去找到他
//		age就暗示变量名
		int age = 18;
		/*
		 *下面这行代码,就会将括号中的内容
		 *输出到控制台
		 *输出的是18,不是age
		 *因为会根据age这个变量,找到到18这个值
		 */
		System.out.println(age);
		
		double score = 91.72;
		
		int increment = 2;
		
		double secondScore = score + increment; 
		
		int d = 1;
		long l = d;
		/*
		 * 强制转换:
		 * 将long类型的l强制转换成int类型的i
		 * 简称强转
		 */
		int i =  (int) l;
//		定义一个字符
		char c = 'a';
		
//		使用int类型的变量ic接收c的值
//		ASCII表中的值
		int ic = c;
		System.out.println(ic);
		
		int ii;
		double dd;
		dd =5.56;
		char cc;
		cc = 'm';
		
//		字符串
//		一块羊肉,多块羊肉就是羊肉串
//		多个字符串起来就是字符串
		
		String yourName = "托儿所";
//		初始化:给一个变量赋值的过程
//		如果只创建了变量,但是没有给这个变量赋值,那么这个编程就叫
//		声明  String myName 这就叫声明
		System.out.println(yourName);
		
		int big = 5;
		/*
		 * big是int类型
		 * 2页是int类型
		 * 所以big/2得到的也是int类型
		 * 就会将2.5取整,得到2
		 * 
		 * big是int类型
		 * 2.0是浮点型
		 * 这时候得到的big/2.0就是带小数的浮点数
		 * 也就是2.5
		 */
		double result = big/2.0;
		System.out.println(result);
		
		int high = 180;
//		让这个变量,自增
//		自加1
//		效果同等:high = high + 1
		high++;
		System.out.println(high);
		
		
		
		
	}

}
