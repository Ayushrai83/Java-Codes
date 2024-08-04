class phone{
    public void on(){
        System.out.println("Turning on phone on....");
    }
    public void time(){
        System.out.println("Showing time....");
    }
}
class Smartphone extends phone{
    public void on(){
        System.out.println("Turning on smart phone ....");
    }
    public void music(){
        System.out.println("Playing music....");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
//        phone obj = new phone();
//        Smartphone smobj = new Smartphone();
//        obj.on();
        phone obj = new Smartphone();
        obj.time();
        obj.on();
//        obj.music(); not allowed
    }
}
