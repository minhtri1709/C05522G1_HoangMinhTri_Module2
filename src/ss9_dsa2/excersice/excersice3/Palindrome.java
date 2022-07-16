package ss9_dsa2.excersice.excersice3;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        Queue<String> stringQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the string you want ");
        String string = scanner.nextLine();

        String[] stringArr = string.split("");
        System.out.println(Arrays.toString(stringArr));

        for (String str : stringArr) {
            stringStack.push(str.toLowerCase());
            stringQueue.add(str.toLowerCase());
        }

        String str1 = "";
        String str2 = "";

        while (!stringStack.isEmpty() && !stringQueue.isEmpty()) {
            str1 += stringStack.pop();
            str2 += stringQueue.poll();
        }

        if (str1.equals(str2)) {
            System.out.println("This string is Palindrome String!");
        } else {
            System.out.println("This string is not aPalindrome String!");
        }
    }
}
