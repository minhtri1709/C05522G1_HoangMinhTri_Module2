package case_study.service.impl;

import case_study.exception.DuplicateIDException;
import case_study.model.person.Employee;
import case_study.service.IEmployeeService;
import case_study.utils.ReadWriteEmployeeFile;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static final String PATH = "case_study/data/EmployeeFileData.csv";
    private static List<Employee> employeeList = ReadWriteEmployeeFile.readEmployeeFile(PATH);
    private static Scanner scanner = new Scanner(System.in);


    @Override
    public void add() {
        List<Employee> employeeList = ReadWriteEmployeeFile.readEmployeeFile(PATH);
        Employee employee = infoEmployee();
        employeeList.add(employee);
        ReadWriteEmployeeFile.writeEmployeeFile(PATH, employeeList);
        System.out.println("The addition is complete");

    }

    public static Employee infoEmployee() {

        String employeeCode;

        while (true) {
            try {
                System.out.println("Input code employee: ");
                employeeCode = scanner.nextLine();
                for (Employee employee : employeeList) {
                    if (employeeCode.equals(employee.getEmployeeCode())) {
                        throw new DuplicateIDException("Duplicate code of employee!!");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input again!!! ");
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Input the name of employee: ");
        String name = scanner.nextLine();

        String level = getLevel();

        System.out.println("Input the position of your employee:");
        String position = scanner.nextLine();

        System.out.println("Input the salary of your employee:");
        String salary = scanner.nextLine();

        System.out.println("Input the date of birth of your employee: ");
        String dayOfBirth = scanner.nextLine();

        System.out.println("Input the ID of your employee: ");
        String id = scanner.nextLine();

        System.out.println("Input the phone number of your employee: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Input the email of your employee:  ");
        String email = scanner.nextLine();


        String sex = getGender();

        Employee employee = new Employee(employeeCode, name, dayOfBirth, id, phoneNumber, email, sex, level,
                position, salary);
        return employee;
    }


    @Override
    public void display() {
        employeeList = ReadWriteEmployeeFile.readEmployeeFile(PATH);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    private static String getLevel() {
        do {
            try {
                System.out.println("Select your level: \n" +
                        "1. Intermediate\n" +
                        "2. University\n" +
                        "3. College\n" +
                        "4. After university\n");

                int choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        return "Intermediate";
                    case 2:
                        return "University";
                    case 3:
                        return "College";
                    case 4:
                        return "After university";
                    default:
                        throw new Exception("Please input again!!!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    private static String getGender() {
        do {
            try {
                System.out.println("Input your sex: \n" +
                        "1. MALE\n" +
                        "2. FEAMLE\n");

                int choose = scanner.nextInt();
                if (choose == 1) {
                    return "MALE";
                }
                return "FEMALE";
            } catch (Exception e) {
                System.out.println("Please input again!!!");
            }
        } while (true);
    }

    public void edit() {

        System.out.println("Input your code of your employee you want to edit:  ");
        String code = scanner.nextLine();
        List<Employee> employeeList = ReadWriteEmployeeFile.readEmployeeFile(PATH);
        boolean isExist = false;

        for (Employee employee : employeeList) {
            if (code.equals(employee.getEmployeeCode())) {
                isExist = true;
                try {
                    while (true) {
                        System.out.println("Input your option want to change\n" +
                                "1. Name's Employee\n" +
                                "2. Day of Birth\n" +
                                "3. Phone Number of employee\n" +
                                "4. Email of employee\n" +
                                "5. Gender of employee\n" +
                                "6. ID's employee\n" +
                                "7. Level of employee\n" +
                                "8. Position of employee\n" +
                                "9. Salary of employee\n" +
                                "10. Back to menu.");

                        int option = Integer.parseInt(scanner.nextLine());
                        switch (option) {
                            case 1: {
                                System.out.println("Input new name: ");
                                String newName = scanner.nextLine();
                                employee.setName(newName);
                                ReadWriteEmployeeFile.writeEmployeeFile(PATH, employeeList);
                                break;
                            }
                            case 2: {
                                System.out.println("Input new day of birth: ");
                                String newDay = scanner.nextLine();
                                employee.setDayOfBirth(newDay);
                                ReadWriteEmployeeFile.writeEmployeeFile(PATH, employeeList);
                                break;
                            }
                            case 3: {
                                System.out.println("Input new phone number: ");
                                String newNumber = scanner.nextLine();
                                employee.setPhoneNumber(newNumber);
                                ReadWriteEmployeeFile.writeEmployeeFile(PATH, employeeList);
                                break;
                            }
                            case 4: {
                                System.out.println("Input email of employee");
                                String email = scanner.nextLine();
                                employee.setEmail(email);
                                ReadWriteEmployeeFile.writeEmployeeFile(PATH, employeeList);
                                break;
                            }
                            case 5: {
                                System.out.println("Input gender of employee again: ");
                                String gender = scanner.nextLine();
                                employee.setSex(gender);
                                ReadWriteEmployeeFile.writeEmployeeFile(PATH, employeeList);
                                break;
                            }
                            case 6: {
                                System.out.println("Input ID of employee again");
                                String id = scanner.nextLine();
                                employee.setId(id);
                                ReadWriteEmployeeFile.writeEmployeeFile(PATH, employeeList);
                                break;
                            }
                            case 7: {
                                System.out.println("Input level of employee");
                                String level = scanner.nextLine();
                                employee.setLevel(level);
                                ReadWriteEmployeeFile.writeEmployeeFile(PATH, employeeList);
                                break;
                            }
                            case 8: {
                                System.out.println("Input position of employee");
                                String position = scanner.nextLine();
                                employee.setPosition(position);
                                ReadWriteEmployeeFile.writeEmployeeFile(PATH, employeeList);
                                break;
                            }
                            case 9: {
                                System.out.println("Input salary of employee");
                                String salary = scanner.nextLine();
                                employee.setSalary(salary);
                                ReadWriteEmployeeFile.writeEmployeeFile(PATH, employeeList);
                                break;
                            }
                            case 10: {
                                return;
                            }
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please input by number!");
                }
            }
        }
        if (!isExist) {
            System.out.println("The id did not found in file!!!");
        }
        ReadWriteEmployeeFile.writeEmployeeFile(PATH, employeeList);
    }
}
