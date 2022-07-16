package ss9_dsa.homework.controller;

import java.util.Scanner;

public class VehicleController {
    public static void menuController() {
        Scanner scanner = new Scanner(System.in);
        CarController carController = new CarController();
        TruckController truckController = new TruckController();
        MotobikeController motobikeController = new MotobikeController();


        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG\n" +
                    "1. Quản lý oto.\n" +
                    "2. Quản lý xe tải.\n" +
                    "3. Quản lý xe máy.\n" +
                    "4. Thoát");

            System.out.println("Mời bạn nhập vào lựa chọn:  ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:{
                    carController.optionCar();
                    break;
                }
                case 2:{
                    truckController.optionTruck();
                    break;
                }
                case 3:{
                    motobikeController.optionMotobike();
                    break;
                }
                case 4:{
                    System.exit(1);
                }

            }
        }
        while (true);
    }
}
