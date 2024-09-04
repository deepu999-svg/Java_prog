package deepuu;
import java.util.Scanner;
public class LibraryRentalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        String bookType = "";
        System.out.println("Select the type of book you want to rent:");
        System.out.println("1. Fiction");
        System.out.println("2. Non-Fiction");
        System.out.println("3. Magazine");
        System.out.print("Enter your choice (1-3): ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                bookType = "Fiction"; 
                break;
            case 2:
                bookType = "Non-Fiction";
                break;
            case 3:
                bookType = "Magazine";
                break;
            default:
                System.out.println("Invalid choice. Please select a valid book type.");
        }
        int days = 0;
        System.out.print("Enter the number of days you want to rent the book: ");
        days =Integer.parseInt(scanner.nextLine());
        if (days > 0) {
        } 
        else {
            System.out.println("Invalid number of days. Please enter a positive number.");
        }
        double rate = 0.0;
        switch (bookType) {
            case "Fiction":
                rate = 1.50;
                break;
            case "Non-Fiction":
                rate = 2.00;
                break;
            case "Magazine":
                rate = 1.00;
                break;
        }
        double totalCost =rate * days;
        System.out.println("\n--- Rental Receipt ---\nName: " + name+"\nBook Type: " + bookType+"\nNumber of Days: " + days+"\nTotal Cost:  ₹" + totalCost);
        scanner.close();
    }  
}
