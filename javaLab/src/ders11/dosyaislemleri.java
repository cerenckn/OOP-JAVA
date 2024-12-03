package ders11;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.*;
import java.io.BufferedReader;
import java.util.Scanner;

public class dosyaislemleri {
	public static void main(String[] args)throws IOException {
		//csv dosyaları excelin veri tabanı olan şekli, hücrelerin arası ; ile ayrılıyor
		//throw ile try-catch arasındaki fark: 
		File f=new File("C:\\Users\\crnck\\OneDrive\\Masaüstü\\deneme");
		if(!f.exists()) {//dosya açılmamışsa 
			f.createNewFile();// hata yapma olasılığı yüksek try-catch ile bu erroru yakala, hata olmaması için bu fonksiyonu throws ett
		}
		ArrayList <String> a =new ArrayList<>();
		a.add("Ceren Çeken");
		a.add("20");
		String q="Merhaba";
		FileWriter fWriter=new FileWriter(f,true);// false işlemi yazma işlemini yaptırıyor,okutmuyor, true yaparsak okuma da yapar
		BufferedWriter bWriter=new BufferedWriter(fWriter);
		for(String d:a) {
			bWriter.write(d);
		}
		bWriter.write(q);
		FileReader fReader=new FileReader(f);
		BufferedReader bReader=new BufferedReader(fReader);
		try(Scanner s=new Scanner(f)){
			while(s.hasNextLine()) {
				String line=bReader.readLine();
				System.out.println(line);
			}
		}
		
		bWriter.close();
		fWriter.close();
		bReader.close(); 
		fReader.close();
	}
	
}
