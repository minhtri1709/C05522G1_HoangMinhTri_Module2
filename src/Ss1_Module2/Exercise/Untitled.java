package Ss1_Module2.Exercise;

import java.util.Scanner;

public class Untitled {
    public static void main(String[] args) {
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money by USD: ");
        usd = sc.nextDouble();
        double exchange = usd * 23000;
        System.out.print("Giá trị VND: " + exchange);
    }
}
