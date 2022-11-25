package case_study.utils;

import case_study.model.person.Employee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteEmployeeFile {

    public static List<Employee> readEmployeeFile(String path) {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = ReadWriteFIleUtils.readFile(path);

        String[] info;

        for (String line : stringList) {
            info = line.split(",");
            employeeList.add(new Employee(info[0], info[1], info[2], info[3], info[4], info[5], info[6], info[7], info[8], info[9]));
        }
        return employeeList;
    }

    public static void writeEmployeeFile(String path, List<Employee> employeeList) {
        StringBuilder data = new StringBuilder();
        for (Employee employee : employeeList) {
            data.append(employee.getInfo()).append("\n");
        }
        try {
            ReadWriteFIleUtils.writeFile(path, data.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
