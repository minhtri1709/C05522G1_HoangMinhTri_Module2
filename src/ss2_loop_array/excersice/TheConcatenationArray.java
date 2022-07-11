package ss2_loop_array.excersice;

import java.util.Arrays;
import java.util.Scanner;

public class TheConcatenationArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input length of first array: ");
        int firstLength = scanner.nextInt();
        int[] arrayFirst = new int[firstLength];
        for (int i = 0; i < arrayFirst.length; i++) {
            System.out.printf("Enter number a[%d]", i);
            arrayFirst[i] = scanner.nextInt();
        }
        System.out.println("The first array is: ");
        System.out.println(Arrays.toString(arrayFirst));

        System.out.println("Input length of second array: ");
        int secondLength = scanner.nextInt();
        int[] arraySecond = new int[secondLength];
        for (int i = 0; i < arraySecond.length; i++) {
            System.out.printf("Enter number a[%d]", i);
            arraySecond[i] = scanner.nextInt();
        }
        System.out.println("The second array is: ");
        System.out.println(Arrays.toString(arraySecond));

        int[] arrayThird = new int[firstLength + secondLength];
        for (int i = 0; i < arrayFirst.length; i++){
            arrayThird[i] = arrayFirst[i];
        }
        for (int j = 0; j < arraySecond.length; j++){
            arrayThird[arrayFirst.length + j] = arraySecond[j];
        }
        System.out.println(Arrays.toString(arrayThird));
    }
}
