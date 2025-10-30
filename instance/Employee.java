package instance;

public class Employee {
	int empId;
	String empName;
	//constructor to initialize instance variables
	Employee(int id, String name){
		empId=id;
		empName=  name;
	}
	void show() {
		System.out.println(empId+""+empName);
	}
	public  static void main(String[]args) {
		Employee e1= new Employee(111," Prasad ");
		Employee e2= new Employee(222, " Patheek ");

		e1.show();
		e2.show();
	}

}
