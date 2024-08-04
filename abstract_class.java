abstract class Parent2{
    public Parent2(){
        System.out.println("I am a constructor of base 2");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}
abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}
public class abstract_class {
    public static void main(String[]args){
        Child2 c = new Child2();
        // You can't make an object of abstract class
    }
}
