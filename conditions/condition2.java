//program to take input from the user
import java.util.Scanner;

public class condition2 {
    public static void main(String[] args) {
        Scanner sagar = new Scanner(System.in); // Fix Scanner initialization
        
        System.out.print("Enter your age: "); // Prompt user for input
        int age = sagar.nextInt(); // Fix method call
        
        if (age < 18) { // Fix condition if necessary
            System.out.println("Not allowed to the class");
        } else {
            System.out.println("Allowed to the class");
        }
        
        sagar.close(); // Close Scanner to prevent resource leak
    }
}
