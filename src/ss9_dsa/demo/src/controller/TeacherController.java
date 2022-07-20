package ss9_dsa.demo.src.controller;

import ss9_dsa.demo.src.service.ITeacherService;
import ss9_dsa.demo.src.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private Scanner scanner = new Scanner(System.in);
    private ITeacherService iTeacherService = (ITeacherService) new TeacherService();

    public void menuTeacher(){
        do{
            System.out.println("1. Thêm mới giảng viên \n" +
                    "2. Xoá giảng viên\n" +
                    "3. Xem danh sách giảng viên\n" +
                    "4. Tìm giảng viên\n" +
                    "5. Sắp xếp giảng viên theo tên\n" +
                    "6. Quay về menu chính" );
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    iTeacherService.add();
                    break;
                case 2:
                    iTeacherService.remove();
                    break;
                case 3:
                    iTeacherService.display();
                    break;
                case 4:
                    iTeacherService.search();
                    break;
                case 5:
                    iTeacherService.sortByName();
                case 6:
                    return;
            }
        }while (true);
    }
}
