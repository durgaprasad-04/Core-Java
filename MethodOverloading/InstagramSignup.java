package MethodOverloading;

public class InstagramSignup {
	 void signUp(String username, String password) {
		 System.out.println("Enter the username: "+username);
		 System.out.println("Enter the password:"+password);
	 }
	 void signUp(String email, int otp) {
		 System.out.println("Enter the Email:" +email);
		 System.out.println("enter the otp:" +otp);
	 }
	 void signUp(int otp, String email) {
		 System.out.println("Enter the Email:"+email);
		 System.out.println("enter the otp:" +otp);
	 }
	public static void main(String[] args) {
	InstagramSignup in = new InstagramSignup();
	in.signUp("durgaprasad","dpenter" );
	in.signUp("dp17@gmail.com", 978844);
	in.signUp(761875,"dp17@gmail.com" );

	}

}
