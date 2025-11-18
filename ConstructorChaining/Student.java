package ConstructorChaining;

public class Student {
	String name;
	int age;
	double sal;
	Student(String name){
		this.name=name;
	}
	Student(String name, int age){
		this(name);
		this.age=age;
		}
	Student(String name , int age, double sal){
		this(name, age);
		this.sal=sal;
	}
	public static void main(String[] args) {
		Student s = new Student("Prasad",23, 50000.0);
		System.out.println(s.name+" "+s.age+" "+s.sal);

	}

}
