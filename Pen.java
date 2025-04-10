class OOPS{
    String color;
    String type;
    public void write(){
        System.out.println("Write");
    }
}
public class Pen {
    public static void main(String[] args) {
        OOPS pen1 = new OOPS();
        pen1.color = "Blue";
        pen1.type = "Gel";
        pen1.write();
        System.out.println("Color: " + pen1.color);
    }
}
