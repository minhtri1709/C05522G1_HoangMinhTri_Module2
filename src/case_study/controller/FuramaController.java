package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    public  static void displayMainMenu(){
         Scanner scanner = new Scanner(System.in);
         EmployeeManagementController employeeManagementController = new EmployeeManagementController();
         CustomerManagementController customerManagementController = new CustomerManagementController();
         FacilityManagementController facilityManagementController = new FacilityManagementController();
         PromotionManagementController promotionManagementController = new PromotionManagementController();
         BookingManagermentController bookingManagermentController = new BookingManagermentController();

         do {
             System.out.println("Select function by number, please\n" +
                     "1. Employee Management\n" +
                     "2. Customer Management\n" +
                     "3. Facility Management\n" +
                     "4. Booking Management\n" +
                     "5. Promotion Management\n" +
                     "6. Exit.");

             System.out.println("Please input your choice:  ");
             int choose = Integer.parseInt(scanner.nextLine());

             switch (choose){
                 case 1:{
                     employeeManagementController.menuEmployee();
                 }
                 case 2:{
                     customerManagementController.menuCustomer();
                 }
                 case 3:{
                     facilityManagementController.menuFacility();
                 }
                 case 4:{
                     bookingManagermentController.menuBooking();
                 }
                 case 5:{
                     promotionManagementController.MenuPromotion();
                 }
                 case 6: {
                     System.exit(1);
                 }

             }

         }
         while (true);

    }


}
