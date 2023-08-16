import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Car a = new Car(1, "BMW E34", "black", 0);
        Car b = new Car(2, "TESLA X", "red", 0);


        System.out.println(a.id);
        System.out.println(b.id);

        System.out.println(a.model);
        System.out.println(b.model);

        System.out.println(a.color);
        System.out.println(b.color);

        //hello();
        //abc();
        //int c = abc();
        //System.out.println(c);

        a.drift();
        b.drift();

        a.getInfo();
        b.getInfo();

        a.go(10);
        a.go(20);
        a.go(30);

        System.out.println(a.currentSpeed);

    }

    public static void hello() {
        System.out.println("Привет");
    }

    public static int abc() {
        System.out.println("Привет");
        return 5;
    }

}