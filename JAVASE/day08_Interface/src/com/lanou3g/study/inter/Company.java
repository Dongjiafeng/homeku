package com.lanou3g.study.inter;

import com.lanou3g.study.Doctor;
import com.lanou3g.study.Teacher;

public class Company {
   
    //Work��һ���ӿ�
    //������Ǵ�����һ���ӿڵ�����
	 private Work work ;
	 
	 
		 
			
	 public Work getWork() {
		return work;
	}




	public void setWork(Work work) {
		this.work = work;
	}




	public void startWork(){
			//work����ӿڵ�����
			//��ָ��һ��ʵ����Ķ���
			//������ǵ������ʵ����Ķ����work����
			this.work.work();
		 
	 }
	public void endWork(){
		//work����ӿڵ�����
		//��ָ��һ��ʵ����Ķ���
		//������ǵ������ʵ����Ķ����work����
		this.work.goHome();
	 
 }




	
    
}   
