package com.lanou3g.study.extend;

import com.lanou3g.study.Animal;

public class Pig extends Animal {
	/*
	 * 
	 * extends关键字:继承
	 * A extends B
	 * 就是A类继承B类 , 只在类的声明时使用
	 */
	
	//子类继承父类属性或方法
	//然后又自定义了自己独有的属性或方法
	//这个过程叫扩展
	//被杀掉吃肉了;
	public void beKillledToMeat(){
		System.out.println("被杀掉吃肉了");
	}

	public Pig() {
		super("猪");
		// TODO Auto-generated constructor stub
	}

}
