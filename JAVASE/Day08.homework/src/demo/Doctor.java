package demo;

public class Doctor extends Person implements UserInter{

	@Override
	public void onLine() {
		// TODO Auto-generated method stub
		System.out.println("开始看病....");
	}

	@Override
	public void offLine() {
		// TODO Auto-generated method stub
		System.out.println("停止看病...");
	}

}
