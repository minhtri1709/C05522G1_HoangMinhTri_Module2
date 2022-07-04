package Ss2_LoopArray.Excersice;

import java.util.Arrays;
import java.util.Scanner;

public class TheAddtionNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the length of the array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter number a[%d]", i);
            array[i] = scanner.nextInt();
        }
        System.out.println("The array is: ");
        System.out.println(Arrays.toString(array));
        int[] newArray = new int[length + 1];

        System.out.print("Input number you want to add in array: ");
        int number = scanner.nextInt();
        System.out.print("Input the index of that number: ");
        int index = scanner.nextInt();
        if (index < -1 || index > array.length) {
            System.out.print("The index is not match with array. ");
        }
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = number;

        for (int j = index + 1; j < newArray.length; j++) {
            newArray[j] = array[j - 1];
        }

        array = newArray;
        System.out.println("The array after change is: ");
        System.out.println(Arrays.toString(array));

    }
}
