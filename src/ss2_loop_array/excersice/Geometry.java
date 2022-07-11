package ss2_loop_array.excersice;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu: ");
            System.out.println("1- Print the rectangle");
            System.out.println("2- Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3- Print isosceles triangle");
            System.out.println("4- Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(" Print the rectangle. ");
                    System.out.println("Input the length of rectangle: ");
                    int length = scanner.nextInt();
                    System.out.print("Input the width of rectangle: ");
                    int width = scanner.nextInt();

                    for (int i = 0; i < length; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle. ");
                    System.out.println("Input the height of triangle: ");
                    int height = scanner.nextInt();
                    System.out.println("Bottom-left conner. ");

                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("\nBottom-right conner. ");

                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height; j++) {
                            if (j <= height - i) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("\nTop-right conner");

                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height; j++) {
                            if(j < i){
                                System.out.print(" ");
                            }else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("\nTop-left conner");

                    for (int i = 0; i < height; i++){
                        for (int j = 0; j < height - i; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("\nPrint isosceles triangle");
                    System.out.print("Input height: ");
                    int high = scanner.nextInt();
                    for (int i = 0; i < high; i++) {
                        for (int j = 0; j < high + i; j++) {
                            if (j < high - i - 1) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }
        }
        while (choice != 4);
    }
}
