package ss4_oop.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();

        System.out.println("Enter the height: ");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width , height);

        System.out.print("Your rectangle \n" + rectangle.display());
        System.out.print("Perimeter of the Rectangle is: " + rectangle.getPerimeter());
        System.out.print("Area of the Rectangle is: " + rectangle.getArea());
    }
}
