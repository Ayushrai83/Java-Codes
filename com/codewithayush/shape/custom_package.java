package com.codewithayush.shape;

class shape{
    int length,breadth,radius;

    shape(int length,int breadth, int radius){
        this.length=length;
        this.breadth=breadth;
        this.radius=radius;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
class rectangle extends shape{

    rectangle(int length, int breadth) {
        super(length, breadth,1);
    }
    public int area(){
        return this.length * this.breadth;
    }
}
class square extends shape{

    square(int length) {
        super(length, 1,1);
    }
    public int area(){
        return this.length * this.length;
    }
}
class circle extends shape{

    circle(int radius) {
        super(1,1,radius);
    }
    public double area(){
        return Math.PI * this.radius * this.radius;
    }
}
class cylinder extends shape{

    cylinder(int length ,int radius) {
        super(length,1,radius);
    }
    public double area(){
        return (2*Math.PI*this.radius*this.length) + (2*Math.PI*this.radius*this.radius);
    }
}
public class custom_package {
    public static void main(String[] args) {
        cylinder c1 = new cylinder(2,3);
        System.out.println(c1.area());
    }
}
