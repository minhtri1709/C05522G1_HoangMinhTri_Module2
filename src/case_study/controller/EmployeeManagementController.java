package case_study.controller;

import java.util.Scanner;

public class EmployeeManagementController {
    private Scanner scanner = new Scanner(System.in);

    public void menuEmployee() {
        do {
            System.out.println("1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Exit");

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
        }
        while (true);
    }
}
