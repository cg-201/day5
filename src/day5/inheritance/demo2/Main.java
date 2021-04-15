package day5.inheritance.demo2;

public class Main {
	
	public static void main(String[] args) {
		
		// An object of Abstract class cannt be created!
		// Account account =  new Account();
		
		CurrentAccount ca = new CurrentAccount();
		ca.getFeatures();
		System.out.println(ca.getAccountName());
		System.out.println(ca.getAccountNumber());
		
		SavingAccount sa = new SavingAccount();
		sa.getFeatures();
		System.out.println(sa.getAccountName());
		System.out.println(sa.getAccountNumber());
				
	}

}
