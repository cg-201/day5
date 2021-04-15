package day5.inheritance.demo6;

public abstract class Account {
	
	// abstrcat Account(){}

	// Normal Method :: OPtional :: Child can override
	public String getAccountName() {
		return "Random Account Name";
	}
	
	// Final MEthod :: CHILD Cant Override
	public final String getAccountNumber() {
		return "AC123456789";
	}
	
	// Abstract Method :: Child Has to Overridee
	// asbtract :: declaration of method :: No body
	// implementation is different for different child
	// put common things in parent class
	public abstract void getFeatures();
	public abstract void abstractMethod();
	public abstract void abstractMethod1();
}
