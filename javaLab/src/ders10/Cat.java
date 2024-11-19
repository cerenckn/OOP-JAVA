package ders10;

public class Cat extends Animal implements Pet {
	private String name;


	public Cat(int legs, String name) {
		super(legs);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void play() {
		System.out.println("Kediler oyun oynar");
	}
	public void eat() {
		System.out.println("Kediler mama yer");

	}
}
