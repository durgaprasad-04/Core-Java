package MethodOverloading;

public class InstagramLogin {
	void Login(String username, String email, String password ) {
		System.out.println("Login with username:" +username );
		System.out.println("Email: " +email );
		System.out.println("Password set successfully:"
				+ "" +password );
	}
	void Login(long phoneNumber, String password) {
	 System.out.println("Login with phone number:"  +phoneNumber);
	 System.out.println("Password:" +password);
 }
	 void Login(String googleAccount) {
		 System.out.println("Loging with Google Account:" +googleAccount);
	 }
	 void Login(String email, long phoneNumber, String password) {
		 System.out.println("Login using email:" +email+ "  and phone number " +phoneNumber);
 }
	public static void main(String[] args) {
	InstagramLogin login= new  InstagramLogin();
	login.Login("durga123","durgaprasad@gmail.com","mypassword");
	login.Login(9743324566L,"dpenter");
	login.Login("dpenter17@gmail.com");
	login.Login("durgaprasaddp599@gmail.com",7618779988L,"prasaddp");

	}

}
