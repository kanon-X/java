class student{
    String name;
    int age;
    //constructor
    public student(String n,int a){
        name =n;
        age =a;
    }
    void showdetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class Constructor {
    public static void main(String[] args) {
        student s1 = new student("kanon", 20);
        s1.showdetails();
    }
}
