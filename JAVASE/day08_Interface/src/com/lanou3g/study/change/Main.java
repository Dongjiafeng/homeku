package com.lanou3g.study.change;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Pig();
		//animal = new Grass();
		//���������,ֻ���ҵ�����ķ���
		//�Ҳ���������еķ���
		animal.eat();
		animal.walk();


		if (animal instanceof Pig){
			//���Pig�������ָ��Ķ�������Ϊ��ȭ��
			//��ô���ǿ��Խ���ǿ������ת��
			//()��д�ľ���Ҫǿת������
			Pig ���� =(Pig)animal;
			����.sleep();
}
   }
}
