package ders8;

public class memur extends calisan implements devlet {
	protected String departman;
	protected String mesai;
	protected int sicilno;
	
	public memur(String adsoyad, int telefon, String email, String departman, String mesai) {
		super(adsoyad, telefon, email);
		this.departman = departman;
		this.mesai = mesai;
	}
	protected String getDepartman() {
		return departman;
	}
	protected void setDepartman(String departman) {
		this.departman = departman;
	}
	protected String getMesai() {
		return mesai;
	}
	protected void setMesai(String mesai) {
		this.mesai = mesai;
	}
    protected void calis() {
	System.out.println(getDepartman()+" "+getAdsoyad()+" "+getMesai()+" çalışıyor.");
	}
    
}
