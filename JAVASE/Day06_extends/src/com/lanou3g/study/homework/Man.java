package com.lanou3g.study.homework;

public class Man extends Person {
    private int age;
    private String  girlFriend;
    
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGirlFriend() {
		return girlFriend;
	}

	public void setGirlFriend(String girlFriend) {
		this.girlFriend = girlFriend;
	}

	public Man(String name) {
		super("孩子");
		this.name = name;
		
		System.out.println("哪吒");
	}
	
	 public void eat(String walk){	
		 super.walk();
		 System.out.println(name+": 休息好了,继续跑"+girlFriend);
		 
	 }
	 public void eat(){
		 super.eat();
		 System.out.println(name+": 真不吃啦,真的是烦,一直要我吃");
	 }

}
