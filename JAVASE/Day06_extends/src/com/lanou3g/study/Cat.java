package com.lanou3g.study;

public class Cat {
	private String name;
	private Person1 onwer;
	/*
	 * ���췽��:
	 * 1.��������������ͬ
	 * 2.û�з���ֵ��һ����
	 * ���˹��췽��,��Ҫset/get��ʲô?
	 * ���ȵ�һ��,get����һ��Ҫ�е�,����
	 * ������������޷����˽�����Ե�
	 * 
	 * ����set:
	 *   ��Щ����,������ÿ������Ҫ���е�,
	 *   ����cat���ܻ���һ������,���ǲ�����ÿ��cat
	 *   �ڳ�ʼ����ʱ��,�����Ͼ���һ��������
	 *   ���Կ����ں�����ʹ����,ͨ��set����
	 *   ��������һ��
	 *     ���ڳ�ʼ�����е����onwer����
	 *     �ܿ������è������,�Ǿ���Ҫ��һ������,��ʱ��Ҳ������set����,ȥ�޸�����
	 */
	public Cat(Person1 onwer){
		//�������еĲ���owner��ֵ
		//����������owner
		//ֻ����������췽����û�в�����
		//ÿһ������,������һ��
//		Ĭ�ϵ�û�в����Ĺ��췽��
//		�Ժ�û�в������Ǿͼ��Ϊ�ղ�
//		�ո������Լ���Cat��д��һ���������Ĺ��췽��
//		��ô�ͻ��Ĭ�ϵĿղεĹ��췽������
//		�����new Cat()����ȥ�ҿղεĹ��췽��
//		���Ҳ�����,�ͱ�����
		this.onwer = onwer;
	}
	

	public Person1 getOnwer() {
		return onwer;
	}

	public void setOnwer(Person1 onwer) {
		this.onwer = onwer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
