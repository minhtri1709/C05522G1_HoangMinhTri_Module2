package ss9_dsa.excersice.model;

public class Student extends Person{
    private double point;

    public Student() {
    }

    public Student(int id, String name, String sex, String dayOfBirth, double point) {
        super(id, name, sex, dayOfBirth);
        this.point = point;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "point=" + point +
                "} " + super.toString();

    }
}
