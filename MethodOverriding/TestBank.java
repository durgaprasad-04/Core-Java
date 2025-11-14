package MethodOverriding;


class Bank{
	double getRateOfInterest() {
		return 5.0;
	}
}
	class SBI extends Bank {
		@Override
		double getRateOfInterest() {
			return 6.5;
		}
	}
		class HDFC extends Bank{
			@Override
			double getRateOfInterest() {
				return 8.0;
			}
		}



public class TestBank {

	public static void main(String[] args) {
		Bank b1= new SBI();
		System.out.println("SBI Rate"+b1.getRateOfInterest());
		Bank b2 = new HDFC();
		System.out.println("HDFC Rate"+b2.getRateOfInterest());
		

	}
}
