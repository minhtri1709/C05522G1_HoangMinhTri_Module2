package ss12_algorithm_sorting.excersice.insertion_sort.controller;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            boolean isFlag = false;
           int key = arr[i];
           int j;
           for (j = i - 1; j >=0 && arr[j] > key;j--){
               System.out.println("Put the value " + arr[j +1] + " and put the value "+ arr[j] + " to the value " + arr[j + 1]);
               arr[j+1] = arr[j];
               isFlag = true;
           }
           arr[j + 1] = key;
           if(isFlag){
               System.out.println("Put " + key + " in the old position " + "we have" + Arrays.toString(arr));
           }
        }
    }
}
