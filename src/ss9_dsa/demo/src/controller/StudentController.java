package ss9_dsa.demo.src.controller;

import ss9_dsa.demo.src.service.IStudentService;
import ss9_dsa.demo.src.service.impl.StudentService;

import java.io.IOException;
import java.util.Scanner;

public class StudentController {
    private Scanner scanner = new Scanner(System.in);
    private IStudentService iStudentService = (IStudentService) new StudentService();

    public void menuStudent() throws IOException {
        do {
            System.out.println("1. Thêm mới học sinh \n" +
                    "2. Xóa học sinh \n" +
                    "3. Xem danh sách học sinh \n" +
                    "4. Tìm học sinh\n" +
                    "5. Sắp xếp theo tên học sinh\n" +
                    "6. Quay về menu chính.");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.removeStudent();
                    break;
                case 3:
                    iStudentService.displayAllStudent();
                    break;
                case 4:
                    iStudentService.searchStudent();
                    break;
                case 5:
                    iStudentService.sortByName();
                    break;
                case 6:
                    return;
            }
        } while (true);
    }
}
