package mainDiagonalSum;

import java.util.Scanner;

public class MainDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row size: ");
        int row = scanner.nextInt();
        System.out.print("Enter column size: ");
        int column = scanner.nextInt();
        System.out.println("Enter 2D array Elements");
        int array[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        sum(array, row);

    }

    public static int sum(int array[][], int row) {
        int sum = 0;
        for (int a = 0; a < row; a++) {
            sum += array[a][a];
        }
        return sum;
    }

}
