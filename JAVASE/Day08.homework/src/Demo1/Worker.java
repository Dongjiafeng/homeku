package Demo1;

public class  Worker extends Person implements UserInter{

	@Override
	public void onLine() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}

	@Override
	public void offLine() {
		// TODO Auto-generated method stub
		System.out.println("�չ���");
	}

}
