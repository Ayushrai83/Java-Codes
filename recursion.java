import java.util.Scanner;
public class recursion {
    static int fact(int n){
        if (n<=1)
            return 1;
        else
            return n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n =  sc.nextInt();
        int c = fact(n);
        System.out.println("The factorial of the "+ n + " is " + c);
    }
}
