package com.lanou3g.study.extend;

import com.lanou3g.study.Animal;

public class Monkey extends Animal {

	public Monkey() {
		//super ()�����ڵ��ø���ĿղεĹ��췽��
		//super("����")������
		//���õĸ���Ĳ�������ΪString�Ĺ��췽��
		super("����");
		System.out.println("i am a �����ʥ");
	}

	public void sleep() {
		//super.sleep()���ڵ��ø����sleep����
		System.out.println("���Ǻ��ӵ�˯������");
		super.sleep();
	}
	

}
