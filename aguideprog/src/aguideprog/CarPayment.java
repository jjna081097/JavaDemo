package aguideprog;
import java.util.Scanner;
public class CarPayment {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double interestRate = 0.07;
		
		System.out.println("Principal: ");
		double principal = scan.nextDouble();
		
		System.out.println("Interest rate: " + interestRate);
		
		System.out.println("Number of Monthly payments: ");
		int month = scan.nextInt();
		
	double	totalPayment = principal * (interestRate/12) / (1 - Math.pow(1+ interestRate/12, -month));
	//double roundedValue = totalPayment * 10;
	System.out.println("The monthly payments is: " + totalPayment);
		
	}

}
