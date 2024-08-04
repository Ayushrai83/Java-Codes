public class foreachloop {
    public static void main(String[] args) {
//        int [] marks = {98,45,65,76,76,87};
//        System.out.println(marks.length);

//        System.out.println(students[4]);
        String [] students = {"Ayush","Savita","Tamana","Aryan","Rohan"};
        System.out.println(students.length);
        //Displaying array using for loop
        System.out.println("Displaying array :");
        for (int i = 0 ; i<students.length ; i++){
            System.out.println(students[i]);
        }
        //Displaying array in reverse order
        System.out.println("Printing array in reverse order :");
        for (int i = students.length-1  ; i >=0; i-- ){
            System.out.println(students[i]);
        }
        //For each loop
        int [] marks = {98,45,65,76,76,87};
        System.out.println("Printing array using for each loop :");
        for (int element : marks){
            System.out.println(element);
        }
    }
}
