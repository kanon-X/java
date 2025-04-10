class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("Write");
    }
    public void printColor(){
        System.out.println(this.color);
    }

}
public class Paper{
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";
        pen1.write();
        pen1.printColor();
    }
    
}
