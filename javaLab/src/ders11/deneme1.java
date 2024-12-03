package ders11;

import java.io.*;
import java.util.Scanner;

public class deneme1 {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\crnck\\OneDrive\\Masaüstü\\deneme1.csv");
		if(!f.exists()) {
			f.createNewFile();
		}
		FileWriter fWriter=new FileWriter(f,false);
		BufferedWriter bWriter=new BufferedWriter(fWriter);
		bWriter.write("9;8;7\n");
		bWriter.write("6;5;4\n");
		bWriter.close();
		
		FileReader fReader=new FileReader(f);
		BufferedReader bReader=new BufferedReader(fReader);
		Scanner s=new Scanner(f);
		while(s.hasNextLine()) {
			String satir=s.nextLine();
			String[] split= satir.split(";");
			for(String info:split) {
				System.out.println(info);
				
			}
			
		}
		//
	}

}
