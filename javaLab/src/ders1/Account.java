package ders1;

public class Account {
		private String name;
		private int bakiye;
		
		Account(String name,int bakiye)
		{
			this.name=name;
			if(bakiye<0)
				System.out.println("Bakiye sıfırdan küçük olamaz!");
			else
				this.bakiye=bakiye;
		}
		public void setName(String name) {
			this.name=name; 
		}
		public String getName() {
			return name;
		}
		public int getBakiye() {
			return bakiye;
		}
		public void depositmoney(int miktar ) {
			bakiye+=miktar;
		}

}
