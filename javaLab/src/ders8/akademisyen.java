package ders8;

public class akademisyen extends calisan implements devlet {
	protected String bolum;
	protected String gorev;
	protected String dersler;
	protected int sicilno;
	
	
	public akademisyen(String adsoyad, int telefon, String email, String bolum, String gorev, String dersler) {
		super(adsoyad, telefon, email);
		this.bolum = bolum;
		this.gorev = gorev;
		this.dersler = dersler;
	}
	protected void dersegir() {
		System.out.println(getGorev()+" "+ getAdsoyad() +" "+getDersler() +" DERSİNE GİRDİ.");

	}
	public void Giris() {
		System.out.println(getGorev()+" "+ getAdsoyad()+" giriş yaptı ");

	}
	protected String getBolum() {
		return bolum;
	}
	protected void setBolum(String bolum) {
		this.bolum = bolum;
	}
	protected String getGorev() {
		return gorev;
	}
	protected void setGorev(String gorev) {
		this.gorev = gorev;
	}
	protected String getDersler() {
		return dersler;
	}
	protected void setDersler(String dersler) {
		this.dersler = dersler;
	}
	public int getSicilNo() {
		return sicilno;
	}
	public void setSicilNo(int sicilno) {
		this.sicilno=sicilno;
    }
	

}
