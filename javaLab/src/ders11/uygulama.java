package ders11;

import java.io.*;
import java.util.Scanner;

public class uygulama {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\crnck\\OneDrive\\Masaüstü\\deneme2.csv");
		if(!f.exists()) {
			f.createNewFile();
		}
		FileWriter fWriter=new FileWriter(f,false);
		BufferedWriter bWriter=new BufferedWriter(fWriter);
		bWriter.write("Ceren;Ceken\n");
		bWriter.write("Hatice;Ocak\n");
		bWriter.write("Ibrahim;Ceken\n");
		bWriter.write("Mustafa;Ceken\n");
		bWriter.write("Gizem;Ozden\n");
		bWriter.close();//bunu kapatmazsak while ın içine grirmiyor
		
		FileReader fReader=new FileReader(f);
		BufferedReader bReader=new BufferedReader(fReader);
		Scanner s=new Scanner(f);
		Scanner input=new Scanner(System.in);
		System.out.println("Ad Soyad ile giriş yapınız");
		String control= input.nextLine();
		while(s.hasNextLine()) {
			String satir=s.nextLine();
			String[] split= satir.split(";");
			String fullname=split[0]+" "+split[1];
			if(control.equalsIgnoreCase(fullname)) {
				System.out.println("Tebrikler başarılı Giriş Yaptınız!!");
			    return;
			}
	}
	 System.out.println("Giriş yapılamadı...");
	
	}
	}
