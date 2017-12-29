package com.lanou3g.study;

public class Cat {
	private String name;
	private Person1 onwer;
	/*
	 * 构造方法:
	 * 1.方法名的类名相同
	 * 2.没有返回值这一功能
	 * 有了构造方法,还要set/get干什么?
	 * 首先第一点,get还是一定要有的,否则
	 * 再类的外面是无法获得私有属性的
	 * 
	 * 关于set:
	 *   有些属性,并不是每个对象都要具有的,
	 *   比如cat可能会有一个伴侣,但是并不是每个cat
	 *   在初始化的时候,都马上就有一个伴侣了
	 *   所以可以在后续的使用中,通过set方法
	 *   给他设置一个
	 *     对于初始化就有的这个onwer属性
	 *     很可能这个猫被卖了,那就需要换一个主人,这时候也可以用set方法,去修改属性
	 */
	public Cat(Person1 onwer){
		//将括号中的参数owner的值
		//赋给了属性owner
		//只不过这个构造方法是没有参数的
		//每一个类中,都会有一个
//		默认的没有参数的构造方法
//		以后没有参数我们就简称为空参
//		刚刚我们自己在Cat中写了一个带参数的构造方法
//		那么就会把默认的空参的构造方法覆盖
//		这里的new Cat()还是去找空参的构造方法
//		就找不到了,就报错了
		this.onwer = onwer;
	}
	

	public Person1 getOnwer() {
		return onwer;
	}

	public void setOnwer(Person1 onwer) {
		this.onwer = onwer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
