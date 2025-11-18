package InstanceBlock;

public class Student {
	String name;
	int age;
	{
		name="Prasad";
		age=25;
		System.out.println("hi");
	}
	{
		name="Vickky";
		age=23;
		System.out.println("hello");
	}
	{
		age=25;
		System.out.println("Namaste");
	}
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.name+" "+s.age);
		Student s1= new Student();
		System.out.println(s1.name+" "+s1.age);

	}

}
