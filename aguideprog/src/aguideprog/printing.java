package aguideprog;
import java.util.Scanner;

public class printing {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the number of copies to be printed: ");
		int copy = scan.nextInt();
		
		double costPerCopy;
		
		if(copy >= 0 && copy <= 99 ) {
			costPerCopy = 0.30;
			
		}else if (copy >= 100 && copy <= 499){
			costPerCopy = 0.28;
			
		} else if (copy >= 500 && copy <= 749) {
			costPerCopy = 0.27;
			
		} else if (copy >= 750 && copy <= 1000) {
			costPerCopy = 0.26;
			
		} else  {
			costPerCopy = 0.25;	
		}
		double totalCost = copy * costPerCopy;
		
		System.out.println("Price per Copy is: " + costPerCopy);
		System.out.println("The Total Cost is: " +totalCost);
	}

}
