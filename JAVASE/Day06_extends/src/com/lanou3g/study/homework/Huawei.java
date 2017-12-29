package com.lanou3g.study.homework;

public class Huawei extends MobliePhone {
	private String  vendor;
	private int date;
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public void Internet(){
		super.Internet();
		System.out.println("我也在等你");
	}
	public void a(){
		super.Internet("开心");
		System.out.println("是你吗");
	}
	

}
