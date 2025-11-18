package local;

public class Car {
	void display() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Total sum is"+c);
	}

	public static void main(String[] args) {
		Car c = new Car();
		
		c.display();
	}

}
