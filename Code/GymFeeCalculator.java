package Mentorship;

public class GymFeeCalculator {
	void calculateFee(int months) {
		int total=months*500;
		System.out.println("Normal Plan for "+months+" months is Rs."+total);
	}
	void calculateFee(int months, double discount) {
		double total = months*500;
		double discountedTotal= total-(total*discount/100);
		System.out.println("Normal Plan with "+discount+"% discount for " +months+ " months :Rs."+discountedTotal);
	}
	void calculateFee(int months, String planType) {
		int ratePerMonth;
		if(planType.equalsIgnoreCase("Normal")) {
			ratePerMonth=500;
		} else if(planType.equalsIgnoreCase("Prime")){
				ratePerMonth =1000;
		} else if(planType.equalsIgnoreCase("Gold")) {
			ratePerMonth=2000;
		} else {
			System.out.println("Invalid plan type");
			return;
		}
		int total=months*ratePerMonth;
		System.out.println(planType+" Plan for "+months+" months: Rs."+total);
		
	}
	public static void main(String[] args) {
		GymFeeCalculator g = new GymFeeCalculator();
		g.calculateFee(8);
		g.calculateFee(4, 20.0);
		g.calculateFee(6, "Prime");
		g.calculateFee(5, "Gold");
	
	}
}
