package demo;

public class Worker extends Person implements UserInter{

	@Override
	public void onLine() {
		System.out.println("��ʼ׬Ǯ��.....");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void offLine() {
		// TODO Auto-generated method stub
		System.out.println("ֹͣ׬Ǯ");
	}

}
