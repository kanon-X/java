
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Enter a divisor to divide 400:");
            int divisor = s.nextInt(); // Can throw InputMismatchException

            int[] anArray = new int[9];

            int result = 400 / divisor; // Can throw ArithmeticException

            // Let's simulate a potential ArrayIndexOutOfBoundsException
            anArray[8] = result; // Valid index is 0 to 8

            System.out.println("Value is: " + anArray[8]);

        } catch (ArithmeticException e) {
            System.out.println(" Error: Can't divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println(" Error: Array index is out of bounds.");
            e.getMessage();
        } catch (InputMismatchException e) {
            System.out.println(" Error: Invalid input. Please enter an integer.");
        } catch (Exception e) {
            System.out.println(" An unexpected error occurred: " + e.getMessage());
        } finally {
            s.close(); // Always good practice to close resources
            System.out.println("Program finished.");
        }
    }
}
    

