package lanoukejihomework;

public class Father {
		//��������,�и������и�����
	//��������û��Mother���Child��
	//�������Ǵ���һ��
	 private Mother wife;
	 private Child child;
	 private String name;
	  
	 public void setWife(Mother wife){
		 this. wife = wife;
	 }
	 public void setChild(Child child){
		 this.child = child;
	 }
	 public String getName(){
		 return this.name;
	 }
	 
	 public void setName(String name){
		 this.name = name;
	 }
	 public void showFamily(){
		 System.out.println(name+"��������"+wife.getName()+",���ĺ�����"+child.getName());
	
	
   }
}
