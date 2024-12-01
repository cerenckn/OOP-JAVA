package ders10;

public class AnimalTest {
	public static void main(String[] args) {
		Animal a1=new Fish(0,"Huri");
		a1.eat();
		a1.walk();
		
		
		Spider a2=new Animal(8);
		System.out.println(a2.getLegs()+" ayağa sahip,örümcek");
		a2.eat();
		Cat a3=new Cat(4,"Duman");
		a3.eat();
		a3.play();
		System.out.println(a3.getName());
		


		
		
	}
}
