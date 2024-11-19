package ders2;
import java.util.Scanner;
public class StudentTest {
public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		Student s1=new Student(String name, int note);
		s1.name=input.nextString();
		s1.note=input.nextInt();
		Student s2=new Student(name,note);
		s2.name=input.nextString();
		s2.note=input.nextInt();
		System.out.println("Öğrenciler: ");
		System.out.print("1.Öğrenci: "+s1.getName()+" ");
		System.out.println("Harf Notu: "+k1.getHarfNotu());
		System.out.print("2.Öğrenci: "+s2.getName()+" ");
		System.out.println("Harf Notu: "+k2.getHarfNotu());
		
}

}
