package ss6_inheritance.excersice.excersice1.model;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){

    }

    public Cylinder(double radius, String color, double height){
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getArea() * getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + getHeight() +
                ", volume=" + getVolume()+
                "sub class of " +super.toString()+
                '}';
    }
}
