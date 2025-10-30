package statics;

public class Student {
	int id;
	String name;
	static String school="Pentagon";
	Student(int i,String n){
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id +" "+name+" "+school);
	}
	public static void main(String[] args) {
		Student s = new Student(1,"Prasad");
		Student s1 = new Student(2,"Vikky");
		 s.display();
		 s1.display();

	}

}
