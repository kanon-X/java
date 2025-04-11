
    import java.util.Scanner;

public class PositiveNumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double number, sum = 0;

        System.out.print("Enter how many numbers you want to input: ");
        n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");

        for (int i = 1; i <= n; i++) {
            System.out.print("Number " + i + ": ");
            number = sc.nextDouble();

            // Only add if the number is positive
            if (number > 0) {
                sum += number;
            } else {
                System.out.println("Negative number skipped.");
            }
        }

        System.out.println("Sum of positive numbers: " + sum);
    }
}


