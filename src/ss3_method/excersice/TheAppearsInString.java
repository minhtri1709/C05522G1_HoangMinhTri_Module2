package ss3_method.excersice;

import java.util.Scanner;

public class TheAppearsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input anything you want: ");
        String str = scanner.nextLine();

        System.out.println("Input the character you want to compare with string: ");
        char character = scanner.nextLine().charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++){
            if (character == str.charAt(i)){
                count++;
            }
        }
        System.out.println("The appears of character in sting is: " + count);
    }
}
