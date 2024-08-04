interface Bicycle{
    int a=45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    int a=45;
    void blowHorn();
    void peeHorn();
}
class AvonBicycle implements Bicycle,HornBicycle{
    public void blowHorn(){
        System.out.println("Pee Pee Poo Poo !");
    }
    int speed =7;
    public void applyBrake(int decrement){
        speed = speed - decrement;
        System.out.println("Applying brake");
    }
    @Override
    public void speedUp(int increment) {
        speed = speed+increment;
        System.out.println("Speeding up");
    }
    void blowHorn2(){
        System.out.println("kabhi khushi kabhi gam pe pe pe pe");
    }
    public void peeHorn(){
        System.out.println("Main hoo na pee poo poo poo");
    }
}
public class interface_intro {
    public static void main(String[] args) {
        AvonBicycle a = new AvonBicycle();
        a.applyBrake(5);
        a.speedUp(5);
        //You can create properties in interfaces and can't change the properties as they are final
//        System.out.println(a.a);

        a.blowHorn2();
        a.peeHorn();
    }
}
