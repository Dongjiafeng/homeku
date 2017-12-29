package lanoukejihomework;

public class HomeMain {
	public static void main(String[] args){
		Father father = new Father();
		father.setName("ÂíÔÆ°Ö°Ö");
		Mother mother = new Mother();
		mother.setName("Î§È¹ÂèÂè");
		
		Child child = new Child();
		child.setName("Ã«ĞÂÓî");
		
		father.setWife(mother);
		father.setChild(child);
		
		father.showFamily();
		
		child.setFather(father);
		child.setMother(mother);
		child.showFamily();
		
		
	}
	
	
	
	
	

}
