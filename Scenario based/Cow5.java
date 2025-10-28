package CoreJava;

public class Cow5 {
	String name;
	int milkLitres;
	Cow5(String cowName, int milk){
		name=cowName;
		milkLitres=milk;
	}
	void showInfo() {
		System.out.println(name+ " gives "+ milkLitres +"  litres of milk ");
	}
	public static void main(String[] args) {
		Cow5 c1 = new Cow5("Ganga", 4);
		Cow5 c2 = new Cow5("Lakshmi",9);
		c1.showInfo();
		c2.showInfo();

	}

}
