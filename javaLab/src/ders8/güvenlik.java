package ders8;

public class güvenlik extends memur {
	protected String belge;

	public güvenlik(String adsoyad, int telefon, String email, String departman, String mesai, String belge) {
		super(adsoyad, telefon, email, departman, mesai);
		this.belge = belge;
	}

	protected String getBelge() {
		return belge;
	}

	protected void setBelge(String belge) {
		this.belge = belge;
	}
	
}
