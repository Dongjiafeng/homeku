package com.lanou3g.study;

public class Company {
        
	private Teacher t;
	private Doctor doc;
	private Student stu;
	public Teacher getT() {
		return t;
	}
	public void setT(Teacher t) {
		this.t = t;
	}
	public Doctor getDoc() {
		return doc;
	}
	public void setDoc(Doctor doc) {
		this.doc = doc;
	}
	public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}
	public void work(){
		if(doc!= null){
			doc.work();
		}
		if(t!=null){
			t.work();
		}
		if(stu!=null){
			stu.work();
		}
		
	}
	
}
