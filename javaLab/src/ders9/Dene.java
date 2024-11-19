package ders9;

public class Dene {
	public static void main(String[] args) {
		Employee e1=new Employee("Ahmet","Mehmet");
		e1.infoBox();
		Employee e2=new Employee("ceren","çeken",40000);
		e2.infoBox();
		System.out.println("Yeni maas: "+e2.makeRaise(1000));
		e2.infoBox();
		engineer en1=new engineer();// constructorı böyle boş verince aşağıdaki gibi tanımlamak zorundayız
		en1.setName("Ali");
		en1.setSurName("veli");
		en1.setJob("baş mühendis");
		en1.setAnnualPermit(30);
		en1.setSalary(100000);
		en1.infoBox();
		en1.test();
		Employee e3=new engineer(" kübra"," ocak",65000);//Kullandığımız sınıf ile oluşturduğumuz constructor farklı
		//hem enginneer hem empoyee sınıfının fonksiyonları kullanılıyor
		e3.infoBox();
		
		
	}

}
