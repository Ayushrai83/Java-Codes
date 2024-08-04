public class variable_arguments {
    static int sum(int ...arr){
        // Available as int [] arr;
        int result = 0;
        for (int a:arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Tutorial for java variable arguments");
        System.out.println("Sum of nothing :"+sum());
        System.out.println("Sum of 4,5 is :"+sum(4,5));
        System.out.println("Sum of 2,4,5 is :"+sum(2,4,5));
        System.out.println("Sum of 2,3,4,5 is : "+sum(2,3,4,5));
    }
}
