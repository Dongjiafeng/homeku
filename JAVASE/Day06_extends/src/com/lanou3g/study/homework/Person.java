package com.lanou3g.study.homework;

public class Person {
  String gender;
  String name;
  public Person(String name){
	  this.name = name;
	  System.out.println("我们都是女娲的"+name);
  }
  public void walk(){
	  System.out.println("走累了,休息下");
  }
  public void eat(){
	  System.out.println("吃饱了,我去写作业去了");
  }
  
  
}
