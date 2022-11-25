package case_study.utils;

import case_study.model.person.Customer;
import case_study.model.person.Employee;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ReadWriteCustomerFile {
    public static List<Customer> readCustomerFile(String path) {
        List<Customer> customerList = new LinkedList<>();

        List<String> stringList = ReadWriteFIleUtils.readFile(path);
        String[] info;

        for (String line : stringList) {
            info = line.split(",");
            customerList.add(new Customer(info[0], info[1], info[2], info[3], info[4], info[5], info[6], info[7], info[8]));
        }

        return customerList;
    }

    public static void writeCustomerFile(String path, List<Customer> customerList) {
        StringBuilder data = new StringBuilder();
        for (Customer customer : customerList) {
            data.append(customer.getInfo()).append("\n");
        }
        try {
            ReadWriteFIleUtils.writeFile(path, data.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

