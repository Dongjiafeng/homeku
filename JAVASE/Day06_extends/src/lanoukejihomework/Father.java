package lanoukejihomework;

public class Father {
		//父亲里面,有个妻子有个孩子
	//现在我们没有Mother类和Child类
	//所以我们创建一个
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
		 System.out.println(name+"的妻子是"+wife.getName()+",他的孩子是"+child.getName());
	
	
   }
}
