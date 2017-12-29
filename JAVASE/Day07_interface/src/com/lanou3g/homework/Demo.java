package com.lanou3g.homework;

import java.util.Scanner;

public class Demo {
	Dog xiaogou = new Dog();
	Penguin qie = new Penguin();
	public static void main(String[] args) {
		

	Scanner input = new Scanner(System.in);
	System.out.println("请输入宠物名称:");
	
	String pet = input.nextLine();	
	
	System.out.println("请选择宠物类型: " );
	
	System.out.println("1.狗狗    2.企鹅");
	int poodle = input.nextInt();
	switch(poodle){
	case 1:
		System.out.println("请选择你狗狗的品种:");
		System.out.println("1.聪明的拉布拉多犬    2.酷酷的雪纳瑞");
		int breed = input.nextInt();
		
		break;
		
	case 2:
		System.out.println("请选择你企鹅的类别:");
		System.out.println("1.Q仔   2.Q妹");
		int  penguin = input.nextInt();
		
		
		break;
	  
		
	}
	
	System.out.println("宠物的自白");
	
	
	}

}
