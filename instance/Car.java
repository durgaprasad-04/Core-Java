package instance;

public class Car {
	String color;
	String brand;
	int year;
	void show() {
		System.out.println(" Brand :"+ brand);
		System.out.println(" Color :"+ color);
		System.out.println(" Year: "+ year);
	}
	public static void main(String[] args) {
		Car c = new Car();
		c.color="red";
		c.brand="BMW";
		c.year=2025;
		c.show();

	}

}
