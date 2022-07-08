package ss1_introductionJava.exercise;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money by USD: ");
        usd = sc.nextDouble();
        double vnd = usd * 23000;
        System.out.print("Giá trị VND: " + vnd);
    }
}
