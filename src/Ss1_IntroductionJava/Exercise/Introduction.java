package Ss1_IntroductionJava.Exercise;

import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello:" + name);
    }
}
