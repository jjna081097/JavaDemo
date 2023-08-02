package aguideprog;
import java.util.Scanner;
public class pizzaShop {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		
		double labor = 0.75 , rent = 1.00, materials = 0.05, diameter, cost;
		
		
		System.out.print("Enter the diameter of the pizza in inches: ");
		diameter =scan.nextDouble();
		
		materials *= diameter * diameter;
		
		cost = labor + rent + materials;
		
		System.out.print("The cost of making the pizza is:$" + cost);
	}

}
