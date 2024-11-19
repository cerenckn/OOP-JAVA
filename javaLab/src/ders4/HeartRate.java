package ders4;

public class HeartRate {
	private String adi;
	private String soyadi;
	private int dogumyili;
	private int suankiyil;
	private int mhr;
	public HeartRate(String adi,String soyadi,int dogumyili,int suankiyil) {
		this.adi=adi;
		this.soyadi=soyadi;
		this.dogumyili=dogumyili;
		this.suankiyil=suankiyil;
	}

	public String getadi() {
		return adi;
	}

	public void setadi(String adi) {
		this.adi = adi;
	}

	public String getsoyadi() {
		return soyadi;
	}

	public void setsoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public int getdogumyili() {
		return dogumyili;
	}

	public void setdogumyili(int dogumyili) {
		this.dogumyili = dogumyili;
	}

	public int getsuankiyil() {
		return suankiyil;
	}

	public void setsuankiyil(int suankiyil) {
		this.suankiyil = suankiyil;
	}
	public int maxHeartRate() {
		return 220-(suankiyil-dogumyili);
	}
	public int targetHeartRate() {
		int mhr=maxHeartRate();
		return (int)(mhr * 0.8);
	}
	
	public void show(){
		System.out.println("Adı: "+ adi);
		System.out.println("Soyadı: "+ soyadi);
		System.out.println("Doğum yılı: "+ dogumyili);
		System.out.println("Mhr: "+ maxHeartRate());
		System.out.println("thr: "+ targetHeartRate());		
		

	}
}
