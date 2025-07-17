package com.springcore.lifecycle;

public class Samosa {
	private double price;

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting double");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "] \n";
	}
	public void hi() {
		System.out.println("Inside init method");
	}
	public void bye() {
		System.out.println("Inside destroy method");
	}
	
}
