package MethodOverloading;

public class Bank {
	void calculate(String username,int amount, long phno) {
		System.out.println("Username"+username);
		System.out.println("Amount"+amount);
		System.out.println("Phone number"+phno);
	}
	void calculate(String email, String date,String address) {
		System.out.println("Email"+email);
		System.out.println("Date"+date);
		System.out.println("Address"+address);
	}
	void calculate(long phno, String date,String email) {
		System.out.println("Phone number"+phno);
		System.out.println("Date"+date);
		System.out.println("Email"+email);
	}
	
	public static void main(String[] args) {
		Bank b = new Bank();
		b.calculate("Durga", 15000, 9731875100l);
		b.calculate("durga@gmail.com", "7/1/2003", "Mangalore");
		b.calculate( 9876543210l, "3/1/2003", "dp@gmail.com");

	}

}
