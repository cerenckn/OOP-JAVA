package ders9;

public class worker extends Employee {
	 String department;
	 worker(String name, String surName){
		 super(name,surName);
		 this.department = "Bilgi Islem";
		 setJob("Teknisyen");
		 setAnnualPermit(10);
		 setSalary(45000);
	 }
	protected String getDepartment() {
		return department;
	}
	protected void setDepartment(String department) {
		this.department = department;
	}
}
