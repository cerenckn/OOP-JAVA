package ders8;

public class asistan extends akademisyen {
	protected String yuksekorg;

	public asistan(String adsoyad, int telefon, String email, String bolum, String gorev, String dersler,String yuksekorg) {
		super(adsoyad, telefon, email, bolum, gorev, dersler);
		this.yuksekorg=yuksekorg;
	}
	protected void labagir() {
		System.out.println(getYuksekorg()+" "+getAdsoyad()+ "laba girdi.");

	}
	protected String getYuksekorg() {
		return yuksekorg;
	}
	protected void setYuksekorg(String yuksekorg) {
		this.yuksekorg = yuksekorg;
	}

}
