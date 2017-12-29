package com.lanou3g.study.inter;
/**
 * 文档注释
 * WatchDog类,通过implements关键字
 * 与Work接口产生了关联,导致WatchDog就
 * 满足另外Work这个接口的规范
 * 
 * 
 * implements 关键字:实现
 * 
 * 通过implements关键字,可以让一个类
 * 实现多个接口,多个接口之间通过逗号分隔
 * 这样就让这个类,满足了接口的规范,
 * 也叫做实现接口
 * 
 * A继承了B ,那么A叫做子类,B叫做父类
 * A实现了C,那么A叫做实现类,C叫做接口
 */

public class WatchDog implements Work{

	public void work() {
		// TODO Auto-generated method stub
		System.out.println("上岗了,谁来咬谁");
	}
		public void goHome(){
			System.out.println("回窝吃骨头了");
		}
}
