package Demo1;

public class Boss extends Person implements UserInter {

	@Override
	public void onLine() {
		// TODO Auto-generated method stub
		System.out.println("投资了");
	}

	@Override
	public void offLine() {
		// TODO Auto-generated method stub
		System.out.println("停手了");
	}

}
