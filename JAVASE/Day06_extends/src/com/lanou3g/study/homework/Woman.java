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
		super("����");
		System.out.println("������");
	}
	
	public void eat(){
		super.eat();
		System.out.println("���������һֱ��");
		
	}
	public void eat(String wolk){
		super.walk();
		System.out.println("��������һ�շ�һ������,һȺ��������");
	}
	

}
