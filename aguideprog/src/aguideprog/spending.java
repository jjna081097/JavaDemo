package aguideprog;
import java.util.Scanner;
public class spending {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Food: ");
		double food = scan.nextInt();
		System.out.print("Clothing");
		double clothes = scan.nextInt();
		System.out.print("Entertainment: ");
		double entertainment = scan.nextInt();
		System.out.print("Rent: ");
		double rent = scan.nextInt();
		
		double total = (food + clothes +entertainment + rent);
			double foodperc = (food / total) * 100;
			double clothesperc = (clothes / total) * 100;
			double entertainmentperc = (entertainment / total) * 100;
			double rentperc = (rent/ total) * 100;
		
			System.out.println("Category\t\tPercentage");
		      System.out.println("--------\t\t----------");
		      System.out.printf("Food\t\t\t%.2f%%\n", foodperc);
		      System.out.printf("Clothing\t\t%.2f%%\n", clothesperc);
		      System.out.printf("Entertainment\t\t%.2f%%\n", entertainmentperc);
		      System.out.printf("Rent\t\t\t%.2f%%\n", rentperc);
		      
	}

}
