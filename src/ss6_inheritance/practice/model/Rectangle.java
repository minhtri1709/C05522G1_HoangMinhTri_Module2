package ss6_inheritance.practice.model;

public class Rectangle {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle(){

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height){
        this.width=width;
        this.height=height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return (height + width) * 2;
    }

    public double getPerimeter(){
        return height * width;
    }

    public String toString(){
        return String.format("A Rectangle with width=%d and length=&d, which is a subclass of " + super.toString());
    }
}
