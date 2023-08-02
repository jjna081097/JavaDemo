package aguideprog;
import java.util.Scanner;
public class order {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of burgers: ");
		double burger = scan.nextDouble();
		System.out.print("Enter number of fries: " );
		double fries = scan.nextDouble();
		System.out.print("Enter number of sodas: ");
		double soda = scan.nextDouble();
		
		double totalCost = (burger *1.69) +(fries * 1.09) +(soda* 0.99);
		double tax = totalCost * 0.065;
		double finalTotal = totalCost + tax;
		System.out.println("Total before tax: "+totalCost);
		System.out.println("Tax: " +tax);
		System.out.println("final Total: $"+ finalTotal);
		System.out.println("Enter amount tendered: ");
		double payed = scan.nextDouble();
		double change = payed - finalTotal;
		if(payed < finalTotal) {
		System.out.println("Insufficient funds");
		}else {
			System.out.print("change is: " +change);
		}
		scan.close();
	}

}
