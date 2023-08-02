package aguideprog;
import java.util.Scanner;
public class groupAssigment {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName, lastName;
		
		System.out.println("Enter your first name: ");
		firstName = scan.nextLine();
		
		System.out.println("Enter your last name: ");
		lastName= scan.nextLine();
		
		int lastIndex = lastName.lastIndexOf(0);
		lastName = lastName.substring(lastIndex + 1);
		char firstLetter = Character.toUpperCase(lastName.charAt(0));
		
		String groupAssignment;
		
		if(firstLetter >= 'A' && firstLetter <= 'I') {
			groupAssignment = "Group 1";	
			
		}else if(firstLetter >= 'J' && firstLetter <= 'S') {
				groupAssignment = "Group 2";
		
		}else if(firstLetter >= 'T' && firstLetter <= 'Z') {			
			groupAssignment = "Group 3";	
	}
		else {
			groupAssignment = "Group not assigned";
		}
		 System.out.println("Your group assignment is: " + groupAssignment);

	}
}
