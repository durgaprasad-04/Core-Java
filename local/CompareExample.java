package local;

public class CompareExample {
	int a=100;
	void display() {
		int a=10;
		System.out.println("Local Variable a="+a);
		System.out.println("Instance variable a="+this.a);
		
	}
public static void main(String[] args) {
  CompareExample c= new CompareExample();
  c.display();
	}

}
