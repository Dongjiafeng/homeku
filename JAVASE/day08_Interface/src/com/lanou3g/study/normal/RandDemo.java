package com.lanou3g.study.normal;

import java.util.Random;

public class RandDemo {
public static void main(String[] args) {
	
	//ȡһ�������
	//��Ҫ�õ�Random���������
	Random random = new Random();
	int r =random.nextInt();
	System.out.println(r);
	//ȡһ��30 -45֮��������
	//ȡһ��0 - 10 ֮��������
	int e  = random.nextInt(10);
//	nextInt(bound)���յĲ���
	
	
	//��һ������п���[0 , 10)
	e = random.nextInt(45-30+1)+30;
//	3.ȡһ��true��false
	for(int i = 0;i<60;i++){
	boolean b = random.nextBoolean();
	System.out.println(b);
}
}
}
