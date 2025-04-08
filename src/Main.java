import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Human obj1 = new Human(new Aadhaar(1234, new Date(), "vikram reddy")), obj2 = new Human(new Aadhaar(1235, new Date(), "akash"));

        System.out.println(obj1.toString() + obj2.toString());
    }
}