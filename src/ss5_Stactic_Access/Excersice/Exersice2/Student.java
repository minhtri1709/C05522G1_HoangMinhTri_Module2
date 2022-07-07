package ss5_Stactic_Access.Excersice.Exersice2;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public Student(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void display(){
        System.out.printf("Information of studen is:\n Name:" + "%s\n" + "Class: " + "%s", name, classes );
    }
}
