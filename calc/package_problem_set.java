package calc;

class Calculator{
    public void calculate (int a , int b ){
        System.out.println("Your result is "+ a+b);
    }
}

class ScCalculator{
    public void calculate (int a , int b ){
        System.out.println("Your result is "+ Math.sin(a+b));
    }
}

class HyCalculator{
    public void calculate (int a , int b ){
        System.out.println("Your result is "+ a+b);
        System.out.println("Your result is "+ Math.sin(a+b));
    }
}
public class package_problem_set {
    public static void main(String[] args) {

    }
}

//import java.util.Scanner;
//
//class input{
//    Scanner sc = new Scanner (System.in);
//    int a = sc.nextInt();
//}
//public class Main {
//    public static void main(String[] args) {
//        input i = new input ();
//        System.out.print("your input number or alphebets is : "+i.a);
//    }
//}
