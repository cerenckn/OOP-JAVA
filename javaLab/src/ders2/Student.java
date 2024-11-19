package ders2;

public class Student {
	private String name,surname;
	private int note;
	private String HarfNotu;
	Student(String name,int note,int HarfNotu){
		this.name=name;
		this.surname=surname;
		if(note<0 && note>100)
			System.out.println("Girilen not uygun değildir");
		else
			this.note=note;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public String getHarfNotu() {
		if (note>=90)
			System.out.println("AA");
	    else if (85<=note&& note<90 )
	    	System.out.println("BA");
	    else if (80<=note&& note<85 )
	    	System.out.println("BB");
	    else if (75<=note&& note<80 )
	    	System.out.println("CB");
	    else if (70<=note&& note<75 )
	    	System.out.println("CC");
	    else if (65<=note&& note<70 )
	    	System.out.println("DC");
	    else if (60<=note&& note<65 )
	    	System.out.println("DD");
	    else if (55<=note&& note<60 )
	    	System.out.println("FD");
	    else
	    	System.out.println("Kaldınız!");
		return HarfNotu;
	}
	public void show( ) {
		;
	}
}
