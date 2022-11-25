package case_study.service.impl;

import case_study.exception.DuplicateIDException;
import case_study.model.person.Customer;
import case_study.service.ICustomerService;
import case_study.utils.ReadWriteCustomerFile;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH_CUSTOMER = "case_study/data/CustomerFileData.csv";


    @Override
    public void add() {
        List<Customer> customerList = ReadWriteCustomerFile.readCustomerFile(PATH_CUSTOMER);
        Customer customer = infoCustomer();
        customerList.add(customer);
        ReadWriteCustomerFile.writeCustomerFile(PATH_CUSTOMER, customerList);
        System.out.println("The addition is complete");
    }

    private Customer infoCustomer() {

        String customerCode;

        while (true) {
            try {
                System.out.println("Input code customer: ");
                customerCode = scanner.nextLine();
                for (Customer customer : customerList) {
                    if (customerCode.equals(customer.getCustomerCode())) {
                        throw new DuplicateIDException("Duplicate code of customer!!");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input again!!! ");
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Input the name of customer: ");
        String name = scanner.nextLine();


        String kindOfCustomer = getTypeOfCustomer();

        System.out.println("Input the address of customer: ");
        String address = scanner.nextLine();

        System.out.println("Input the date of birth of your customer: ");
        String dayOfBirth = scanner.nextLine();

        System.out.println("Input the ID of your customer: ");
        String id = scanner.nextLine();

        System.out.println("Input the phone number of your customer: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Input the email of your customer:  ");
        String email = scanner.nextLine();


        String sex = getGender();

        Customer customer = new Customer(name, dayOfBirth, id, phoneNumber, email, sex, customerCode, kindOfCustomer, address);
        return customer;
    }


    @Override
    public void display() {
        List<Customer> customerList = ReadWriteCustomerFile.readCustomerFile(PATH_CUSTOMER);
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
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


    private static String getTypeOfCustomer() {
        do {
            try {
                System.out.println("Select your type: \n" +
                        "1. Member\n" +
                        "2. Silver\n" +
                        "3. Gold\n" +
                        "4. Platinum\n");

                int choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        return "Member";
                    case 2:
                        return "Silver";
                    case 3:
                        return "Gold";
                    case 4:
                        return "Platinum";
                    default:
                        throw new Exception("Please input again!!!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }


    public void edit() {
        System.out.println("Input your code of your customer you want to edit:  ");
        String code = scanner.nextLine();
        List<Customer> customerList = ReadWriteCustomerFile.readCustomerFile(PATH_CUSTOMER);

        for (Customer customer : customerList) {
            if (code.equals(customer.getCustomerCode())) {
                System.out.println("Are you sure to edit this customer?\n" +
                        "1. Yes\n" +
                        "2. No");
                int choose = Integer.parseInt(scanner.nextLine());
                if (choose == 1) {
                    do {
                        System.out.println("Input your option want to change\n" +
                                "1. Name's customer\n" +
                                "2. Day of Birth\n" +
                                "3. Phone Number of customer\n" +
                                "4. Email of customer\n" +
                                "5. Gender of customer\n" +
                                "6. ID's customer\n" +
                                "7. Kind of customer\n" +
                                "8. Address of customer\n" +
                                "9. Back to menu.");

                        int option = Integer.parseInt(scanner.nextLine());
                        switch (option) {
                            case 1: {
                                System.out.println("Input new name: ");
                                String newName = scanner.nextLine();
                                customer.setName(newName);
                                ReadWriteCustomerFile.writeCustomerFile(PATH_CUSTOMER, customerList);
                                break;
                            }
                            case 2: {
                                System.out.println("Input new day of birth: ");
                                String newDay = scanner.nextLine();
                                customer.setDayOfBirth(newDay);
                                ReadWriteCustomerFile.writeCustomerFile(PATH_CUSTOMER, customerList);
                                break;
                            }
                            case 3: {
                                System.out.println("Input new phone number: ");
                                String newNumber = scanner.nextLine();
                                customer.setPhoneNumber(newNumber);
                                ReadWriteCustomerFile.writeCustomerFile(PATH_CUSTOMER, customerList);
                                break;
                            }
                            case 4: {
                                System.out.println("Input email of employee");
                                String email = scanner.nextLine();
                                customer.setEmail(email);
                                ReadWriteCustomerFile.writeCustomerFile(PATH_CUSTOMER, customerList);
                                break;
                            }
                            case 5: {
                                System.out.println("Input gender of employee again: ");
                                String gender = scanner.nextLine();
                                customer.setSex(gender);
                                ReadWriteCustomerFile.writeCustomerFile(PATH_CUSTOMER, customerList);
                                break;
                            }
                            case 6: {
                                System.out.println("Input ID of employee again");
                                String id = scanner.nextLine();
                                customer.setId(id);
                                ReadWriteCustomerFile.writeCustomerFile(PATH_CUSTOMER, customerList);
                                break;
                            }
                            case 7: {
                                System.out.println("Input kind of employee");
                                String kindOfLevel = scanner.nextLine();
                                customer.setKindOfCustomer(kindOfLevel);
                                ReadWriteCustomerFile.writeCustomerFile(PATH_CUSTOMER, customerList);
                                break;
                            }
                            case 8: {
                                System.out.println("Input address of customer");
                                String address = scanner.nextLine();
                                customer.setAddress(address);
                                ReadWriteCustomerFile.writeCustomerFile(PATH_CUSTOMER, customerList);
                                break;
                            }
                            case 9: {
                                return;

                            }
                        }

                    } while (true);
                }
            }
        }
    }
}
