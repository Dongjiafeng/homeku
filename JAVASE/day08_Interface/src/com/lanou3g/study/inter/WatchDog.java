package com.lanou3g.study.inter;
/**
 * �ĵ�ע��
 * WatchDog��,ͨ��implements�ؼ���
 * ��Work�ӿڲ����˹���,����WatchDog��
 * ��������Work����ӿڵĹ淶
 * 
 * 
 * implements �ؼ���:ʵ��
 * 
 * ͨ��implements�ؼ���,������һ����
 * ʵ�ֶ���ӿ�,����ӿ�֮��ͨ�����ŷָ�
 * �������������,�����˽ӿڵĹ淶,
 * Ҳ����ʵ�ֽӿ�
 * 
 * A�̳���B ,��ôA��������,B��������
 * Aʵ����C,��ôA����ʵ����,C�����ӿ�
 */

public class WatchDog implements Work{

	public void work() {
		// TODO Auto-generated method stub
		System.out.println("�ϸ���,˭��ҧ˭");
	}
		public void goHome(){
			System.out.println("���ѳԹ�ͷ��");
		}
}
