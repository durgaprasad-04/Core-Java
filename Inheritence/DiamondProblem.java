package Inheritence;

interface A{
	default void show() {
		System.out.print("A");
	}
}
interface B extends A{}
interface C extends A{}

class D implements B,C{
	@Override
	public void show() {
		System.out.println("D overrides show()");
	}
}
public class DiamondProblem {

	public static void main(String[] args) {
	D obj= new D();
	obj.show();

	}

}
