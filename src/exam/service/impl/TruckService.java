package exam.service.impl;

import exam.model.License;
import exam.service.ITruckService;
import exam.utils.ReadWriteLicense;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static jdk.nashorn.internal.runtime.Debug.id;

public class TruckService implements ITruckService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PATH_LICENSE = "exam/data/gdkpt.csv";

    private License infoLicense() {
        System.out.println("Mời bạn nhập vào số đăng ký: ");
        int dateBegin = Integer.parseInt(SCANNER.nextLine());

        System.out.println("Mời bạn nhập vào tên chủ phương tiện: ");
        String nameOfOwner = SCANNER.nextLine();

        System.out.println("Mời bạn nhập vào ngày đăng ký: ");
        String dayBegin = SCANNER.nextLine();

        System.out.println("Mời bạn nhập vào mã phương tiện: ");
        String codeOfCar = SCANNER.nextLine();

        License license = new License(dateBegin, nameOfOwner, dayBegin, codeOfCar);
        return license;
    }

    @Override
    public void add() throws IOException {
        List<License> licenseList = ReadWriteLicense.readLicense(PATH_LICENSE);
        License license = infoLicense();
        licenseList.add(license);
        ReadWriteLicense.writeLicense(PATH_LICENSE, licenseList);
        System.out.println("Đã đăng ký thành công");
    }

    @Override
    public void remove() {
        System.out.println("Mời bạn nhập vào số đăng ký cần xoá: ");
        int code = Integer.parseInt(SCANNER.nextLine());
        List<License> licenseList = ReadWriteLicense.readLicense(PATH_LICENSE);
        boolean isExist = false;

        for (int i = 0; i < licenseList.size() ; i++) {

            if (code == licenseList.get(i).getId()) {
                System.out.println("Bạn có chắc muốn huỷ đăng ký phương tiện này:  \n" +
                        "1. Có\n" +
                        "2. Không");
                int choose = Integer.parseInt(SCANNER.nextLine());
                if (choose == 1) {
                    licenseList.remove(i);
                    System.out.println("Đã huỷ thành công!");
                }
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Số đăng ký không tồn tại.");
        }
        ReadWriteLicense.writeLicense(PATH_LICENSE, licenseList);
    }

    @Override
    public void display() {
        List<License> licenseList = ReadWriteLicense.readLicense(PATH_LICENSE);
        for (License license : licenseList) {
            System.out.println(license);
        }
    }


}
