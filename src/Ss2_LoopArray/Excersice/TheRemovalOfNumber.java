package Ss2_LoopArray.Excersice;

import java.util.Arrays;
import java.util.Scanner;

public class TheRemovalOfNumber {
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

        System.out.print("Enter the number you want to delete: ");
        int number = scanner.nextInt();
        boolean IsExit = false;

        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                IsExit = true;
                for (int j = i; j < array.length - 1; j++) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                array[array.length -1] = 0;
            }
        }
        if(IsExit){
            System.out.println("Array after delete number is: ");
            System.out.println(Arrays.toString(array));
        }else {
            System.out.println("Number is not at array. ");
        }
    }
}
