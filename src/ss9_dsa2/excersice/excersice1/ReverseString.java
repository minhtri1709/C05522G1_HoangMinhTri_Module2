package ss9_dsa2.excersice.excersice1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;


public class ReverseString {

    public ReverseString() {

        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        System.out.print("Input word you want to reverse:  ");
        String string = scanner.nextLine();

        String[] strings = string.split(" ");
        System.out.println(Arrays.toString(strings));

        for (String temp : strings){
           stack.push(temp);
        }

        string = "";
        while (!stack.isEmpty()){
            string += stack.pop();
        }

        System.out.println("String afer reverse " + string);

    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString);

    }
}
