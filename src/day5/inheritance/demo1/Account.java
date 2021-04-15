package day5.inheritance.demo1;

public abstract class Account {

	public String getAccountNumber() {
		return "AC123456789";
	}
	
	public String getAccountName() {
		return "Random Account Name";
	}
	
	
	// asbtract :: declaration of method :: No body
	// implementation is different for different child
	// put common things in parent class
	public abstract void getFeatures();
	
	public abstract void abstractMethod();
	public abstract void abstractMethod1();
}
