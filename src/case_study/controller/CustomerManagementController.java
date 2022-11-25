package case_study.controller;

import case_study.service.ICustomerService;
import case_study.service.impl.CustomerService;

import java.util.Scanner;

public class CustomerManagementController {
    private Scanner scanner =new Scanner(System.in);
    private ICustomerService iCustomerService =  new CustomerService();

    public void menuCustomer(){
        do {
            System.out.println("1. Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
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

            switch (choose){
                case 1:{
                    iCustomerService.display();
                    break;
                }
                case 2:{
                    iCustomerService.add();
                    break;
                }
                case 3:{
                    iCustomerService.edit();
                    break;
                }
                case 4:{
                    return;
                }

            }
        }while (true);
    }
}
