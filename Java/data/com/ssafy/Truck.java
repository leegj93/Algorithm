package com.ssafy;

public class Truck extends Car {
	private int ton;
	
	public Truck() {
		super();
	}
	public Truck(String num, String model, int price, int ton) {
		super(num, model, price);
		this.setTon(ton);
	}
	public int getTon() {
		return ton;
	}
	public void setTon(int ton) {
		this.ton = ton;
	}
	
	public String toString() {
		return super.toString()+String.format("%-10d",ton);
	}

}
