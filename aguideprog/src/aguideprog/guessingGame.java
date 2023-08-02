package aguideprog;
import java.util.Scanner;
import java.util.Random;
public class guessingGame {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int player, computer;
		
		System.out.println("Enter a number between 1 and 20: ");
		player = input.nextInt();
		
		computer = rand.nextInt(20)+1;
		System.out.println("Computer Number: "+computer);
		
		System.out.println("players Number: "+ player);
		
		if(player == computer) {
			System.out.println("You won!");
		}else {
			System.out.println("you lose!");
		}
	}

}
