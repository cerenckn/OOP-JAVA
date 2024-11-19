package ders3;

public class Salerpeople {
	static int urunCaunt=0;
	private String ad;
	private int hafmaas=1500;
	private double komisyonoran=0.05;
	private int satilanurun;
	
	public void SalerPeople(String ad,int satilanurun) {
		this.ad=ad;
		this.satilanurun=satilanurun;
		urunCaunt+=satilanurun;
	}
	public double toplammaashesapla() {
		double komisyon=satilanurun*komisyonoran*100;
		return hafmaas+komisyon;
	}

public void show() {
	System.out.println("Satış eleman adı:"+ad);
	
	System.out.println("Haftalık maaşı: "+hafmaas+"TL");

	System.out.println("Komisyon tutarı: "+satilanurun*komisyonoran*100+"tl");

	System.out.println("Toplam maas:"+toplammaashesapla()+"TL");
	
	System.out.println("Satilan urun adeti: "+satilanurun);
	System.out.println("Toplam satilan ürün: "+urunCaunt);

}


}
