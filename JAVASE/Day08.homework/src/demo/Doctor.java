package demo;

public class Doctor extends Person implements UserInter{

	@Override
	public void onLine() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ����....");
	}

	@Override
	public void offLine() {
		// TODO Auto-generated method stub
		System.out.println("ֹͣ����...");
	}

}
