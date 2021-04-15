package day5.inheritance.demo5;

// 100% abstract class
// all method are public
// all method are abstract
// and overall 100% abstract
public  interface Account {
	int i = 100;
	
	String getAccountName() ;
	String getAccountNumber();
	
	void getFeatures();
	void abstractMethod();
	void abstractMethod1();
	
	
	// Static Method :: Java 8 :: Contract
	// by contract :: lamda
	static void staticMethod1() {
		// proper logical static method
		System.out.println("I am satic method in interface!!");
		System.out.println("I have been addded in Java 8");
	}
	
	default void someDefaultMethod() {
		// ...default
	}
	
}
