package ss13_exception_debug.practice;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public int[] createRandom() {
    Random random = new Random();
    int[] arr = new int[100];
    System.out.println("Danh sách phần tử của mảng:  ");
    for (int i = 0; i < 100; i++) {
        arr[i] = random.nextInt(100);
        System.out.print(arr[i] + " ");
    }
    return arr;
}
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scanner.nextInt();

        try {
            System.out.println("Giá tri của phần tử có chỉ số " + x + " là " + arr[x]);

        }catch (NumberFormatException e){
            System.err.println("Chỉ số vượt quá giới hạn của mảng.");

        }
    }


}
