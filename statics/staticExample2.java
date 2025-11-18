package statics;

public class staticExample2 {
	static String college="AJ";
	int id;
	String name;
	void show() {
		System.out.println(id+" "+ name +" "+ college );
	}

	public static void main(String[] args) {
		staticExample2 s = new staticExample2();
		s.id=101;
		s.name="Prasad";
		
		s.show();

	}

}
