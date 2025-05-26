public class Throw {
    static void checkAge(int age) {
        if(age<18){
            throw new ArithmeticException("You are not old enough to vote");
        } else {
            System.out.println("You are old enough to vote");
        }
    }
    public static void main(String[] args) {
        checkAge(15);
    }
    
}
