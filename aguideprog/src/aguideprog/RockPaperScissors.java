package aguideprog;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		final int rock =1 , paper =2, scissors = 3;
		int player, computer;
		boolean loop = true;
		while (loop) {
		System.out.println("Enter your move: 1= Rock, 2= Paper, 3=Scissors: ");
		player = scan.nextInt();
	
	computer = rand.nextInt(3) + 1;
	System.out.println("player throws");
	
	switch (player) {
	case rock: System.out.println("Rock"); break;
	case paper: System.out.println("Paper"); break;
	case scissors: System.out.println("Scicssors"); break;
	}
	System.out.println("Computer move ");
	switch(computer) {
	case rock: System.out.println("Rock"); break;
	case paper: System.out.println("Paper"); break;
	case scissors: System.out.println("Scicssors"); break;
	}
	
	if (player == rock && computer == rock) {
	System.out.println("Draw");
	}else if (player == rock && computer == paper){
		System.out.println("Computer wins!");
	}else if (player == rock && computer == scissors) {
		System.out.println("Player wins!");
} 
	if (player == paper && computer == paper) {
		System.out.println("Draw");
	}else if (player == paper && computer == rock) {
		System.out.println("Player wins!");
	}else if(player == paper && computer == scissors) {
		System.out.println("Computer wins!");
	}
	if (player == scissors && computer == paper) {
		System.out.println("Player wins!");
	}else if(player == scissors && computer == rock) {
		System.out.println("Computer wins!");
	}else if(player == scissors && computer == scissors) {
		System.out.println("Draw");
	}
		}
	}
	
}
