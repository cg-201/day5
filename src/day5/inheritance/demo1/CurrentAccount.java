package day5.inheritance.demo1;

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

}
