package ss12_algorithm_sorting.excersice.insertion_sort.model;

import ss12_algorithm_sorting.excersice.insertion_sort.controller.InsertionSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size =scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " value: ");

        for (int i = 0; i < list.length; i++){
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list is : " + Arrays.toString(list));

        InsertionSort.insertionSort(list);
    }
}
