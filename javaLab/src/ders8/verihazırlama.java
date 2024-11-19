package ders8;

public class verihazırlama extends memur{
	protected String gorev;

	public verihazırlama(String adsoyad, int telefon, String email, String departman, String mesai, String gorev) {
		super(adsoyad, telefon, email, departman, mesai);
		this.gorev = gorev;
	}
	protected void yazisma()
	{
		System.out.println(getDepartman()+getGorev()+getAdsoyad()+"yazisma yaptı.");

	}
	protected String getGorev() {
		return gorev;
	}
	protected void setGorev(String gorev) {
		this.gorev = gorev;
	}
}
