package mvc.controller;

import java.util.Scanner;

public class BankAccountController {
    public static void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        PaymentAccountController paymentAccountController = new PaymentAccountController();
        SavingAccountController savingAccountController = new SavingAccountController();



        do {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOẢN NGÂN HÀNG\n" +
                    "1. TÀI KHOẢN TIẾT KIỆM\n" +
                    "2. TÀI KHOẢN THANH TOÁN\n" +
                    "3. THOÁT");

            System.out.println("MỜI BẠN NHẬP LỰA CHỌN: ");
            int choose =Integer.parseInt(scanner.nextLine());

            switch (choose){
                case 1:
                    savingAccountController.displaySavingMenu();
                case 2:
                    paymentAccountController.displayPaymentMenu();
                    break;
                case 3:
                    System.exit(-1);
            }
        }while (true);
    }
}
