package text;

public class Student {
	//��װ
	private String name = "��ɽͯ��";
	
	//��¶��һ��������ȥ����/ȥ���
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	
	public  void smile(){
		System.out.println("�������ֿ���");
		
	}
	protected void cry(){
		System.out.println("�޵���һ��������");
	}
	private void angry(){
	System.out.println("������һֻdog");
	}
	 String sad(){
		return "����һ����";
	}
}
