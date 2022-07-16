package ss9_dsa.homework.controller;

import ss9_dsa.homework.service.IVehicleService;
import ss9_dsa.homework.service.impl.CarService;
import ss9_dsa.homework.service.impl.MotobikeService;

import java.util.Scanner;

public class MotobikeController {
    private IVehicleService iVehicleService = (IVehicleService) new MotobikeService() ;
    private Scanner scanner =  new Scanner(System.in);
    public void optionMotobike(){
        do{
            System.out.println("Chọn chức năng: \n" +
                    "1. Thêm mới phương tiện.\n" +
                    "2. Hiển thị phương tiện\n" +
                    "3. Xoá phương tiện.\n" +
                    "4. Thoát");

            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose){
                case 1:
                    iVehicleService.add();
                    break;
                case 2:
                    iVehicleService.displayList();
                    break;
                case 3:
                    iVehicleService.remove();
                    break;
                case 4:
                    return;
            }
        }
        while (true);

    }
}
