package day5.inheritance.demo3;

public class Main {
	
	public static void main(String[] args) {
		
		// Account account = new Account();
		
		// CurrentAccount ca = new CurrentAccount();
		Account var1 = new CurrentAccount();
		
		//SavingAccount sa = new SavingAccount();
		Account var2 = new SavingAccount();
		
		
		// Compile and Runtime Polymorhism
		// Compile Time :: Task Of the Compiler checks, LHS
		// At Run Time :: JVM Checks RHS, Will goto child first, in failure it will go to parent
		String acname1 = var1.getAccountName();
		
		
		// Compile and Runtime Polymorhism
		// Compile Time :: Task Of the Compiler checks, LHS
		// At Run Time :: JVM Checks RHS, Will goto child first, in failure it will go to parent
		String acname2 = var2.getAccountName();
		
		
		System.out.println(acname1);
		System.out.println(acname2);
	}

}
