package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    public  static void displayMainMenu(){
         Scanner scanner = new Scanner(System.in);

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
                 case 1:
             }

         }
         while (true);

    }


}
