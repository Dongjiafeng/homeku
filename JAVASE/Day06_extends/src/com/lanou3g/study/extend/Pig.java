package com.lanou3g.study.extend;

import com.lanou3g.study.Animal;

public class Pig extends Animal {
	/*
	 * 
	 * extends�ؼ���:�̳�
	 * A extends B
	 * ����A��̳�B�� , ֻ���������ʱʹ��
	 */
	
	//����̳и������Ի򷽷�
	//Ȼ�����Զ������Լ����е����Ի򷽷�
	//������̽���չ
	//��ɱ��������;
	public void beKillledToMeat(){
		System.out.println("��ɱ��������");
	}

	public Pig() {
		super("��");
		// TODO Auto-generated constructor stub
	}

}
