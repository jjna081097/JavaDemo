package aguideprog;
import java.util.Scanner;
public class exer1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double height, time;
		
		System.out.print("Enter a time less than 4.5 seconds: ");
		time = scan.nextDouble();
	
	if (time <4.5) {
 height = 100 -4.9 * Math.pow(time, 2);	
	
	System.out.print("The height of the object is: "+ height);
	}else {
		System.out.println("invalid input: time should be less than 4.5");
	}
		
	}

}
