package exam.controller;

import exam.service.ICarService;
import exam.service.impl.CarService;

import java.io.IOException;
import java.util.Scanner;

public class CarMenuController {
    public static void menuCar() throws IOException {
        Scanner scanner = new Scanner(System.in);
        ICarService iCarService = new CarService();


        do {
            System.out.println("Đăng ký phương tiện oto\n" +
                    "1. Đăng ký phương tiện\n" +
                    "2. Xem danh sách đăng ký phương tiện\n" +
                    "3. Huỷ đăng ký phương tiện\n" +
                    "4. Thoát");
            int choose = 0;

            try {
                System.out.println("Mời bạn nhập vào lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                e.getStackTrace();
            }
            switch (choose){
                case 1:
                    iCarService.add();
                    break;
                case 2:
                    iCarService.display();
                    break;
                case 3:
                    iCarService.remove();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lựa chọn của bạn không có, vui lòng nhập lại");
            }
        }while (true);
    }

}
