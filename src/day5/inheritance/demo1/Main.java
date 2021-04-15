package day5.inheritance.demo1;

public class Main {
	
	public static void main(String[] args) {
		
		// An object of Abstract class cannt be created!
		// Account account =  new Account();
		
		CurrentAccount ca = new CurrentAccount();
		ca.getFeatures();
		
		SavingAccount sa = new SavingAccount();
		sa.getFeatures();
				
	}

}
