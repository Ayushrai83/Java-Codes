abstract class pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends pen{
    @Override
    void write() {
        System.out.println("Writing....");
    }

    @Override
    void refill() {
        System.out.println("Refilling....");
    }
    void changeNip(){
        System.out.println("Changing the nip....");
    }
}
class monkey{
    void jump(){
        System.out.println("Jumping....");
    }
    void bite(){
        System.out.println("Bitting....");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class human extends monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello Sir !");
    }

    @Override
    public void eat() {
        System.out.println("Eating....");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping....");
    }
}
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartPhone extends Telephone{
    @Override
    void ring() {
        System.out.println("Ringing...");
    }

    @Override
    void lift() {
        System.out.println("picking up the call ");
    }

    @Override
    void disconnect() {
        System.out.println("Disconnecting the call...");
    }
    void openGps(){
        System.out.println("Opening the MAPS..");
    }
}
interface TvRemote{
    void remote();

}
interface SmartTvRemote extends TvRemote{
    void smartRemote();

}
class TV implements TvRemote {
    public void remote() {
        System.out.println(" Remote...");
    }
}
public class practice_set_60 {
    public static void main(String[] args) {
        //Q1 and Q2
        FountainPen pen = new FountainPen();
        pen.changeNip();
        //Q3
        human ayush = new human();
        ayush.sleep();
        //Q5
        monkey m1 = new human();
        m1.bite();
        m1.jump();
//        m1.speak() --> cannot use speak method because the reference is monkey which dosent have speak methods
        BasicAnimal Savita = new human();
//        Savita.speak();
        Savita.eat();
        Savita.sleep();
    }
}
