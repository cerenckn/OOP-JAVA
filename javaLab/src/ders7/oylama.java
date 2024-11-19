package ders7;
import java.util.Scanner;""
public class oylama {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String[] konular = {"Siyasi Sorunlar", "Küresel Isınma", "Ekonomik Durum", "Sosyal Adalet", "Eğitim Sistemi"};
	        int[] toplamPuanlar = new int[5];
	        int[] oySayisi = new int[5]; 

	        for (int i = 0; i < 5; i++) {
	            System.out.println(konular[i] + " için oy verin (1-10 arasında, çıkmak için -1 girin):");
	            while (true) {
	                System.out.print("Oy: ");
	                int oy = scanner.nextInt();
	                if (oy == -1) { 
	                    break;
	                }
	                if (oy >= 1 && oy <= 10) {
	                    toplamPuanlar[i] += oy;
	                    oySayisi[i]++;
	                } else {
	                    System.out.println("Geçersiz oy. Lütfen 1-10 arasında bir değer girin.");
	                }
	            }
	        }

	        int maxToplam = 0;
	        int maxIndex = 0;
	        int minToplam = Integer.MAX_VALUE;
	        int minIndex = 0;

	        for (int i = 0; i < 5; i++) {
	            if (oySayisi[i] > 0) {
	                double ortalama = (double) toplamPuanlar[i] / oySayisi[i];
	                System.out.println(konular[i] + " - Toplam Puan: " + toplamPuanlar[i] + ", Ortalama: " + ortalama);


	                if (toplamPuanlar[i] > maxToplam) {
	                    maxToplam = toplamPuanlar[i];
	                    maxIndex = i;
	                }
	                if (toplamPuanlar[i] < minToplam) {
	                    minToplam = toplamPuanlar[i];
	                    minIndex = i;
	                }
	            } else {
	                System.out.println(konular[i] + " için oy girilmedi.");
	            }
	        }

	  
	        System.out.println("En yüksek puanı alan konu: " + konular[maxIndex] + " - Toplam Puan: " + maxToplam);
	        System.out.println("En düşük puanı alan konu: " + konular[minIndex] + " - Toplam Puan: " + minToplam);

	        scanner.close();
	    }

}
