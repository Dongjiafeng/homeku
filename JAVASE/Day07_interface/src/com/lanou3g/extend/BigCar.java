package com.lanou3g.extend;

public class BigCar extends Car {
	
	//���������{}�е�����
	//������Ա���Ի��߳�Ա����
	//show���������w
	//�оֲ�����
	//�ֲ�����,ֻ�����ڶ�������{}����Ч
	//�����������Ч��Χ,������������������
	private String name = "�󿨳�";
	
	public void PullGoods(){
		System.out.println("����ȥ��");
	}
    public void show(){
	   //��Ϊwheels��˽�е�
    	//���������޷�����,Ҳ�����޷���ֵ
    	//wheels = 4;
    	
    	int w		=	getWheels();
    	System.out.println("��̥����Ϊ:"+w);
}
    
    
	@Override
	public void speed() {
		// TODO Auto-generated method stub
		super.speed();
		System.out.println("���ٶ�Ϊ240");
	}
	@Override
	public int getWheels() {
		// TODO Auto-generated method stub
		return super.getWheels();
	}
	@Override
	public void setWheels(int wheels) {
		// TODO Auto-generated method stub
		super.setWheels(wheels);
	}
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return super.getColor();
	}
	@Override
	public void setColor(String color) {
        		
		super.setColor(color);
		System.out.println("���������е�setColor"+color);
	}
	public void showThis(){
		/*
		 * this���ڵ��ñ����Լ��ķ���
		 * super���ڵ��ø���ķ���
		 * this�����������
		 * ����һ��û������super�и������
		 * 
		 * this���Ե��ñ��������,����
		 */
      
        super.setColor("����������ɫ");
        this.setColor("�������ú�ɫ");
	}
}
