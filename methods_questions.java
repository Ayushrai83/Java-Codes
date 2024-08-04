import java.util.Scanner;
public class methods_questions {
//    Problem 1
    static void multiplication(int n){
        for (int i=1; i<=10 ; i++){
            System.out.printf("%d x %d = %d \n",n,i,n*i);
        }
    }
//    Problem 2
    static void pattern1(int n){
        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<i+1 ;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
//    Problem 3
    static int sumRec(int n){
        if (n==1){
            return 1;
        }else {
            return n + sumRec(n-1);
        }
    }
//    Problem 4
    static void pattern2(int n){
        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<n-i ;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
//    Problem 5
    static int fib(int n){
        if(n==1){
            return 0;
        } else if (n==2) {
            return 1;
        }else {
            return fib(n-1) + fib(n-2);
        }
    }
//    Problem 6
    static int average(float ...args){
        float sum = 0;
        float average = 0;
        for (int i = 0; i < args.length; i++) {
            sum+=args[i];
        }
        System.out.println(sum);
        return (int) (average = sum/args.length);
    }
//    Problem 8
    static void pattern1_rec(int n){
        if (n>0){
            pattern1_rec(n-1);
            for (int i=0 ; i<n ;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int a = sc.nextInt();
//        problem 1
//        multiplication(a);

//        Problem 2
//        pattern1(a);

//        Problem 3
//        int c = sumRec(a);
//        System.out.println(c);

//        Problem 4
//        pattern2(a);

//        Problem 5
//        int result = fib(a);
//        System.out.println("The fibonacci series is : "+result);

//        Problem 6
//        System.out.println("Average is "+ average(34,45,65,76,87,44));

//        Problem 8
        pattern1_rec(a);
    }
}
