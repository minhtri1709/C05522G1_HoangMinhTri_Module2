package ss2_loop_array.practice;

import java.util.Scanner;

public class InterestCaculation {
    public static void main(String[] args) {
        double money = 0;
        int month = 1;
        double interest_rate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of your investment: ");
        money = scanner.nextDouble();
        System.out.println("Enter your month: ");
        month = scanner.nextInt();
        System.out.println("Enter annual interest rate: ");
        interest_rate = scanner.nextDouble();
        double total_interest = 0;
        for (int i = 0; i < month; i++) {
            total_interest = money * (interest_rate / 100 / 12) * 3;
        }
        System.out.println("Total of interest: " + total_interest);

    }
}
