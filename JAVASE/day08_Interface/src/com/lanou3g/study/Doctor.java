package com.lanou3g.study;

import com.lanou3g.study.inter.Work;

public class Doctor extends Person implements Work{

	@Override
	public void work() {
           System.out.println("�о��о����Ͳ���");		
	}

	@Override
	public void goHome() {
		// TODO Auto-generated method stub
		System.out.println("�ؼҳԷ���");
	}

}
