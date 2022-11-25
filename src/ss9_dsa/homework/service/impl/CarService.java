package ss9_dsa.homework.service.impl;

import ss9_dsa.homework.model.Car;
import ss9_dsa.homework.service.IVehicleService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class
CarService implements IVehicleService {
    private static List<Car> carList = new ArrayList<Car>();
    private static Scanner scanner = new Scanner(System.in);


    @Override
    public void add() {
        Car carClass = infoCar();
        carList.add(carClass);
        System.out.println("Thêm mới thành công");


    }

    @Override
    public void displayList() {
        for (Car car : carList) {
            System.out.println(car);
        }

    }

    @Override
    public void remove() {
        System.out.println("Mời bạn cần nhập biển số xe cần xoá:  ");
        String vehicleNumberRemoval = scanner.nextLine();
        boolean isExit = false;

        for (Car car : carList) {
            if (vehicleNumberRemoval.equals(car.getVehicleNumber())) {
                System.out.println("Bạn có chắc muốn xoá hay không:   \n" +
                        "1. Có\n" +
                        "2. Không");
                int choose = Integer.parseInt(scanner.nextLine());

                if (choose == 1) {
                    carList.remove(car);
                    System.out.println("Đã xoá thành công!  ");
                }

                isExit = true;
                break;
            }

        }

        if (!isExit) {
            System.out.println("Không tìm thấy!   ");
        }

    }

    @Override
    public void searchVehicleNumber() {
        System.out.println("Mời bạn nhập số xe cần tìm:  ");
        String vehicleNumberDisplay = scanner.nextLine();
        boolean isExit = false;

        for (Car car : carList) {
            if (vehicleNumberDisplay.equals(car.getVehicleNumber())) {
                System.out.println(car);
                isExit = true;
                return;
            }

        }
        if (isExit = false) {
            System.out.println("Không tìm thấy");
        }

    }

    public static Car infoCar() {
        System.out.println("Nhập vào hãng sản xuất:  ");
        String manufacturerName = scanner.nextLine();
        System.out.println("Nhập vào năm sản xuất:  ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào chủ sở hữu:  ");
        String nameOfOwner = scanner.nextLine();
        System.out.println("Nhập vào kiểu xe:  ");
        String kindOfCar = scanner.nextLine();
        System.out.println("Nhập vào số chỗ ngồi:  ");
        int seat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào biển số xe:  ");
        String vehicleNumber = scanner.nextLine();
        Car carClass = new Car(vehicleNumber, manufacturerName, yearOfManufacture, nameOfOwner, seat, kindOfCar);
        return carClass;

    }
}
