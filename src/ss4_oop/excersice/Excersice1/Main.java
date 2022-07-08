package ss4_oop.excersice.Excersice1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double theFirstNumber = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double theSecondNumber = scanner.nextDouble();

        System.out.println("Enter the third number: ");
        double theThirdNumber = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(theFirstNumber, theSecondNumber, theThirdNumber);

        System.out.println("The quadratic is: " + quadraticEquation.display());

        double delta = quadraticEquation.getDiscriminant();

        if (delta > 0) {
            System.out.print("The quadratic has 2 roots are: " + quadraticEquation.getRoot1() + " & " + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.print("The quadratic has 1 root is: " + quadraticEquation.getRoot2());

        } else {
            System.out.print("The quadratic has 0 root.");
        }
    }
}
