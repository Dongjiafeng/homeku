package com.lanou3g.homework;

import java.util.Scanner;

public class Demo {
	Dog xiaogou = new Dog();
	Penguin qie = new Penguin();
	public static void main(String[] args) {
		

	Scanner input = new Scanner(System.in);
	System.out.println("�������������:");
	
	String pet = input.nextLine();	
	
	System.out.println("��ѡ���������: " );
	
	System.out.println("1.����    2.���");
	int poodle = input.nextInt();
	switch(poodle){
	case 1:
		System.out.println("��ѡ���㹷����Ʒ��:");
		System.out.println("1.��������������Ȯ    2.����ѩ����");
		int breed = input.nextInt();
		
		break;
		
	case 2:
		System.out.println("��ѡ�����������:");
		System.out.println("1.Q��   2.Q��");
		int  penguin = input.nextInt();
		
		
		break;
	  
		
	}
	
	System.out.println("������԰�");
	
	
	}

}
