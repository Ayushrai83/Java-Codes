import java.util.Scanner;
public class methods {
    static int sum(int a, int b){
      int sum = a + b;
      return sum;
    };
    int multiply(int a, int b){
      int mult = a*b;
      return mult;
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = sc.nextInt();
        System.out.println("Enter a number : ");
        int b = sc.nextInt();
        int c = sum(a,b);
        System.out.println("Sum of the two numbers is :"+c);

        // The method formed without between static by making objects
        methods obj = new methods();
        System.out.println("Enter a number to product :");
        int d = sc.nextInt();
        System.out.println("Enter a number to product :");
        int e = sc.nextInt();
        int f = obj.multiply(d,e);
        System.out.println("Product of the two number is :"+f);
    }
}
