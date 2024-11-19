package ders10;

public class Fish extends Animal implements Pet{
private String name;
	

	public Fish(int legs, String name) {
		super(legs);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
public void walk() {
	System.out.println("balıklar yürüyemez,yüzer");

}
public void eat() {
	System.out.println("balıklar yem yer");
}
public void play()
{
	System.out.println("Balık oynamaz");
}
}
