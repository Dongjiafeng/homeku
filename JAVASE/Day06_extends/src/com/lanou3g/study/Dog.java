package com.lanou3g.study;

public class Dog {
	public Dog(){
		System.out.println("这是默认的空参的构造方法");
		
	}
	public void eatBone(){
		System.out.println("lalala");
	}
	//方法名的重载条件
//	      方法名相同,参数列表不同
//	      与返回值与权限修饰符无关
	public String eatBone(String n){
		return n;
	}
	public Dog(String name){
		System.out.println("这是带参数的构造方法,参数类型为:"+name);
		
	}
       public Dog(String name , int age){
		
    	   System.out.println("这是带参数的构造方法,参数类型为:"+name+age);
    
	}
       public Dog(int age , String name){
   		
    	   
    	    
   	}
     
}
