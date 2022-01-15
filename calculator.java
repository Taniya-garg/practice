import java.util.*;

public class calculator {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in); {
            // System.out.println("a= ");
            // int a = sc.nextInt();
            //  System.out.println("a= ");
            // int b = sc.nextInt();
            // int op = sc.nextInt();
            // switch (op){
            //     case '+' : System.out.println("sum"  +a+b);
            //     break;
            // }
            // int n = sc.nextInt();
            // for (int i = 1; i%2==0; i++)
            // System.out.println(n);
            for(int i=1; i<=4; i++)
            {
                for (int j = 1; j<=5; j++)
                {
                    System.out.print("* ");
                }
                System.out.println("");
            }
            int n = 4;
            for (int i=0; i<=n; i++){
                for (int j=1; j<=n-i ; j++){
                    System.out.print(n);
                }
                System.out.println();
            }
        }
    }
    
}
