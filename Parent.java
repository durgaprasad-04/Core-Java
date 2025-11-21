package superkeywords;

public class Parent {

	int x=100;
	void m() {
		System.out.println("Hello");
	}
}
class child  extends Parent{
	int x=200;
	void m() {
		System.out.println(this.x);
		System.out.println(super.x);
		super.m();
	}
	public static void main(String[] args) {
		child  c = new child();
		c.m();
	}
}
