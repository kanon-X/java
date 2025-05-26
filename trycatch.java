public class trycatch {
    public static void main(String[] args) {
        try{
            int [] numbers = {1, 2, 3, 4, 5};
            System.out.println(numbers[7]);
        }
        catch(Exception e){
            System.out.println("something went wrong");
        }
    }
}
