package ss9_dsa2.excersice.excersice1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        ReverseStack integerReverseStack = new ReverseStack();
        System.out.println(integerReverseStack);


    }


    public    ReverseStack() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the length of the array: ");
        int length = Integer.parseInt(scanner.nextLine());
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.printf("Input the %d in array\n", i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Array is: " + Arrays.toString(array));
        Stack<Integer> stack = new Stack<>();

        for (int temp : array) {
            stack.push(temp);
        }

        System.out.println("Stack after push elements from array:  " + stack);

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println(Arrays.toString(array));
    }

}
