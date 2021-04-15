package day5.inheritance.demo6;


public class Main {
	
	public static void main(String[] args) {
		
		// Account account = new Account();
		
		// CurrentAccount var1 = new CurrentAccount(); // 6 Methos including the Exclusive Feature
		Account var1 = new CurrentAccount(); // UP CASTING :: we are missing the exclusive feature
		
		
		// Compile and Runtime Polymorhism
		// Compile Time :: Task Of the Compiler checks, LHS
		// At Run Time :: JVM Checks RHS, Will goto child first, in failure it will go to parent
		String acname1 = var1.getAccountName();
		
		
		// exclusive services
		if(var1 instanceof CurrentAccount) {
			// ((CurrentAccount)var1).businessServices();
			CurrentAccount var11 = (CurrentAccount) var1; // downcasting
			var11.businessServices();
		}
		
		
		
		
		System.out.println(acname1);
	}

}
