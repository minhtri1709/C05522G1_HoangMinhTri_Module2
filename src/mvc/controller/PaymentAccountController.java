package mvc.controller;

import mvc.service.IPaymentService;
import mvc.service.impl.PaymentAccountService;

import java.util.Scanner;

public class PaymentAccountController {
    public static void displayPaymentMenu(){
        Scanner scanner = new Scanner(System.in);
        IPaymentService iPaymentService = new PaymentAccountService();

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
                    iPaymentService.add();
                    break;
                case 2:
                    iPaymentService.remove();
                    break;
                case 3:
                    iPaymentService.display();
                    break;
                case 4:
                    iPaymentService.search();
                    break;
                case 5:
                    return;
            }
        }while (true);
    }
}
