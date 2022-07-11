package ss3_method.excersice;

import java.util.Arrays;
import java.util.Scanner;

public class TheTotalOfNumberDiagonalLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the row of array: ");
        int row = scanner.nextInt();
        int[][] matrix = new int[row][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.printf("Enter the a[%d][%d]", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(Arrays.toString(matrix[i]));
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        System.out.println("The total of number in diagonal line is: " +sum);
    }
}

