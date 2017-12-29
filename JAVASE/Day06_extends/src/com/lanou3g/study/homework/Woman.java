package com.lanou3g.study.homework;

public class Woman extends Person{
     private int age;
     private String boyFriend;
     
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBoyFriend() {
		return boyFriend;
	}

	public void setBoyFriend(String boyFriend) {
		this.boyFriend = boyFriend;
	}

	public Woman(String name) {
		super("妈妈");
		System.out.println("华胥氏");
	}
	
	public void eat(){
		super.eat();
		System.out.println("臣妾做不到一直吃");
		
	}
	public void eat(String wolk){
		super.walk();
		System.out.println("你妈妈我一日飞一百万里,一群垃圾东西");
	}
	

}
