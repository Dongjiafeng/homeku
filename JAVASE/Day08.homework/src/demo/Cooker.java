package demo;

public class Cooker extends Person implements UserInter{

	@Override
	public void onLine() {
		// TODO Auto-generated method stub
		System.out.println("开始做菜....");
	}

	@Override
	public void offLine() {
		// TODO Auto-generated method stub
		System.out.println("停止做菜...");
	}

}
