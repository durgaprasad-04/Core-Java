package instance;

public class one {
	String name;
	int age;
	String email;
	void display() {
		System.out.println("Name"+name);
		System.out.println("Age"+age);
		System.out.println("Email"+email);
	}
	public static void main(String[] args) {
		one o = new one();
		o.name="prasad";
		o.age = 23;
		o.email="durgaprasad@gmil.com";
		o.display();
	}

}
