package ders8;

public class calisan {
	protected String Adsoyad;
	protected int Telefon;
	protected String Email;
	public calisan(String adsoyad, int telefon, String email) {
		super();
		Adsoyad = adsoyad;
		Telefon = telefon;
		Email = email;
	}
	public void Giris() {
		System.out.println(Adsoyad +" GİRİS YAPTİ");

	}
	public void cikis() {
		System.out.println(Adsoyad +" CİKİS YAPTİ");

	}
	public void yemek() {
		System.out.println(Adsoyad +" YEMEK YEDİ");

	}
	protected String getAdsoyad() {
		return Adsoyad;
	}
	protected void setAdsoyad(String adsoyad) {
		Adsoyad = adsoyad;
	}
	protected int getTelefon() {
		return Telefon;
	}
	protected void setTelefon(int telefon) {
		Telefon = telefon;
	}
	protected String getEmail() {
		return Email;
	}
	protected void setEmail(String email) {
		Email = email;
	}

}
