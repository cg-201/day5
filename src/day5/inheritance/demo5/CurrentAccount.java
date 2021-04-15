package day5.inheritance.demo5;

// Multiple Inheritance
public class CurrentAccount implements Account, BasicAccount {

	// overriding means providing implementation
	@Override
	public void getFeatures() {
		System.out.println("Daily Tx Limit 50Cr");
	}

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
	}

	@Override
	public void abstractMethod1() {
		// TODO Auto-generated method stub
	}
	
	public void abstractMethod1(int n) {
		// TODO Auto-generated method stub
	}
	
	
	// things very intresting here!!
	@Override
	public String getAccountName() {
		return "Current Account Name";
	}
	

	@Override
	public String getAccountNumber() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	// Exclusive Feature
	public String businessServices() {
		return "Am Exclusive to Current Account";
	}

	@Override
	public void basicMethod() {
		// TODO Auto-generated method stub
		
	}
	

}
