package CoreJava;

public class teacher1 {
	void teaches(String subject1, String subject2, String subject3) {
		System.out.println("Teacher teaching multiple subjects like "+subject1+" " + subject2  +" "+  subject3);
	}
	public static void main(String[] args) {
		teacher1 t = new teacher1();
		t.teaches("Maths", "Science", "Social");

	}

}
