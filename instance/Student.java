package instance;

public class Student {
	int id;
	String name;
	int marks;
	String rollno;
	String address;
	void displayDetails() {
		System.out.println("Student Id"+id);
		System.out.println("Student Name"+name);
		System.out.println("Student Marks"+marks);
		System.out.println("Student rollNo"+rollno);
		System.out.println("Student Address"+address);
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.id=171;
		s.name="Prasad";
		s.marks=99;
		s.rollno="Twentyone";
		s.address="Bengaluru";
		s.displayDetails();

	}

}
