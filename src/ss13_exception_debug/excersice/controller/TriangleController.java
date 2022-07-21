package ss13_exception_debug.excersice.controller;

import ss13_exception_debug.excersice.exception.IllegalTriangleException;
import ss13_exception_debug.excersice.model.Triangle;

import java.util.Scanner;

public class TriangleController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstSide;
        int secondSide;
        int thirdSide;

        while (true) {
            try {
                System.out.println("Nhập vào độ dài cạnh đầu tiên: ");
                firstSide = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập vào độ dài cạnh thứ hai: ");
                secondSide = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập vào độ dài cạnh thứ ba: ");
                thirdSide = Integer.parseInt(scanner.nextLine());
                Triangle triangle = new Triangle(firstSide, secondSide, thirdSide);
                System.out.println(triangle);
                break;
            } catch (NumberFormatException  e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập số!!!");

            }catch (IllegalTriangleException e){
                System.out.println(e.getMessage());
            }
        }
    }

}
