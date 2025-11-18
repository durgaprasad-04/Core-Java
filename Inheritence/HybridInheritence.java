package Inheritence;


public class A{
	void displayA() {
		System.out.println("From Class A");
	}
}
interface B{
	void displayB();
}
interface C{
	void displayC();
}

class D extends A implements B,C{
	public void displayB() {
		System.out.println("From Interface B");
	}
	public void displayC() {
		System.out.println("From Interface C");
	}
}
public class HybridInheritence {

	public static void main(String[] args) {
		D obj = new D();
		obj.displayA();
		obj.displayB();
		obj.displayC();

	}

}
