package Demo1;

public class Doctor extends Person implements UserInter{

	@Override
	public void onLine() {
		// TODO Auto-generated method stub
		System.out.println("看病了");
	}

	@Override
	public void offLine() {
		// TODO Auto-generated method stub
		System.out.println("关门了");
	}

}
