package ss6_inheritance.practice.model;

public class Circle extends Shape {
private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius * 2 * Math.PI;
    }

    public double getPerimeter(){
        return radius * radius * Math.PI;
    }

    public String toString(){
        return String.format("A Circle with radius=%d, which is a subclass of " + super.toString(), radius);
    }
}
