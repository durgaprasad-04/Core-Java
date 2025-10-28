package CoreJava;

public class Cow4 {
	int givesmilk() {
		return 4;
	}
	public static void main(String[] args) {
		Cow4 c1 = new Cow4();
		Cow4 c2= new Cow4();
		Cow4 c3 = new Cow4();
		Cow4 c4 = new Cow4();
		int totalMilk=c1.givesmilk()+c2.givesmilk()+c3.givesmilk()+c4.givesmilk();
		System.out.println("total milk collected " + totalMilk + " litres ");

	}

}
