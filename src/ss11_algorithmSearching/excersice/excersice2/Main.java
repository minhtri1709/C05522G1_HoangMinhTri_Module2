package ss11_algorithmSearching.excersice.excersice2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài của mảng:  ");
        int lengthArray = Integer.parseInt(scanner.nextLine());
        int[] array = new int[lengthArray];
        for (int i = 0; i < array.length; i++){
            System.out.printf("Nhập vào số %d của mảng: ",i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(array);
        System.out.println("Mảng sau khi sắp xếp là:  " + Arrays.toString(array));

        System.out.print("Nhập vào số cần tìm trong mảng:  ");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.print("Vị trí của số cần tìm trong mảng là:  " + searchBinary(array, number,0, array.length -1));


    }
    public static int searchBinary(int[] array, int number, int left, int right){
        int mid = (left + right) / 2;

        if (left <= right){
            if(number == array[mid]){
                return mid;
            }
            if(number > array[mid]){
             return searchBinary(array,number, mid + 1, right)   ;
            }
            return searchBinary(array, number, left, mid - 1);
        }
        return -1;
    }
}
