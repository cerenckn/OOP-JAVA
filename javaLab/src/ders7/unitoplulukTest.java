package ders7;

public class unitoplulukTest {
	public static void main(String[] args) {
		calisan c1=new calisan("Ahmet Mehmet",5438,"ahmetmehmet@gmail.com");
		c1.Giris();
		akademisyen a1=new akademisyen("Hasan Karabasan",4563,"hasankrbsn@gmail.com","bil.Muh.","Doc.Dr.","OOP");
		a1.dersegir();
		a1.Giris();
		ogretimgörevlisi o1=new ogretimgörevlisi("Ceren Çeken",3675,"ckncrn@gmail.com","Bil.Müh.","Akademisyen","C++","Prof.");
		System.out.println(o1.getUnvan()+" " +o1.getAdsoyad()+" "+o1.getTelefon()+" "+o1.getGorev()+" "+o1.getDersler());
		o1.Giris();
		o1.setSicilNo(123456789);
		System.out.println("Sicil no:"+ o1.getSicilNo());


	}

}
