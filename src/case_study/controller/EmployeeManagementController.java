package case_study.controller;

import case_study.service.IEmployeeService;
import case_study.service.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeManagementController {
    private Scanner scanner = new Scanner(System.in);
    private IEmployeeService iEmployeeService = new EmployeeService();


    public void menuEmployee() {
        while (true) {
            System.out.println("1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Exit");

            int choose;
            while (true) {
                try {
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Do not input words");
                }
            }

            switch (choose) {

                case 1: {
                    iEmployeeService.display();
                    break;
                }
                case 2: {
                    iEmployeeService.add();
                    break;
                }
                case 3: {
                    iEmployeeService.edit();
                    break;
                }
                case 4: {
                    return;
                }
            }
        }

    }
}
