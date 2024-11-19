package ders6;
import java.util.HashMap;
public class Hmap {
	
		public static void main(String[] args) {
			HashMap <String, Integer> m=new HashMap<String, Integer>();
			m.put("Bolu", 14);
			m.put("Ankara", 6);
			m.put("İstanbul", 34);
			for(String i:m.keySet()) {
				System.out.println("key: "+i+" "+"Value: "+m.get(m));//hashmaplerde get ile getiriyoruz 

			}
		}
}
