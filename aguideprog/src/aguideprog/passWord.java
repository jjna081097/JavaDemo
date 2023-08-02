package aguideprog;
import java.util.Scanner;
public class passWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean approve = false;
	String passWord = "norimaNumbawan";
	int attemps = 0;
	int maxattemp = 3;
	while(attemps< maxattemp) {
	System.out.print("Enter the password: ");
	String pass = scan.next();
	
	if(pass.equals(passWord)) {
		System.out.println("Welcome");
		approve = true;
		break;
	}else {
		System.out.println("the password you typed is incorrect:  ");
		attemps++;
	}
	}
	
	if(!approve) {
		System.out.println("Access denied");
	}
	}
}
