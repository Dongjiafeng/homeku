package com.lanou3g.study.inter;

public interface Work {
  /*
   * 接口是一个规范.他规范了什么
   * 就是写这里接口里面
   * 比如Work接口,
   * 我们可以让它
   * 规范一个叫work的方法
   * 
   * 接口中的方法都是抽象方法
   * 
   */
//	public static final String name = "张三";
	String name = "张三";
	//接口中的属性
	//默认都是静态的常量
	//final关键字修饰的变量,不可改变
	//被称为常量
	
	 int a=1;
	void work();
	void goHome();
}
//	public abstract void work();
	
