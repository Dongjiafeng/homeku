package com.lanou3g.extend;

public class RunCar extends Car {
	//跑车的加速度,应该比一般的快.
	//所以我们复写父类的Car中的加速方法
	//复写:就是把从父类中继承的方法修改
	
	//注解:这个注解用来帮我们检测,
	//speed方法是否从父类继承来的
	@Override
	public void speed(){
		System.out.println("加速度为240");
	}
	
	

}
