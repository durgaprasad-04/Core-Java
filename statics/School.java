package statics;

public class School {
	String name;
	int id;
	static String school="Anugraha";
	void students() {
		System.out.println("Student name"+name+",ID:"+id+",school name"+school);
	}
	public static void main(String[] args) {
		School s = new School();
		s.name="Prasad";
		s.id=179;
		s.students();
		

	}

}
