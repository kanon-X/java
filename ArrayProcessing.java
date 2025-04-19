 import java.util.Scanner;

public class ArrayProcessing {

    // Method to calculate the average
    public double calculateAverage(int[] values, int num) {
        double sum = 0;
        for (int i = 0; i < num; i++) {
            sum += values[i];
        }
        return sum / num;
    }

    // Method to calculate the standard deviation
    public double calculateStandardDeviation(int[] values, int num, double avg) {
        if (num <= 1) {
            return -1000;  // Return -1000 for insufficient data
        }

        double sum = 0;
        for (int i = 0; i < num; i++) {
            sum += Math.pow(values[i] - avg, 2);
        }

        return Math.sqrt(sum / (num - 1));
    }

    // Method to count numbers less than the average
    public int countLessThanAvg(int[] values, int num, double avg) {
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (values[i] < avg) {
                count++;
            }
        }
        return count;
    }

    // Method to check if the array is sorted
    public boolean isArraySorted(int[] values, int num) {
        for (int i = 0; i < num - 1; i++) {
            if (values[i] > values[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Create an instance of ArrayProcessing
            ArrayProcessing arrayProcessing = new ArrayProcessing();

            // Declare the array with a max size of 100
            int[] values = new int[100];

            // Get number of values from the user
            System.out.print("Number of items: ");
            int num = scanner.nextInt();

            // Validate the number of items
            if (num < 1 || num > 100) {
                System.out.println("Error: Number of items must be between 1 and 100.");
                return;  // End the program if the input is invalid
            }

            // Input the array values
            System.out.println("Enter " + num + " items:");
            for (int i = 0; i < num; i++) {
                values[i] = scanner.nextInt();
            }

            // Calculate the average
            double avg = arrayProcessing.calculateAverage(values, num);

            // Calculate the standard deviation
            double stdDev = arrayProcessing.calculateStandardDeviation(values, num, avg);

            // Count numbers less than average
            int lessThanAvg = arrayProcessing.countLessThanAvg(values, num, avg);

            // Check if the array is sorted
            boolean isSorted = arrayProcessing.isArraySorted(values, num);

            // Output the results
            System.out.printf("Average: %.2f\n", avg);
            if (stdDev == -1000) {
                System.out.println("Std Dev: Not enough data to compute standard deviation.");
            } else {
                System.out.printf("Std Dev: %.2f\n", stdDev);
            }
            System.out.println("Items less than average: " + lessThanAvg);

            if (isSorted) {
                System.out.println("Array is sorted.");
            } else {
                System.out.println("Array is not in sorted order.");
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();  // Ensure scanner is closed to free resources
        }
    }
}

