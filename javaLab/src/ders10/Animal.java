package ders10;

public class Animal {
private int legs;
	
	
	public Animal(int legs) {
		super();
		this.legs = legs;
	}
	protected int getLegs() {
		return legs;
	}
	protected void setLegs(int legs) {
		this.legs = legs;
	}
	public void walk() {
		System.out.println("ayağı olan Hayvanlar yürür");	
	}
	public void eat() {
		System.out.println("Hayvanlar yemek yer.");

	}
}
