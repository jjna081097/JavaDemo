package aguideprog;
import java.util.Scanner;
public class volumes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Length: ");
		double length = scan.nextInt();
		
		System.out.println("Enter the Width: ");
		double width = scan.nextInt();
		
		System.out.println("Enter the height: ");
		double height = scan.nextInt();
		
		double prismVolume = length * width * height;
		
		System.out.println("The volume is: " + prismVolume);
		
		
		//sphere //
		
		System.out.println("Enter Radius: ");
		int radius = scan.nextInt();
		double radiusVolume = (4.0/3.0) *Math.PI *Math.pow(radius, 3) ;
		System.out.println("The volume is: "+ radiusVolume);
	
	//cube
		
		System.out.println("Enter the length of each side: ");
		double side = scan.nextDouble();
	double	cubeVolume = Math.pow(side, 3);
		System.out.println("the volume of cube is: " +cubeVolume);
	}

}
