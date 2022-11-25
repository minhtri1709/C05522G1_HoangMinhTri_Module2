package exam.utils;

import java.util.Scanner;

public class Regex {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static boolean isLeapYear(int year) {
        boolean isDivisible4 = year % 4 == 0;
        boolean isDivisible100 = year % 100 == 0;
        boolean isDivisible400 = year % 400 == 0;

        return (isDivisible4 && !isDivisible100) || isDivisible400;
    }

    public static String getDateFormat() {
        String dateOfBirth;
        while (true) {
            try {
                dateOfBirth = SCANNER.nextLine();
                if (!dateOfBirth.matches("(0[1-9]|[12]\\d|3[0-1])/(0[1-9]|1[0-2])/(19|20)\\d{2}")) {
                    throw new DateInvalidException("Vui lòng nhập đúng định dạng dd/mm/yyyy!");
                }

                String[] str = dateOfBirth.split("/");
                if (str[1].equals("04") || str[1].equals("06") || str[1].equals("09") || str[1].equals("11")) {
                    if (Integer.parseInt(str[0]) > 30) {
                        throw new DateInvalidException("Vui lòng nhập đúng số ngày trong tháng (tháng này có tối đa 30 ngày)!");
                    }
                } else if (str[1].equals("02")) {
                    if (isLeapYear(Integer.parseInt(str[2]))) {
                        if (Integer.parseInt(str[0]) > 29) {
                            throw new DateInvalidException("Vui lòng nhập đúng số ngày trong tháng (tháng 2 có tối đa 29 ngày vì là năm nhuận)!");
                        }
                    } else {
                        if (Integer.parseInt(str[0]) > 28) {
                            throw new DateInvalidException("Vui lòng nhập đúng số ngày trong tháng (tháng 2 có tối đa 28 ngày)!");
                        }
                    }
                }

                return dateOfBirth;

            } catch (DateInvalidException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String getUpperCaseName() {
        String str;
        while (true) {
            try {
                str = SCANNER.nextLine();
                if (!str.matches("^[A-Z][a-z]+( [A-Z][a-z]+)+$")) {
                    throw new TextInvalidException("Phải viết hoa những chữ cái đầu, vui lòng nhập lại!");
                }

                break;
            } catch (TextInvalidException e) {
                System.out.println(e.getMessage());
            }
        }

        return str;
    }



}
