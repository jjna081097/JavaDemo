package aguideprog;;

public class investment {

	public static void main(String[] args) {
		
		double presentValue = 2500;
		double futureValue = 5000;
		double annualRate = 0.075;
		
		
		int years  = calculateYears(presentValue, futureValue, annualRate);	
		System.out.println("it will take "+ years +"years for a $"+ presentValue+ "to grow to at least $"+futureValue);
	}

	private static int calculateYears(double presentValue, double futureValue, double annualRate) {
		
	int years = 0;
	
	while (presentValue <futureValue) {
		presentValue *= (1+ annualRate);
	years++;
	}
	return years;	
	}

}
