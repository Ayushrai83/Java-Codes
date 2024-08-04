import java.util.Scanner;
public class user_nput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int a = sc.nextInt();
//        System.out.println(sc.hasNextInt());
        System.out.println("Enter number :");
        int b = sc.nextInt();
        int sum = a+b ;
        System.out.println("The sum of these number is :");
        System.out.println(sum);

//        String str = sc.next();
        String str = sc.nextLine();
        System.out.println(str);
    }
}