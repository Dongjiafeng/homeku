package lanoukejihomework;

public class Child {
    private String name;
    private Mother mother;
    private Father father;
    
    
    
    
     public void setMother(Mother mother){
    	 this.mother = mother;
     }
     public void setFather(Father father){
    	 this.father = father;
     }
    public String getName() {
	return name;
 }

    	public void setName(String name) {
    		this.name = name;
 }
    	public void showFamily(){
			System.out.println(name+"��������:"+mother.getName()+name+"�İְ���:"+father.getName());
		}
}
