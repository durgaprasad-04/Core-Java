package MethodOverriding;


  class Vehicle {
	void speed() {
		System.out.println("Vehicle speed is 60km/h");
	}
}

class Car extends Vehicle{
	@Override
	void speed() {
		System.out.println("Car speed is 120km/h");
	}
}
class Bike extends Vehicle{
	@Override
	void speed() {
		System.out.println("Bike is 100km/h");
	}
}
public class TestVehicle{
	public static void main(String[] args) {
		Vehicle v = new Car();
		v.speed();
		Vehicle v1 = new Bike();
		v1.speed();
		

	}

}
