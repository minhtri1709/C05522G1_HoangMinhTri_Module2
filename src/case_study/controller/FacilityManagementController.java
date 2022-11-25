package case_study.controller;

import case_study.service.IFacilityService;
import case_study.service.impl.FacilityService;

import java.util.Scanner;

public class FacilityManagementController {
    private static Scanner scanner = new Scanner(System.in);
    private static IFacilityService iFacilityService = new FacilityService();

    public void menuFacility() {

        do {
            System.out.println("1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Return main menu");

            int choose;
            while (true) {
                try {
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Do not input words");
                }
            }

            try {
                switch (choose) {
                    case 1: {
                        iFacilityService.display();
                        break;
                    }
                    case 2: {
                        iFacilityService.add();
                        break;
                    }
                    case 3: {
                        iFacilityService.displayMaintenance();
                        break;
                    }
                    case 4: {
                        return;
                    }
                    default: {
                       throw new Exception("Please input again!!!");
                    }
                }


            } catch (Exception e){
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }while (true) ;
    }
}