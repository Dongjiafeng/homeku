package demo;

public class Boss extends Person implements UserInter{

	@Override
	public void onLine() {
		// TODO Auto-generated method stub
		System.out.println("��ʼͶ����....");
	}

	@Override
	public void offLine() {
		// TODO Auto-generated method stub
		System.out.println("ֹͣͶ��....");
	}

}
