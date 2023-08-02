package aguideprog;
import java.util.Scanner;
public class gcd {

	public static int gcd(int num1,int num2) {
		while (num2 > 0) {
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
		return num1;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Enter a number: ");
		num1 = scan.nextInt();
		
		System.out.println("Enter second Number: ");
		num2 = scan.nextInt();
		int result = gcd(num1,num2);
		
		System.out.println("the gcd is: "+ result);
		scan.close();
	}
	
}
	
