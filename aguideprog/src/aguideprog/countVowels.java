package aguideprog;
import java.util.Scanner;
public class countVowels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vowelCount = 0;
		
		System.out.println("enter text: ");
	String	text = scan.nextLine();
		for(int i = 0; i <text.length(); i++) {
			char a = text.charAt(i);
			if(Character.isLetter(a)) {
				if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                    vowelCount++;
				}
			}
		}
		System.out.println("Number of vowels: " + vowelCount);
	}

}
