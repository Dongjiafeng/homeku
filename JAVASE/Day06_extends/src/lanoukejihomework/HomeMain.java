package lanoukejihomework;

public class HomeMain {
	public static void main(String[] args){
		Father father = new Father();
		father.setName("���ưְ�");
		Mother mother = new Mother();
		mother.setName("Χȹ����");
		
		Child child = new Child();
		child.setName("ë����");
		
		father.setWife(mother);
		father.setChild(child);
		
		father.showFamily();
		
		child.setFather(father);
		child.setMother(mother);
		child.showFamily();
		
		
	}
	
	
	
	
	

}
