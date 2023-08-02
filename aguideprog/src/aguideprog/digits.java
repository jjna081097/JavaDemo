package aguideprog;
import java.util.Scanner;
public class digits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			int num,ones,tens,hundreds;
		System.out.println("Enter a three-digit number: ");
		num = scan.nextInt();
		ones = num % 10; // to get ones
		tens  = (num / 10) % 10; // to get tens
		hundreds = num /100; // to get hundreds
		System.out.println("the hundreds-pace digit is: "+ hundreds);
		System.out.println("the tens-pace digit is: " + tens);
		System.out.println("the ones-pace digit is: " + ones);
		scan.close();
	}

}
