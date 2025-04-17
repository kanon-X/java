/*Write a Java program that:

Takes user input for the number of marks.

Stores the marks in an array.

Finds the total, average, highest, and lowest marks.

Displays the entered marks in proper format. */

import java.util.Scanner;
public class arrayExample {
    public static void main(String[] args) {
        myArray obj = new myArray();
        obj.enterMarks();
        obj.printMarks();
        obj.totalMarks();
        obj.averageMarks();
        obj.findMax();
        obj.findMin();
    }
}

class myArray{
    Scanner sc = new Scanner(System.in);
    int n;
    int[] marks;
    double total = 0;

    //constructor to initialize the array
    public myArray(){
        System.out.println("Enter the number of marks:");
        n = sc.nextInt();
        marks = new int[n];
    }

    public void enterMarks(){
        System.out.println("Enter" + n + "marks:");
        for(int i = 0; i<n; i++){
            marks[i] = sc.nextInt();
        }
    }
    public void printMarks(){
        System.out.println("The entered marks are:");
        for(int i = 0; i<n; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
    public void totalMarks(){
        for(int i = 0; i<n; i++){
            total += marks[i];
        }
        System.out.println("The total marks are: " + total);
    }
    public void averageMarks(){
        double average = total/marks.length;
        System.out.println("The average marks are: " + average);
    }
    public void findMax(){
        int max = marks[0];
        for(int i = 1; i<n; i++){
            if(marks[i] > max){
                max = marks[i];
            }
        }
        System.out.println("The highest marks are: " + max);
    }
    public void findMin(){
        int min = marks[0];
        for(int i = 1; i<n; i++){
            if(marks[i] < min){
                min = marks[i];
            }
        }
        System.out.println("The lowest marks are: " + min);
}

}