package com.lanou3g.study.inter;

import com.lanou3g.study.Doctor;
import com.lanou3g.study.Teacher;

public class Main {
public static void main(String[] args) {
	/*
	 * interface:�ӿ�
	 * class:��
	 * 
	 * ����������java����һ�������
	 * ���ڲ��еĹ�ϵ
	 * 
	 * java�еĽӿ�,��ʾһ���淶���߹���
	 * �����಻��ֱ�Ӵ�������,���ǿ���ʹ��
	 * �����������.
	 *   ����ղŽ���Person����һ��������
	 *   Person p ; ����һ������
	 *   
	 *   �ӿ�Ҳ�����Ƶ�,Ҳ����ֱ�Ӵ�������.
	 *   ���ǿ���ʹ�ýӿڵ�����
	 */
	
	//�����������ּ�ʹwd
	//���������������,
	//���һ������û������,
	//��ô������������
//	WatchDog wd = new WatchDog();
	Company facebook = new Company();
	//�����work��Ҫ����ȥһ��ʲô��?
	facebook.setWork(new WatchDog());
	
	
	
	facebook.startWork();
	facebook.endWork();
	
	
}
}
