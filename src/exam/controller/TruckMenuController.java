package exam.controller;

import exam.service.ITruckService;
import exam.service.impl.TruckService;

import java.io.IOException;
import java.util.Scanner;

public class TruckMenuController {
    public static void menuTruck() throws IOException {
        Scanner scanner = new Scanner(System.in);
        ITruckService iTruckService = new TruckService();

        do {
            System.out.println("Đăng ký phương tiện xe tải\n" +
                    "1. Đăng ký phương tiện\n" +
                    "2. Xem danh sách đăng ký phương tiện\n" +
                    "3. Huỷ đăng ký phương tiện\n" +
                    "4. Thoát");

            int choose = 0;

            try {
                System.out.println("Mời bạn nhập vào lựa chọn:");
                choose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                e.getStackTrace();
            }

            switch (choose){
                case 1:
                    iTruckService.add();
                    break;
                case 2:
                    iTruckService.display();
                    break;
                case 3:
                    iTruckService.remove();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lựa chọn của bạn không đúng mời nhậph la9j");
            }
        }while (true);
    }
}
