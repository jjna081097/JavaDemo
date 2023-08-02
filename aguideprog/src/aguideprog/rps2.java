package aguideprog;
import java.util.*;

public class rps2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		String choices [] = {"rock","paper","scissor"};
				
		System.out.println("Enter your choice  Rock, Paper, Scissor: ");
		String userChoice = sc.nextLine().toLowerCase();
		
		int comp = r.nextInt(choices.length);
		String compChoice = choices[comp];
		System.out.println("Computer choice " +compChoice );
		
		
		if(userChoice.equals(compChoice)) {
			System.out.println("Tie!");
		}else if(userChoice.equals("rock")&& compChoice.equals("Scissor")|| 
				userChoice.equals("paper") &&compChoice.equals("rock")|| 
				userChoice.equals("scissors") && compChoice.equals("paper")){
			System.out.println("You win!");
		}else {
			System.out.println("Sorry you lose");
		}
	}

}
