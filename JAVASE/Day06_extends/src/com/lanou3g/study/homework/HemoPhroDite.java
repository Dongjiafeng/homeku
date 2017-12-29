package com.lanou3g.study.homework;

public class HemoPhroDite extends Person {
      private int age;
      private String boyGirlFriend;
	public String getBoyGirlFriend() {
		return boyGirlFriend;
	}
	public void setBoyGirlFriend(String boyGirlFriend) {
		this.boyGirlFriend = boyGirlFriend;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public HemoPhroDite(String name) {
		super("上帝");
		System.out.println("死对头");
		
	}
	public void eat(){
		super.eat();
		System.out.println(boyGirlFriend+" "+age+"岁"+"前一句给你们看的,我特么还要吃饭????");
		
	}
    public void eat(String walk){
    	System.out.println("前一句不存在的,我特么走哪飘哪");
    }
}
