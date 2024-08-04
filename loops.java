import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        //Practice problem 1
//        int n=4;
//        for (int i=n ; i>0 ; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
        //Practice 2
//        int sum = 0 ;
//        int n ;
//        System.out.println("Enter the value of n:");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        for (int i=0 ; i<n ; i++){
//            sum = sum + (2*i);
//        }
//        System.out.print("Sum of even numbers :");
//        System.out.println(sum);
        //Practice 3
//        int n;
//        System.out.println("Enter the number for the table :");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        for (int i=0 ; i<=10 ; i++){
//            System.out.printf("%d * %d = %d\n",n,i,n*i);
//        }
        //Practice4
//        int n;
//        System.out.println("Enter the number for the table :");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        for (int i=10 ; i>0 ; i--){
//            System.out.printf("%d * %d = %d\n",n,i,n*i);
//        }
        //Practice6
//        System.out.println("Enter the value of n :");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int i=1;
//        int factorial = 1;
//        while (i<=n){
//            factorial *= i;
//            i++;
//        }
//        System.out.print("Factorial = ");
//        System.out.println(factorial);
        //Practice 9
        int n , sum=0;
        System.out.println("Enter the number for the table :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i=0 ; i<=10 ; i++){
            sum += n*i;
        }
        System.out.println(sum);
    }
}
