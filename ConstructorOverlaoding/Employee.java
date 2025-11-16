package ConstructorOverloading;

public class Employee {
	String name;
	double salary;
	int id;
	Employee(String name){
		this.name=name;
	}
	Employee(String name, double salary){
		this.name=name;
		this.salary=salary;
	}
	Employee(String name, double salary, int id){
		this.name=name;
		this.salary=salary;
		this.id=id;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee("Nagendra ");
		System.out.println(e.name+"  "+e.salary+"  "+e.id);
		Employee e1 = new Employee("Jeevith",35000.0);
		System.out.println(e1.name+"  "+e1.salary+"  "+e1.id);
		Employee e2 = new Employee("Prasad",50000.00,150);
		System.out.println(e2.name+"  "+e2.salary+"  "+e2.id);
		

	}

}
