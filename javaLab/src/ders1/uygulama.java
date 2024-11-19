package ders1;
import java.util.Scanner;
public class uygulama {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input= new Scanner(System.in);
			
			//1-a.soru
			
			int number1;
			int number2;
			int top,cık,carp,bol;
			 System.out.print("Enter first int:");
			 number1=input.nextInt();
			 System.out.print("Enter second int:");
			 number2=input.nextInt();
			 top=number1+number2;
			 System.out.printf("Toplam is %d%n",top);
			 cık=number1-number2;
			 System.out.printf("Çıkarma is %d%n",cık);
			 carp=number1*number2;
			 System.out.printf("Çarpma is %d%n",carp);
			 bol=number1/number2;
			 System.out.printf("Bölme is %d%n",bol);
			 
			 //1-b.soru
			 
			 int bas,birler_bas,onlar_bas,yuzler_bas,binler_bas,onbinler_bas;
			 System.out.print("5 basamaklı sayı gir: ");
			 bas=input.nextInt();
			 birler_bas=bas%10;
			 System.out.printf("Birler bas: %d%n",birler_bas);
			 onlar_bas=(bas/10)%10;
			 System.out.printf("Onlar bas: %d%n",onlar_bas);
			 yuzler_bas=(bas/100)%10;
			 System.out.printf("Yüzler bas: %d%n",yuzler_bas);
			 binler_bas=(bas/1000)%10;
			 System.out.printf("Binler bas: %d%n",binler_bas);
			 onbinler_bas=(bas/10000);
			 System.out.printf("On binler bas: %d%n",onbinler_bas);
			 
			 //2.soru
			 
			 double kilo,boy;
			 double index;
			 System.out.print("Kilonuzu giriniz:");
			 kilo=input.nextDouble();
			 System.out.print("Boyunuzu giriniz:");
			 boy=input.nextDouble();
			 index=kilo/(boy*boy);
			if(index<18.5)
				 System.out.print("Zayıf\n");
			if(18.5<=index&& index<24.9)
				 System.out.print("Normal\n");
			if(24.9<=index&&index<29.9)
				 System.out.print("Şişman\n");
			if(30<=index)
				 System.out.print("Obez\n");
			
			//3.soru
			
			 float yarı_cap;
			 double cevre,alan;
			 System.out.printf("Yarıçap giriniz:");
			 yarı_cap=input.nextFloat();
			 cevre=2*3.14159*yarı_cap;
			 System.out.printf("Dairenin cevresi: %f%n",cevre);
			 alan=3.14159*yarı_cap*yarı_cap;
			 System.out.printf("Dairenin alanı: %f%n",alan);
		 
			 //4.soru
			 int sayi;
			 System.out.print("Sayi giriniz:");
			 sayi=input.nextInt();
			 
			 int ters_sayi=0,kalan;
			 while(sayi!=0) {
				 kalan=sayi%10;
				ters_sayi= ters_sayi*10+kalan;
				 sayi/=10;
			 }
			 System.out.print("Girilen sayinin tersi: "+ ters_sayi);	 
			 
			 

		}
}
