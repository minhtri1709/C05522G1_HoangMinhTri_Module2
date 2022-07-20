package ss12_algorithm_sorting.pratice;

import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int[] list = new int[Integer.parseInt(scanner.nextLine())];
        System.out.println("Enter " + list.length + " value:");

        for (int i = 0; i < list.length; i++){
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list is: ");
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        sortByBubble(list);
    }


    public static void sortByBubble(int[] list) {
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    System.out.println("Swap " + list[j] + " with " + list[j + 1]);
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;

                    needNextPass = true;
                }
            }
            if (!needNextPass) {
                System.out.println("Array maybe sorted and next pass not needed.");
                break;
            }
            System.out.println("List afer the " + i + " sort");
            for (int k = 0; k < list.length; k++) {
                System.out.println(list[k] + "\t");
            }
        }

    }
}
