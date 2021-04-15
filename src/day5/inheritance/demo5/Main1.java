package day5.inheritance.demo5;

public class Main1 {
	
	public static void main(String[] args) {
		
		// Up Casting :: 
		// At the time of upcasting, will loose the exclusive feature of child class.
		Account var1 = new CurrentAccount();
		
		
		// downcast :: back to original form
		if(var1 instanceof CurrentAccount) {
			CurrentAccount var11 = (CurrentAccount) var1;
			var11.businessServices();
		}
		
		
		Account var2 = new SavingAccount();
		if(var2 instanceof CurrentAccount) {
			CurrentAccount var22 = (CurrentAccount) var2;
			var22.businessServices();
		}
	}

}
