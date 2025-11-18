package statics;

public class Hello {
	static String name="Durgaprasad";
	int age;
	static long phno=978654322l;
	String address;
	
	void display() {
		System.out.println(" Name " +name+ " Age " +age+ " phone " +phno+ " Address " +address);
	}
	

	public static void main(String[] args) {
		Hello h = new Hello();
		h.age=24;
		h.address="Mangalore";
		h.display();
	}

}
