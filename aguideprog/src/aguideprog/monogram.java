package aguideprog;
import java.util.Scanner;
public class monogram {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String firstName, lastName, middleName;
	
	
	System.out.println("Enter your first name: ");
	firstName = scan.nextLine();
	
	System.out.println("Enter your middle Initial: ");
	middleName = scan.nextLine();
	
	System.out.println("Enter your last name: ");
	lastName = scan.nextLine();
	
	char firstInitial = Character.toLowerCase(firstName.charAt(0));
	char middleInitial = Character.toLowerCase(middleName.charAt(0));
	char lastInitial = Character.toUpperCase(lastName.charAt(0));
	
	System.out.println("Your monogram is: " + firstInitial + middleInitial + lastInitial);
	
	}
}
