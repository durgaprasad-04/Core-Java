package ConstructorOverloading;

public class Student {
	String name;
	int age;
	Student(String name, int age){
		this.name=name;
		this.age=age;
	}
	Student(String name){
		this.name=name;
	}
	Student(int age){
		this.age=age;
	}
	public static void main(String[] args) {
		Student s = new Student("Prasad",23);
		System.out.println(s.name+" "+s.age);
		Student s1 = new Student("Dp");
		System.out.println(s.name);

	}

}
