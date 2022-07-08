package Ss2_loop_array.excersice;

import java.util.Arrays;
import java.util.Scanner;

public class MinNumberInArray {
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

        int min = array[0];

        for (int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("The min number in array is: " + min);
    }
}
