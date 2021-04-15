package day5.inheritance.demo;

public class Main {
	
	public static void main(String[] args) {
		
		// parent class
		Account account = new Account();
		System.out.println(account);
		
		CurrentAccount ca = new CurrentAccount();
		String acname = ca.getAccountName();
		String acnumber = ca.getAccountNumber();
		
		System.out.println(acname + acnumber);
		
		SavingAccount sa = new SavingAccount();
		String saname = sa.getAccountName();
		System.out.println(saname);
				
	}

}
