package exam.controller;

import java.io.IOException;
import java.util.Scanner;

public class VehicleController {
    public static void menuController() throws IOException {
        Scanner scanner = new Scanner(System.in);
        CarMenuController carMenuController = new CarMenuController();
        TruckMenuController truckMenuController = new TruckMenuController();

        do {
            System.out.println("Ứng dụng quản lí phương tiện: \n" +
                    "1. Quản lí xe tải\n" +
                    "2. Quản lí oto\n" +
                    "3. Thoát chương trình");
            int choose = 0;

            try {
                System.out.println("Mời bạn nhập vào lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                e.getStackTrace();
            }
            switch (choose){
                case 1:
                    truckMenuController.menuTruck();
                    break;
                case 2:
                    carMenuController.menuCar();
                    break;
                case 3:
                    System.exit(-1);
                default:
                    System.out.println("Lựa chọn của bạn không có");
            }
        }while (true);
    }
}
