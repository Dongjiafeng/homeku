package demo;

public class Worker extends Person implements UserInter{

	@Override
	public void onLine() {
		System.out.println("¿ªÊ¼×¬Ç®ÖÐ.....");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void offLine() {
		// TODO Auto-generated method stub
		System.out.println("Í£Ö¹×¬Ç®");
	}

}
