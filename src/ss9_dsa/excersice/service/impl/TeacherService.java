package ss9_dsa.excersice.service.impl;

import ss9_dsa.excersice.model.Teacher;
import ss9_dsa.excersice.service.IPeople;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements IPeople {
    private static List<Teacher> teacherList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        Teacher teacher = infoTeacher();
        teacherList.add(teacher);
        System.out.println("Thêm mới giáo viên thành công!  ");
    }

    @Override
    public void remove() {
        System.out.println("Mời bạn nhập số id giáo viên cần xoá:  ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isExit = false;
        for(Teacher teacher : teacherList){
            if(teacher.getId() == idRemove){
                System.out.println("Bạn có chắc muốn xoá hay không?  \n" +
                        "1. Có\n" +
                        "2. Không.");
                int choose = Integer.parseInt(scanner.nextLine());
                if(choose == 1){
                    teacherList.remove(teacher);
                    System.out.println("Xoá thành công! ");
                }
                isExit = true;
                break;
            }
        }
        if(!isExit){
            System.out.println("Không tìm ra ID của giáo viên!  ");
        }

    }

    @Override
    public void displayList() {
        for(Teacher teacher : teacherList){
            System.out.println(teacher);
    }}

    public static Teacher infoTeacher() {
        System.out.println("Nhập vào ID của giáo viên: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tên của giáo viên:  ");
        String name = scanner.nextLine();
        System.out.println("Nhập vào giới tính:  ");
        String sex = scanner.nextLine();
        System.out.println("Nhập vào ngày tháng năm sinh:  ");
        String dayOfBirth = scanner.nextLine();
        System.out.println("Nhập vào bộ môn giảng dạy:  ");
        String specialize = scanner.nextLine();
        Teacher teacher = new Teacher(id, name, sex, dayOfBirth, specialize);
        return teacher;
    }
}
