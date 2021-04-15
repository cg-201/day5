package day5.inheritance.demo6;

public class CurrentAccount extends Account {

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
		
		// to access the parent version of implemenation
		super.getAccountName();
		
		return "Current Account Name";
	}
	
	// Exclusive Feature
	public String businessServices() {
		return "Am Exclusive to Current Account";
	}
	

}
