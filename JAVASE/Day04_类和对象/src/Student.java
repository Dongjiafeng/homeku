
public class Student {
	//�����ж�������
	//�������������Ի�û��ֵ��
	String name;
	String school;
	int id ;
	
	
	public void play(){
		System.out.println(name+"����Ϸȥ��");
	}
	
	public void goToStudy(){
		System.out.println(name+"");
	}
	/*
	 * public Ȩ�����η�
	 * void   ����ֵ����
	 *         û�з���ֵ
	 * show    ������  
	 * (String str)  �����б� ,�����ж��������
	 *   			String �ǲ���������
	 *   					�������͵�����
	 *   			str    �ǲ���������  
	 *   					�������,����ôд����ôд
	 *   					����Ҫ����֮��
	 *   			
	 * {}     ������:���������������ʱ,Ҫִ�еĴ���
	 */
	public void show(String str){
		 
	}
	public void ������(int money){
		System.out.println("������ʦ��Ǯ"+money+"ȥ����Ϸ��");
	}
	//pulic ��������String 
	//��ʾ����ֵ��������String ,���ַ���.
	public String hot(String food){
		return "���ȵ�"+food;
	}
}
