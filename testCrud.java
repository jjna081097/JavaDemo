package samplecrud;
import java.util.LinkedList;
import java.util.Scanner;

public class testCrud {
	private static final Scanner scan = new Scanner(System.in);
	
    public static void main(String[] args) {
        LinkedList<String> emailList = new LinkedList<>();
        
        boolean running = true;

        while (running) {
            System.out.println("Choose:");
            System.out.println("1. Add Email");
            System.out.println("2. View All Email Address");
            System.out.println("3. Update Email Address");
            System.out.println("4. Delete Email Address");
            System.out.println("5. Exit");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    addEmail(emailList);
                    break;
                case 2:
                    viewEmails(emailList);
                    break;
                case 3:
                    updateEmail(emailList);
                    break;
                case 4:
                    deleteEmail(emailList);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scan.close();
    }

    private static void addEmail(LinkedList<String> emailList) {
        System.out.print("Enter the email address to add: ");
        String email = scan.next();
        emailList.add(email);
        System.out.println("Email address added successfully.");
    }

    private static void viewEmails(LinkedList<String> emailList) {
        if (emailList.isEmpty()) {
            System.out.println("No emails to display.");
        } else {
            System.out.println("Email addresses:");
            for (String email : emailList) {
                System.out.println(email);
            }
        }
    }

    private static void updateEmail(LinkedList<String> emailList) {
        System.out.println("Enter the email address to update: ");
        String oldEmail = scan.next();
        System.out.println("Enter the new email address: ");
        String newEmail = scan.next();

        int index = emailList.indexOf(oldEmail);
        if (index != -1) {
            emailList.set(index, newEmail);
            System.out.println("Email address updated successfully.");
        } else {
            System.out.println("Email address not found.");
        }
    }

    private static void deleteEmail(LinkedList<String> emailList) {
        System.out.println("Enter the email address to delete: ");
        String emailToDelete = scan.next();

        if (emailList.remove(emailToDelete)) {
            System.out.println("Email address deleted successfully.");
        } else {
            System.out.println("Email address not found.");
        }
    }
}
