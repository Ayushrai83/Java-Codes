
class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is : "+id);
        System.out.println("You are working under "+name);
    }
    public void getSalary(){
        System.out.println("Salary of "+name+" : "+salary);;
    }
}
public class custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        //Instantiating a new employee object
        Employee ayush = new Employee();
        Employee savita = new Employee();

        //Setting attributes
        ayush.id = 143;
        ayush.name = "Ayush";
        ayush.salary = 1200000;
        savita.id = 180;
        savita.name = "Savita";
        savita.salary = 1100000;

        //Printing the attributes
        System.out.println(ayush.id);
        System.out.println(ayush.name);
        System.out.println(savita.id);
        System.out.println(savita.name);

        //Calling methods which are inside a class
        ayush.printDetails();
        savita.printDetails();
        ayush.getSalary();
        savita.getSalary();
    }
}
