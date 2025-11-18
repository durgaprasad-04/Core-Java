package Encapsulation;

public class Bank {

	private String accName;
	private int number;
	
	public void setaccName(String x) {
		   if (x != null && !x.isEmpty() && x.matches("[a-zA-Z ]+")) {
		        accName = x;
		    } else {
		        System.out.println("Invalid Name");
		    }
		}
	

	public String getaccName() {
		return accName;
	}
	
	public void setnumber(int y) {
		if(y>0) {
			number=y;
		}
	}
	public int getnumber() {
		return number;
	}
	}
	


