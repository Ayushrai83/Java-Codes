class Circle{
    public int radius;
    Circle(){
        System.out.println("I am non param constructor of circle");
    }

    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius=r;
    }

    public double area(){
        return (float) (Math.PI*this.radius*this.radius);
    }
}
class Cyclinder extends Circle{
    public int height;
    Cyclinder(int r , int h){
        super(r);
        System.out.println("I am cyclinder parameterized constructor");
        this.height=h;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
    public double area(){return 2*Math.PI*radius*height; }
}
public class practice_inheritance {
    public static void main(String[] args) {
//        Circle obj = new Circle(12);
        Cyclinder obj = new Cyclinder(12,4);
    }
}