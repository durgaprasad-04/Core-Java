package Code;

public class Car {
	void speed() {
		System.out.println("Car goes very speed");
	}
	void drive() {
		System.out.println("I'm going for a drive");
	}

}
class BMW extends Car{
	void drift() {
		System.out.println("BMW does drifting");
	}
}
class Audi extends Car{
	void goes() {
		System.out.println("Audi goes 400km/hr");
	}
}
