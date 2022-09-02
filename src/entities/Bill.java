package entities;

public class Bill {

	public String gender;
	public int beer, barbecue, softDrink;
	
	public double cover() {
		 if (feeding() < 30) {
			 return 4.0;
		 }
		 else {
			 return 0.0;
		 }
	}
	
	public double feeding() {
		 return beer*5 + barbecue*7 + softDrink*3;
	}
	
	public double ticket() {
		 if (gender.equals("M")) {
			 return 10;
		 }
		 else {
			 return 8;
		 }
	}
	
	public double total() {
		 return cover() + feeding() + ticket();
	}
	
}
