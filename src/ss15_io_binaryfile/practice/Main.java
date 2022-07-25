package ss15_io_binaryfile.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Student> studentList){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutput output = new ObjectOutputStream(fileOutputStream);
            output.writeObject(studentList);
            output.close();
            fileOutputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path){
        List<Student>students = new ArrayList<>();
        try{
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            students = (List<Student>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile("ss15_io_binaryfile/practice/student.txt", students);
        List<Student> studentList = readDataFromFile("ss15_io_binaryfile/practice/student.txt");
        for (Student student  : studentList){
            System.out.println(student);
        }
    }
}
