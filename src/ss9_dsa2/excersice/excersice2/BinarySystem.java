package ss9_dsa2.excersice.excersice2;

import java.util.Scanner;
import java.util.Stack;

public class BinarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number you want to convert:  ");
        Stack<Integer> stack = new Stack<>();
        int number = scanner.nextInt();


        while (number > 0) {
            stack.push(number % 2);
            number /= 2;
        }

        System.out.println("Number after convert is  ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

}
