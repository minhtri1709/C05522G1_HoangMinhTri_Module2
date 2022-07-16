package ss9_dsa.homework.service.impl;

import ss9_dsa.homework.model.Truck;
import ss9_dsa.homework.service.IVehicleService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckService implements IVehicleService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Truck> truckList = new ArrayList<Truck>();

    @Override
    public void add() {
        Truck truck = infoTruck();
        truckList.add(truck);
        System.out.println("Thêm mới thành công");

    }

    @Override
    public void displayList() {
        for (Truck truck : truckList) {
            System.out.println(truck);
        }
    }

    @Override
    public void remove() {
        System.out.println("Mời bạn cần nhập biển số xe cần xoá:  ");
        String vehicleNumberRemoval = scanner.nextLine();
        boolean isExit = false;

        for (Truck truck : truckList) {
            if (vehicleNumberRemoval.equals(truck.getVehicleNumber())) {
                System.out.println("Bạn có chắc muốn xoá hay không:   \n" +
                        "1. Có\n" +
                        "2. Không");
                int choose = Integer.parseInt(scanner.nextLine());

                if (choose == 1) {
                    truckList.remove(truck);
                    System.out.println("Đã xoá thành công!  ");
                }

                isExit = true;
                break;
            }
        }

    }

    @Override
    public void searchVehicleNumber() {
        System.out.println("Mời bạn nhập số xe cần tìm:  ");
        String vehicleNumberDisplay = scanner.nextLine();
        boolean isExit = false;

        for (Truck truck : truckList) {
            if (vehicleNumberDisplay.equals(truck.getVehicleNumber())) {
                System.out.println(truck);
                isExit = true;
                return;
            }

        }
        if (isExit = false) {
            System.out.println("Không tìm thấy");
        }
    }


    public static Truck infoTruck() {
        System.out.println("Nhập vào hãng sản xuất:  ");
        String manufacturerName = scanner.nextLine();
        System.out.println("Nhập vào năm sản xuất:  ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào chủ sở hữu:  ");
        String nameOfOwner = scanner.nextLine();
        System.out.println("Nhập vào số tấn:  ");
        int tonnage = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số xe:  ");
        String vehicleNumber = scanner.nextLine();
        Truck truck = new Truck(vehicleNumber, manufacturerName, yearOfManufacture, nameOfOwner, tonnage);
        return truck;
    }
}
