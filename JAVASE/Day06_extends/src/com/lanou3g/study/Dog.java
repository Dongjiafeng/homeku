package com.lanou3g.study;

public class Dog {
	public Dog(){
		System.out.println("����Ĭ�ϵĿղεĹ��췽��");
		
	}
	public void eatBone(){
		System.out.println("lalala");
	}
	//����������������
//	      ��������ͬ,�����б�ͬ
//	      �뷵��ֵ��Ȩ�����η��޹�
	public String eatBone(String n){
		return n;
	}
	public Dog(String name){
		System.out.println("���Ǵ������Ĺ��췽��,��������Ϊ:"+name);
		
	}
       public Dog(String name , int age){
		
    	   System.out.println("���Ǵ������Ĺ��췽��,��������Ϊ:"+name+age);
    
	}
       public Dog(int age , String name){
   		
    	   
    	    
   	}
     
}
