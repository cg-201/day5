package day5;

public class D6InheritanceDemo {
	public static void main(String[] args) {
		System.out.println("");
	}
}


// 1. Very Generorous Eveyrthing accessible
class A {
	// data member
	public int money;
	public String vechicle;
	
	// member function
	public void getMoney() {}
	public void getVechicles() {}
}
class B extends A {}



// 2. Enforced Encapsulation
class C {
	private int money;
	private String vehicle;
	
	public void getVehicle() {}
}
class D extends C {}


//3. Negative Usecase :: Loan
abstract class E {
	public abstract void bankLoan();
}

class F extends E {
	@Override
	public void bankLoan() {}
}


// 4. Again generours.
class G {
	public void vehicle() {}; // parent
}
class H extends G {
	
	@Override
	public void vehicle() {} // you have modified the vehicle of your parent :: tranformed
}


// 5. Stricter Parent :: final
class I {
	public final void vechile() {}
}

class J extends I {}


// 6. Final Use Case :: No Inertiance :: No Relationship
final class K {}



// 7. Child is doing hard work  :: Type Casting. UpCasting / DownCasting
class M {
	public void method1() {}
}
class N extends M {
	// earned self by the child class
	public void method2() {}
	public void method3() {}
}























