package aguideprog;
import java.util.Scanner;
public class Grading {

	public static void main(String[] args) {
		Scanner scan =  new Scanner (System.in);
		boolean loop = true; // for while loop
		while (loop) {
		System.out.print("Enter the percentage: ");
		int grade = scan.nextInt(); // user input
		
		String gradeLetter = ""; // to determine what grade letter will be
		if (grade >= 90) {
		gradeLetter = "A";
		} else if(grade >= 80) {
			gradeLetter = "B";
		}else if(grade >= 70) {
			gradeLetter = "C";
		}else if (grade >= 60) {
			gradeLetter = "D";
		}else{
			gradeLetter = "F";
		}
		System.out.println("The corresponding Letter grade is: "+ gradeLetter); //prints gradeletter
	}
	}
}
