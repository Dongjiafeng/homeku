package Demo1;

public class  Worker extends Person implements UserInter{

	@Override
	public void onLine() {
		// TODO Auto-generated method stub
		System.out.println("开工了");
	}

	@Override
	public void offLine() {
		// TODO Auto-generated method stub
		System.out.println("收工了");
	}

}
