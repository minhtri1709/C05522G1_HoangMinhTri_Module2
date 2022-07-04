package Ss2_LoopArray.Excersice;

import java.util.Scanner;

public class MaxNumberIn2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the row of array: ");
        int row = scanner.nextInt();
        System.out.println("Input the collum of array: ");
        int col = scanner.nextInt();
        int[][] matrix = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Enter the a[%d][%d]", i, j);
                matrix[i][j] =scanner.nextInt();
            }
        }
        int max = matrix[0][0];
        System.out.println("The matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.print("The max number is " + max);
    }
}