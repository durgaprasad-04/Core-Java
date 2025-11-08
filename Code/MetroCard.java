package Mentorship;

public class MetroCard {
	String name;
	int age;
	String email;
	long phone;
	double balance;
void welcome() {
	System.out.println("Welcome to Namma Metro");
}
void displayBalance() {
	System.out.println("Current balance:" +balance);
}
void displayDetails() {
	System.out.println("Name:" +name);
	System.out.println("Age:" +age);
	System.out.println("Email:" +email);
	System.out.println("Phone Number:" +phone);
	System.out.println("Balance:" +balance);
}
	public static void main(String[] args) {
		MetroCard m = new MetroCard();
		m.name="Durgaprasad";
		m.age=22;
		m.email="durgaprasaddp599@gmail.com";
		m.phone=9741943188l;
		m.balance= 10500.00;
		
		m.welcome();
		m.displayBalance();
		m.displayDetails();
	}

}
