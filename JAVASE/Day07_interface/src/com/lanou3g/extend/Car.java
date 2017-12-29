package com.lanou3g.extend;

public class Car {
	
	private int wheels;
	private String color;

	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {

        System.out.println("----------我是父类类中的setColor"+color);	
		this.color = color;
	}
	
	public void speed(){
		System.out.println("这辆车加速了");
	}
	
	

}
