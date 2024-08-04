import java.util.Scanner;
public class arrayquestions {
    public static void main(String[] args) {
        //Q1 To add numbers using array
//        float [] marks = {45.5f,32.4f,53.6f,32.4f,23.4f};
//        float sum = 0 ;
//        for (float element : marks){
//            sum+=element;
//        }
//        System.out.printf("Sum is : %.2f",sum);

         //Q2 To check whether the element is present in array
//        float [] marks = {45.5f,32.4f,53.6f,32.4f,23.4f};
//        System.out.println("Enter the element you want to search in array :");
//        Scanner sc = new Scanner(System.in);
//        float num ;
//        num = sc.nextFloat();
//        boolean isInArray = false;
//        for (float element : marks){
//            if (num==element){
//                isInArray=true;
//                break;
//            }
//        }
//        if (isInArray){
//            System.out.println("The value is present in array");
//        }else {
//            System.out.println("The value is not present in array");
//        }

        //Q3 To find avg using array
//        float [] marks = {45.5f,32.4f,53.6f,32.4f,23.4f};
//        float sum = 0 ;
//        for (float element : marks){
//            sum+=element;
//        }
//        System.out.printf("Average is : %.2f",sum/ marks.length);

        //Q4 To add two matrix
//        int [][] a = {{ 1 , 2 , 3 },
//                      { 4, 5 , 6 }};
//        int [][] b = {{ 2 , 4 , 6 },
//                      { 4, 5 , 6 }};
//        int [][] result = {{ 0 , 0 , 0 },
//                           { 0, 0 , 0 }};
//        for (int i=0 ; i< a.length ; i++){
//            for (int j=0 ; j<a[i].length ; j++){
//                result[i][j] = a[i][j] + b[i][j];
//            }
//        }
//        System.out.println("Addition of matrix gives : ");
//        for (int i=0 ; i< a.length ; i++){
//            for (int j=0 ; j<a[i].length ; j++){
//                System.out.print(result[i][j]+" ");
//            }
//            System.out.println(" ");
//        }


        //Q5 To reverse a string
//        int [] a = {1,2,3,4,5,6,7};
//        int l = a.length;
//        int temp;
//        int n = Math.floorDiv(a.length,2);
//        for (int i=0 ; i<n ; i++){
//            temp = a[i];
//            a[i] = a[l-i-1];
//            a[l-i-1]=temp;
//        }
//        for (int element : a){
//            System.out.print(element + " ");
//        }


        //Q6 To find maximum value in an array
//        int [] a = {1,2,3,4,5,6,7,45,323,52};
//        int max = 0;
//        for (int element : a){
//            if (element>max){
//               max= element;
//            }
//        }
//        System.out.println("The maximum value in an array is : "+max);

        //Q7 Write a Java program to find the Minimum element in a Java array.
//        int [] num1 = {1,2,34,343,6,4,76,3,48,65,43,4,98,87,3,};
//        int min=Integer.MAX_VALUE;
//        for (int i:num1){
//            if (min>i){
//                min=i;
//            }
//        }
//        System.out.println("The Minimum Element inside the array is: "+min);

        //Q8 Find whether the array is sorted or not
        int [] num = {1,2,34,343,6,4,76,3,48,65,43,4,98,87,3};
        boolean isSorted = true ;
        for (int i=0 ; i<num.length-1 ; i++){
            if (num[i] > num[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The array is  sorted");
        }else {
            System.out.println("The array is not sorted");
        }
    }
}
