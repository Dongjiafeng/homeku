package demo;

public class Boss extends Person implements UserInter{

	@Override
	public void onLine() {
		// TODO Auto-generated method stub
		System.out.println("开始投资中....");
	}

	@Override
	public void offLine() {
		// TODO Auto-generated method stub
		System.out.println("停止投资....");
	}

}
