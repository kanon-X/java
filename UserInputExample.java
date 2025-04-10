import java.util.Scanner; 
public class UserInputExample {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object

        // Ask for user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Read user input as a string

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  // Read user input as an integer

        // Display the input
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        scanner.close();  // Close the scanner
    }
}


