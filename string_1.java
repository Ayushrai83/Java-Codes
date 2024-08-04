import java.util.Scanner;
public class string_1 {
    public static void main(String[] args) {
//        String name = new String("This is Ayush");
        String name = "Ayush";
        System.out.print("This is my name :");
        System.out.println(name);

        int a = 8;
        float b = 9.55f;
        System.out.printf("The value of a is %d and value of b is %f",a,b);
        System.out.format("The value of a is %d and value of b is %f\n",a,b);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
//        String st = sc.next();
        String st = sc.nextLine();
        System.out.println(st);

    }
}
