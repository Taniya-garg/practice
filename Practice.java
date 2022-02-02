import java.util.Scanner;

public class Practice {
    public static void main(String args[]) {
        int a=3,b=4;
        float f=52.3f;
        String name="Taniya", girl="garg";
        System.out.println("a= " +a);
        System.out.println("name= " +name);
        System.out.println("f= " +f);
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(--a);
        System.out.println(a--);
        b/=2;
        b%=2;
        System.out.println(b);
        Scanner scan=new Scanner(System.in);
        int age=scan.nextInt();
        System.out.println(a*age);       
        System.out.println(a+ " from " +b);
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.contains("ni"));
        System.out.println("charat " +name.charAt(2));
        System.out.println(a+ "\t" +b);
        System.out.println(name.endsWith("ya"));
        System.out.println(name.indexOf("ya"));
        System.out.println(name.codePointAt(5));
        System.out.println(name.compareTo("garg"));
        System.out.println(name.replace("garg", "taniya"));
        System.out.println(Math.abs(-23));
        System.out.println(Math.min(a, b));
        System.out.println(Math.max(a, b));
        System.out.println(Math.sqrt(a));



    }
    
}
