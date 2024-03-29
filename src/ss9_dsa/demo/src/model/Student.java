package ss9_dsa.demo.src.model;

public class Student extends Person {
    private int point;
    private String nameSchool;

    @Override
    public String toString() {
        return "Student{" +
                "point=" + point +
                ", nameSchool='" + nameSchool + '\'' +
                "} " + super.toString();
    }



    public Student() {
    }

    public Student(int id, String name, String dateOfBirth, int point, String nameSchool) {
        super(id, name, dateOfBirth);
        this.point = point;
        this.nameSchool = nameSchool;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s\n", this.getId(), this.getName(), this.getDateOfBirth(), this.getPoint(), this.getNameSchool());
    }
}
