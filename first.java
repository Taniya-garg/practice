import java.util.*;

class first {

    String color; // instance variable
    int age;

    void intObj(String c, int a) // create method with two parameters
    {
        color = c; //local variable
        age = a;
    }

    void display() {
        System.out.println(color + " " + age);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        // create object name taniya & new is a keyword and first () is a constructor
        first taniya = new first();
        taniya.eat(); // call eat method
        taniya.color = "black";
        taniya.age = 10;
        System.out.println(taniya.color + " " + taniya.age);
        taniya.intObj("black", 20);
        taniya.display();
        try (Scanner sc = new Scanner(System.in)) {
            // String name= gt.next();
            System.out.print("enter the first no.=");
            int a = sc.nextInt();
            System.out.print("enter the second no.=");
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println("sum of two no. is=" + sum);
            if (a == b) {
                System.out.println("a is equal to b");
            } else if (a > b) {
                System.out.println("a is greater than b");
            } else {
                System.out.println("a is less than b");
            }

        }
    }

    public void eat() {
        System.out.println("I am eating");
    }

}
