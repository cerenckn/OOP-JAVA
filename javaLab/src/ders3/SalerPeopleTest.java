package ders3;
import java.util.Scanner;
public class SalerPeopleTest {
	public static void main(String[] args) {
		Scanner saler= new Scanner(System.in);
		SalerPeople saler1=new SalerPeople("Ceren", 15);
		saler1.show();
		SalerPeople saler2=new SalerPeople("İbrahim", 8);
		saler2.show();
		
	}
}
