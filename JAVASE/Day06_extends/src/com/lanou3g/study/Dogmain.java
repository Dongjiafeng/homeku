package com.lanou3g.study;

public class Dogmain {

	public static void main(String[] args) {
/*
 * 构造方法的重载:
 * 方法名相同(构造方法的方法名都是类名)
 * 参数列表不同
 *    参数的个数, 参数的类型,参数的顺序
 *    这三个因素,只要有一个不同,那参数列表就是不同的
 *    
 */
		
		Dog dog = new Dog();
		
		Dog d1 = new Dog("旺财");
         Dog d2 = new Dog("旺财",5);
         dog.eatBone();
         dog.eatBone();
	}
	

}
