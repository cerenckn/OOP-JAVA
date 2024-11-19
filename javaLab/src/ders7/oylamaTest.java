package ders7;
import java.util.Scanner;
public class oylamaTest {
	public static void main( String[] args) {
		Scanner scanner= new Scanner(System.in);
		String[] sorular={"Eğitim","Çevresel Sorunlar","Politika","Ekonomi","Yolsuzluk"};
		int[][] oylar=new int[5][10];
		for(int i=0;i<5;i++) {
			System.out.println(sorular[i]+" konusu için oyunuz: ");
			for(int j=0;j<10;j++) {
				System.out.println(" Kullanıcı"+(j+1)+":");
				oylar[i][j]=scanner.nextInt();
			}
		}
			int maxToplam=0;
			int maxIndex=0;
			int minToplam=Integer.MAX_VALUE;
			int minIndex=0;
			for( int i=0;i<5;i++) {
				int toplam=0;
				for(int j=0;j<10;j++) {
					toplam+=oylar[i][j];
				}
				double ortalama= (double)toplam/10;
				System.out.println(sorular[i]+" toplam oy:"+ toplam+"ortalama:"+ortalama);
				if(toplam>maxToplam) {
					maxToplam=toplam;
					maxIndex=i;
				}
				if(toplam<minToplam) {
					minToplam=toplam;
					minIndex=i;
				}
				
			}
			System.out.println("En yüksek puanı alan konu:"+sorular[maxIndex]+"-Toplam Puan:"+maxToplam);
			System.out.println("En düşük puanı alan konu:"+sorular[minIndex]+"-Toplam Puan:"+minToplam);
	
		}

}
