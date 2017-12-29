package com.lanou3g.study.normal;

import java.util.Random;

public class RandDemo {
public static void main(String[] args) {
	
	//取一个随机数
	//需要用到Random这个工具类
	Random random = new Random();
	int r =random.nextInt();
	System.out.println(r);
	//取一个30 -45之间的随机数
	//取一个0 - 10 之间的随机数
	int e  = random.nextInt(10);
//	nextInt(bound)接收的参数
	
	
	//是一个左闭有开的[0 , 10)
	e = random.nextInt(45-30+1)+30;
//	3.取一个true或false
	for(int i = 0;i<60;i++){
	boolean b = random.nextBoolean();
	System.out.println(b);
}
}
}
