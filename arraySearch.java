/*Write a Java program to count the number of occurrences of the number 1 in a 2D array.
 Use nested loops to traverse through the elements of the array and increment a counter 
 whenever the element is equal to 1. Print the final count of 1s found in the array.*/

public class arraySearch {
    public static void main(String[] args) {
        int count = 0;
        int anArray[][] = {
            {1,0,1},
            {1,0,1},
            {1,0,1},

        };
        for(int i = 0; i < anArray.length; i++){
            for(int j = 0; j < anArray[i].length; j++){
                if(anArray[i][j] == 1){
                    count++;
                }
            }
        }
        System.out.println("The number of 1s in the array is: " + count);
    }
}
