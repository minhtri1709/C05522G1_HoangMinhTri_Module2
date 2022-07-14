package ss9_dsa.excersice.controller;

import java.util.Scanner;

public class OptionController {
    public static void optionController() {
        StudenController studenController = new StudenController();
        Scanner scanner = new Scanner(System.in);
        TeacherController teacherController = new TeacherController();

        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN \n" +
                    "Chọn chức năng theo số \n" +
                    "1. Quản lý sinh viên \n" +
                    "2. Quản lý giảng viên \n" +
                    "3. Thoát chương trình \n");

            System.out.println("Mời bạn nhập vào lựa chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:{
                    studenController.optionStudent();
                    break;
                }
                case 2:
                    teacherController.optionTeacher();

                case 3: {
                    System.exit(1);
                }
            }
        }while (true) ;
    }
}
