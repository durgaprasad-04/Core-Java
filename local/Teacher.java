package local;

public class Teacher {
	void teach() {
		String subject1="Maths";
		String subject2="Science";
		String subject3="Social";
		System.out.println("The teacher is teaching " + subject1 + ", " + subject2 + ", and " + subject3
                + " with detailed explanations and real-world examples to make learning interesting.");
	}
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.teach();

	}

}
