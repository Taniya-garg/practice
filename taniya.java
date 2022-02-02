
import java.util.*;

class taniya {
    public static void main(String args[]) {
         try (Scanner sc = new Scanner(System.in)) {
            double x;
            double y;
            System.out.print("x=");
            x = sc.nextDouble();
            System.out.print("y=");
            y = sc.nextDouble();
            
            if (x == y) {
                System.out.println("x is equal to y");

            } else if (x > y) {
                System.out.println("x is greater than y");
            } else {
                System.out.println("y is greater than x");
            }
        }
    }
}
