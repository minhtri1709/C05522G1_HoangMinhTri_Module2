package ss9_dsa.excersice.controller;

import ss9_dsa.excersice.service.IPeople;
import ss9_dsa.excersice.service.impl.StudentService;

import java.util.Scanner;

public class StudenController {
    private Scanner scanner = new Scanner(System.in);
    private IPeople iStudentService = (IPeople) new StudentService();

    public void optionStudent() {
        do {
            System.out.println("1. Thêm mới học sinh\n" +
                    "2.Xoá học sinh\n" +
                    "3.Xem danh sách học sinh\n" +
                    "4. Quay về danh sách chính.");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose){
                case 1:
                    iStudentService.add();
                    break;
                case 2:
                    iStudentService.remove();
                    break;
                case 3:
                    iStudentService.displayList();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
