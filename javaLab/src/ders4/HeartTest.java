package ders4;
import java.util.Scanner;
public class HeartTest {
public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Adınızı giriniz: ");
		String adi= input.nextLine();
		System.out.println("Soyadınızı giriniz: ");
		String soyadi= input.nextLine();
		System.out.println("Doğum yilinizi giriniz: ");
		int dogumyili= input.nextInt();
		System.out.println("Mevcut yili giriniz: ");
		int suankiyil= input.nextInt();
		HeartRate kisi1=new HeartRate(adi,soyadi,dogumyili,suankiyil);
		 kisi1.show();

}
}
