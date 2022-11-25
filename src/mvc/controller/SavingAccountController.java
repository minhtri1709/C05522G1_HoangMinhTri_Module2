package mvc.controller;

import java.util.Scanner;

public class SavingAccountController {
    public static void displaySavingMenu(){
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("CHỌN CHỨC NĂNG THEO SỐ(ĐỂ TIẾP TỤC):\n" +
                    "1. Thêm mới\n" +
                    "2. Xoá\n" +
                    "3. Xem danh sách các tài khoản ngân hàng\n" +
                    "4. Tìm kiếm\n" +
                    "5. Thoát");

            System.out.println("MỜI BẠN NHẬP VÀO LỰA CHỌN: ");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
            }
        }while (true);
    }
}
