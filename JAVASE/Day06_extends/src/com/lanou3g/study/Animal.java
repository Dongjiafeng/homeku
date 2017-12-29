package com.lanou3g.study;

public class Animal {
	/*
	 * 什么是继承?
	 * java面向对象编程的三大特性之一
	 * 封装,多态,继承
	 * A类 继承了 B类
	 * B类 是父类
	 * A类 是子类
	 * 子类可以继承父类的属性和方法
	 * 创建一个类Pig,使用extends关键字
	 *       继承Animal 这个类
	 *       
	 */
	//表示种族	
	private String kind;
//	public Animal(){
//		
//		System.out.println("--------动物世界---------");
//	}
	public Animal(String kind){
		this.kind = kind;
				System.out.println("这个动物种族为:"+kind);
	}
	
	
	
	
	public void sleep(){
		System.out.println("睡一会");
		
	}
	

}
