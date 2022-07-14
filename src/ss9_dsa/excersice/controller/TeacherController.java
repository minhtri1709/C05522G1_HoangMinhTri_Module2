package ss9_dsa.excersice.controller;

import ss9_dsa.excersice.service.IPeople;
import ss9_dsa.excersice.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController  {
    private Scanner scanner =new Scanner(System.in);
    private IPeople iTeacherService = (IPeople) new TeacherService();

    public void optionTeacher(){
        do{
            System.out.println("1. Thêm mới giáo viên\n" +
                    "2. Xoá giáo viên\n" +
                    "3. Xem danh sách giáo viên\n" +
                    "4. Quay về danh sách chính.");

            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose){
                case 1:
                    iTeacherService.add();
                    break;
                case 2:
                    iTeacherService.remove();
                    break;
                case 3:
                    iTeacherService.displayList();
                    break;
                case 4:
                    return;
            }

        }
        while (true);
    }
}
