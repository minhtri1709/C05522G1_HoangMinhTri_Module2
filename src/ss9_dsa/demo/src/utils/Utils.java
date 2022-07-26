package ss9_dsa.demo.src.utils;

import ss9_dsa.demo.src.exception.DateFormatException;

import java.util.Scanner;

public class Utils {public static String getName() {
    Scanner scanner =new Scanner(System.in);

    System.out.print("Nhập name: ");
    String name = scanner.nextLine();
    String[] arr = name.toLowerCase().trim().split("");
    StringBuilder str = new StringBuilder().append(arr[0].toUpperCase());
    for (int i = 1; i < arr.length; i++) {
        if (!arr[i].equals(" ")) {
            if (arr[i-1].equals(" ")) {
                str.append(arr[i].toUpperCase());
            } else {
                str.append(arr[i]);
            }
        } else if (!arr[i+1].equals(" ")) {
            str.append(arr[i]);
        }
    }
    return str.toString();
}

    private static boolean isLeapYear(int year) {
        boolean isDivisible4 = year % 4 == 0;
        boolean isDivisible100 = year % 100 == 0;
        boolean isDivisible400 = year % 400 == 0;

        return (isDivisible4 && !isDivisible100) || isDivisible400;
    }

    public static String getDateOfBirth() {
        Scanner scanner =new Scanner(System.in);
        String dateOfBirth;
        while (true) {
            try {
                System.out.print("Nhập ngày sinh: ");
                dateOfBirth = scanner.nextLine();
                if (!dateOfBirth.matches("(0[1-9]|[12]\\d|3[0-1])/(0[1-9]||1[0-2])/(19\\d{2}|20(0\\d|1[0-5]))")) {
                    throw new DateFormatException("Vui lòng nhập đúng định dạng dd/mm/yyyy!");
                }

                String[] str = dateOfBirth.split("/");
                if (str[1].equals("04") || str[1].equals("06") || str[1].equals("09") || str[1].equals("11")) {
                    if (Integer.parseInt(str[0]) > 30) {
                        throw new DaysOfMonthException("Vui lòng nhập đúng số ngày trong tháng (tháng này có tối đa 30 ngày)!");
                    }
                } else if (str[1].equals("02")) {
                    if (isLeapYear(Integer.parseInt(str[2]))) {
                        if (Integer.parseInt(str[0]) > 29) {
                            throw new DaysOfMonthException("Vui lòng nhập đúng số ngày trong tháng (tháng 2 có tối đa 29 ngày vì là năm nhuận)!");
                        }
                    } else {
                        if (Integer.parseInt(str[0]) > 28) {
                            throw new DaysOfMonthException("Vui lòng nhập đúng số ngày trong tháng (tháng 2 có tối đa 28 ngày)!");
                        }
                    }
                }

                return dateOfBirth;
            } catch (DateFormatException | DaysOfMonthException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
