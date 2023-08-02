package aguideprog;
import java.util.Scanner;
public class CarRecall {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter your car model Number: ");
		int modelNumber = scan.nextInt();
		
		
		if(modelNumber == 119 || modelNumber == 179 || modelNumber >= 189 && modelNumber <= 195 || modelNumber == 221 || modelNumber ==780) {
			System.out.println("your car is defective it needs repair!");
		}else {
			System.out.println("your car is not defective");
		}
	}

}
