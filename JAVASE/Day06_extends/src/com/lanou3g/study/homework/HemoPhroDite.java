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
		super("�ϵ�");
		System.out.println("����ͷ");
		
	}
	public void eat(){
		super.eat();
		System.out.println(boyGirlFriend+" "+age+"��"+"ǰһ������ǿ���,����ô��Ҫ�Է�????");
		
	}
    public void eat(String walk){
    	System.out.println("ǰһ�䲻���ڵ�,����ô����Ʈ��");
    }
}
