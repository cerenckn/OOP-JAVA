package ders8;

public class ogretimgörevlisi extends akademisyen {
	protected String unvan;

	public ogretimgörevlisi(String adsoyad, int telefon, String email, String bolum, String gorev, String dersler,String unvan) {
		super(adsoyad, telefon, email, bolum, gorev, dersler);
		this.unvan=unvan;
	}
	protected void dersegir() {
		System.out.println(getUnvan()+ " "+ getAdsoyad() +" derse girdi.");

	}
	protected String getUnvan() {
		return unvan;
	}
	protected void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	
}
