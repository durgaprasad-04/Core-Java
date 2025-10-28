package CoreJava;

public class Cow1 {
	void givesMilk() {
		System.out.println("cow gives 1 litre of milk");
	}
	void eatgrass() {
		System.out.println("Cow eats 1 kg of grass");
	}
	public static void main(String[] args) {
		Cow1 c = new Cow1();
		c.givesMilk();
		c.eatgrass();

	}

}
