package Demo1;

public class Cooker extends Person implements UserInter{

	@Override
	public void onLine() {
		// TODO Auto-generated method stub
		System.out.println("做饭了");
	}

	@Override
	public void offLine() {
		// TODO Auto-generated method stub
		System.out.println("走了");
	}

}
