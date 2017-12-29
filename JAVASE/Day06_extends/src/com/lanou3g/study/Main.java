package com.lanou3g.study;

public class Main {
      public static void main(String[] args) {
    	  
      Person1 zhangsan = new Person1();
    	  	Cat cat = new Cat(zhangsan);
    	  	
    	  	
    	  	//这是在对象创建之后,设置的name属性
    	  	cat.setName("Tom");
    	  	
//    	  	给cat设置一个主人
    	  	cat.setOnwer(zhangsan);
/*
 * 		我们要求是,每个猫对象被创建出来时
 * 都已经有啦一个主人
 * 而set方法,是在对象被创建后,才可以调用
 * 执行的,这不符合我们的要求
 * 
 * java给我们提供了一个叫构造方法的东西
 * 可以帮助我们,在对象初始化时,给属性赋值
 */
      }
}
