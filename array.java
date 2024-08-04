public class array {
    public static void main(String[] args) {
        /*Classroom of 500 student  - You have to store marks of these 500 students
        You have 2 options :
        1. create 500 variable
        2. create an array
        */
        //Declaration ,memory allocation and initialization together
        int [] student = {98,45,34,23,23,2,1};
        System.out.println(student[4]);

        int [] marks = new int [5] ;
        marks[0] = 100;
        marks[1] = 98;
        marks[2] = 93;
        marks[3] = 95;
        marks[4] = 97;
        System.out.println(marks[3]);

    }
}
