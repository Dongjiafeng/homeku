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
		super("����");
		this.name = name;
		
		System.out.println("��߸");
	}
	
	 public void eat(String walk){	
		 super.walk();
		 System.out.println(name+": ��Ϣ����,������"+girlFriend);
		 
	 }
	 public void eat(){
		 super.eat();
		 System.out.println(name+": �治����,����Ƿ�,һֱҪ�ҳ�");
	 }

}
