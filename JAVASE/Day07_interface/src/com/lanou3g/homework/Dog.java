package com.lanou3g.homework;

public class Dog {
	 private String name;
	  private int health = 100;
	  private  int intimacy = 0; 
	  private String gender ;
	  
	public String getName() {
		return name;
	}
	public int getIntimacy() {
		return intimacy;
	}
	public void setIntimacy(int intimacy) {
		this.intimacy = intimacy;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void show(){
		System.out.println("���������"+name+"������Ա�"+gender+"���ܶ���:"+intimacy+
				"����ֵ��:"+health);
	}

}
