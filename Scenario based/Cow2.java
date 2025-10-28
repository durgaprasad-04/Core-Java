package CoreJava;

public class Cow2 {
	void givesMilk(int litres) {
		System.out.println(" cow gives " + litres + " litres of milk ");
	}
	public static void main(String[] args) {
		Cow2 c= new Cow2();
		Cow2 c1= new Cow2();
		c.givesMilk(3);
		c1.givesMilk(7);

	}

}
