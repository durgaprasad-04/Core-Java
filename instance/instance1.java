package instance;

 public class instance1 {
	int id;
	String name;
	void display() {
		System.out.println("Student ID:" +id );
		System.out.println("Student Name:" +name );
	}


	public static void main(String[] args) {
		instance1 i = new instance1();
		i.id=101;
		i.name="Prasad";
		instance1 i1= new instance1();
		i1.id=128;
		i1.name="Durga";

		i.display();
		i1.display();
	}

}
