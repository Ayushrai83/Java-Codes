import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("The calculator for cbse :");
        System.out.println("Enter maths marks :");
        int sub1 = sc.nextInt();
        System.out.println("Enter eng marks :");
        int sub2 = sc.nextInt();
        System.out.println("Enter chemistry marks :");
        int sub3 = sc.nextInt();
        System.out.println("Enter physics marks :");
        int sub4 = sc.nextInt();
        System.out.println("Enter cs marks :");
        int sub5 = sc.nextInt();

        int sum = sub1+sub2+sub3+sub4+sub5;
        float div = sum/500f;
        float per = div*100;

        System.out.println("The total percentage of cbse is:");
        System.out.println(per+"%");
    }
}
