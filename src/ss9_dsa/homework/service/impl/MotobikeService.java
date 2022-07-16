package ss9_dsa.homework.service.impl;

import ss9_dsa.homework.model.Car;
import ss9_dsa.homework.model.Motobike;
import ss9_dsa.homework.service.IVehicleService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotobikeService implements IVehicleService {
    private static List<Motobike> motobikeList = new ArrayList<Motobike>();
    private static Scanner scanner = new Scanner(System.in);


    @Override
    public void add() {
        Motobike motobike = infoMotobike();
        motobikeList.add(motobike);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void displayList() {
        for (Motobike motobike : motobikeList){
            System.out.println(motobike);
        }
    }

    @Override
    public void remove() {
        System.out.println("Mời bạn cần nhập biển số xe cần xoá:  ");
        String vehicleNumberRemoval = scanner.nextLine();
        boolean isExit = false;

        for (Motobike motobike : motobikeList) {
            if (vehicleNumberRemoval.equals(motobike.getVehicleNumber())) {
                System.out.println("Bạn có chắc muốn xoá hay không:   \n" +
                        "1. Có\n" +
                        "2. Không");
                int choose = Integer.parseInt(scanner.nextLine());

                if (choose == 1) {
                    motobikeList.remove(motobike);
                    System.out.println("Đã xoá thành công!  ");
                }

                isExit = true;
                break;
            }
            if (!isExit) {
                System.out.println("Không tìm thấy!   ");
            }


        }
    }

    @Override
    public void searchVehicleNumber() {
        System.out.println("Mời bạn nhập số xe cần tìm:  ");
        String vehicleNumberDisplay = scanner.nextLine();
        boolean isExit = false;

        for (Motobike motobike : motobikeList) {
            if (vehicleNumberDisplay.equals(motobike.getVehicleNumber())) {
                System.out.println(motobike);
                isExit = true;
                return;
            }

        }
        if (isExit = false) {
            System.out.println("Không tìm thấy");
        }
        }




    public static Motobike infoMotobike(){
        System.out.println("Nhập vào hãng sản xuất:  ");
        String manufacturerName = scanner.nextLine();
        System.out.println("Nhập vào năm sản xuất:  ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào chủ sở hữu:  ");
        String nameOfOwner = scanner.nextLine();
        System.out.println("Nhập vào công suất:  ");
        int wattage = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào biển số xe:  ");
        String vehicleNumber = scanner.nextLine();
        Motobike motobike = new Motobike(vehicleNumber, manufacturerName, yearOfManufacture, nameOfOwner, wattage);
        return motobike;
    }
}

