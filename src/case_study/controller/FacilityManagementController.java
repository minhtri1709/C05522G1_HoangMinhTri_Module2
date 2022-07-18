package case_study.controller;

import java.util.Scanner;

public class FacilityManagementController {
    private static Scanner scanner = new Scanner(System.in);

    public void menuFacility(){

        do{
            System.out.println("1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Return main menu");

            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose){
                case 1:{

                }
                case 2:{

                }
                case 3:{

                }
                case 4:{
                    return;
                }
            }

        }while(true);
    }
}
