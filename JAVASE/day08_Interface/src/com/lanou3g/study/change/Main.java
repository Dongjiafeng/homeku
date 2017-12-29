package com.lanou3g.study.change;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Pig();
		//animal = new Grass();
		//父类的引用,只能找到父类的方法
		//找不到子类独有的方法
		animal.eat();
		animal.walk();


		if (animal instanceof Pig){
			//如果Pig这个引用指向的对象类型为跆拳道
			//那么我们可以进行强制类型转换
			//()中写的就是要强转的类型
			Pig 佩奇 =(Pig)animal;
			佩奇.sleep();
}
   }
}
