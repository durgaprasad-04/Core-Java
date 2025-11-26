package supercalling;

public class Vehicle {
	String brand;
	Vehicle(String brand){
		this.brand=brand;
	}
}
class Car extends Vehicle{
	int speed;
	Car(String brand, int speed){
		super(brand);
		this.speed=speed;
	}
	public static void main(String[] args) {
		Car c = new Car("Honda",120);
		System.out.println(c.brand+" "+c.speed);
		
		Vehicle v = new Vehicle("Toyota");
		System.out.println(v.brand);

	}

}
