package exam.utils;

import case_study.utils.ReadWriteFIleUtils;
import exam.model.Car;
import exam.model.Truck;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ReadWriteTruckFile {
    public static List<Truck> readTruckFile(String path) {
        List<Truck> truckList = new LinkedList<>();

        List<String> stringList = ReadWriteFIleUtils.readFile(path);
        String[] info;

        for (String line : stringList) {
            info = line.split(",");
            truckList.add(new Truck(info[0], info[1], info[2], info[3], Integer.parseInt(info[4]), Integer.parseInt(info[5]), Integer.parseInt(info[6])));
        }

        return truckList;
    }

    public static void writeCustomerFile(String path, List<Car> carList) {
        StringBuilder data = new StringBuilder();
        for (Car car : carList) {
            data.append(car.getInfo()).append("\n");
        }
        try {
            ReadWriteFIleUtils.writeFile(path, data.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
