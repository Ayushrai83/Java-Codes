import org.w3c.dom.css.Rect;

class Cylinder{
    private int radius;
    private int height;
    public Cylinder(int radius,int height){
        this.radius=radius;
        this.height=height;
    }


    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getRadius() {
        return radius;
    }
    public double surfaceArea(){
        return 2 * Math.PI * radius* radius + 2 * Math.PI * radius * height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}
class Rectangle{
    private int length;
    private int breadth;
    public int getLength() {
        return length;
    }
    public int getBreadth() {
        return breadth;
    }
    public Rectangle(){
        this.length=4;
        this.breadth=5;
    }
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
}
public class access_modifier_practseset {
    public static void main(String[] args) {
        //Problem 1
//        Cylinder mycylinder = new Cylinder();
//        mycylinder.setRadius(3);
//        mycylinder.setHeight(10);
//        System.out.println(mycylinder.getRadius());
//        System.out.println(mycylinder.getHeight());
//
//        //Problem 2
//        System.out.println(mycylinder.surfaceArea());
//        System.out.println(mycylinder.volume());
//
//        //Problem 3
//        Cylinder newCyclinder = new Cylinder(12,9);
//        System.out.println(mycylinder.surfaceArea());
//        System.out.println(mycylinder.volume());
//
//        //Problem 4
//        Rectangle r = new Rectangle(12,8);
//        System.out.println(r.getLength());
//        System.out.println(r.getBreadth());
//


    }
}
