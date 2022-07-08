package ss5_stactic_access.practice;

public class Student {
    private int roolno;
    private String name;
    private static String college = "BBDIT";

    public Student(int r, String n) {
        roolno = r;
        name = n;
    }

    protected static void change() {
        college = "CodeGym";
    }

    void display() {
        System.out.println(roolno + " " + name + " " + college);
    }

}
