
class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

}

class CellPhone{
    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrat(){
        System.out.println("Vibrating....");
    }
    public void callFriend(){
        System.out.println("Calling my friend");
    }
}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running away from the enemy");
    }
    public void firing(){
        System.out.println("Firing on the enemy");
    }
}
public class oop_problems {
    public static void main(String[] args) {
        System.out.println("Classes practise set");
//        Problem 1
        Employee1 ayush = new Employee1();
        ayush.setName("Ayush");
        System.out.println(ayush.getName());
        ayush.salary=1200000;
        System.out.println(ayush.getSalary());

//        Problem 2
        CellPhone samsung = new CellPhone();
        samsung.ring();
        samsung.vibrat();
        samsung.callFriend();

//        Problem 3
        Square sq = new Square();
        sq.side = 4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

//        Problem 4
        tommy tom = new tommy();
        tom.firing();
        tom.hit();
        tom.run();
    }
}
