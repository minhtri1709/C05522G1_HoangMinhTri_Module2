package ss9_dsa.excersice.service.impl;

import ss9_dsa.excersice.model.Student;
import ss9_dsa.excersice.service.IPeople;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IPeople {
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công! ");

    }

    @Override
    public void remove() {
        System.out.println("Mời bạn nhập ID cần xoá:  ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isExit = false;
        for (Student student : studentList) {
            if (student.getId() == idRemove) {
                System.out.println("Bạn có chắc muốn xoá hay không:  \n" +
                        "1. Có\n" +
                        "2. Không");
                int choose = Integer.parseInt(scanner.nextLine());
                if (choose == 1) {
                    studentList.remove(student);
                    System.out.println("Xoá thành công!  ");
                }
                isExit = true;
                break;
            }
        }
        if(!isExit){
            System.out.println("Không tìm thấy!  ");
        }
    }

    @Override
    public void displayList() {
        for(Student student : studentList){
            System.out.println(student);
        }

    }

    public static Student infoStudent(){
        System.out.print("Nhập id:  ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên:  ");
        String name = scanner.nextLine();
        System.out.print("Nhập giới tính:  ");
        String sex = scanner.nextLine();
        System.out.print("Nhập ngày tháng năm sinh:  ");
        String dayOfBirth = scanner.nextLine();
        System.out.print("Nhập điểm:  ");
        double point = Double.parseDouble(scanner.nextLine());
        Student student = new Student(id, name, sex, dayOfBirth, point);
        return student;
    }
}
