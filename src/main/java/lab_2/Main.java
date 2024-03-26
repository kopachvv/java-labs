package lab_2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final int MIN_VALUE = -100;
    private static final int MAX_VALUE = 100;

    public static void main(String[] args) {
        int x, y, fill, action;
        String message;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of the matrix rows: ");
        do {
            x = scanner.nextInt();
            if (x <= 0) {
                System.out.println("Matrix rows cannot be negative number or 0");
            } else if (x > 20){
                System.out.println("Matrix cannot have more than 20 rows");
            } else {
                break;
            }
            System.out.println("Try again: ");
        } while(true);

        System.out.println("Enter number of the matrix columns: ");
        do {
            y = scanner.nextInt();
            if (y <= 0) {
                System.out.println("Matrix columns cannot be negative number or 0");
            } else if (y > 20){
                System.out.println("Matrix cannot have more than 20 columns");
            } else {
                break;
            }
            System.out.println("Try again: ");
        } while(true);

        int[][] matrix = new int[x][y];
        System.out.println("How do you want to fill the matrix?\nEnter 1 for manually or 2 for automatically");
        do {
            fill = scanner.nextInt();
            if (fill == 1){
                fillManually(matrix);
                break;
            } else if (fill == 2){
                fillAutomatically(matrix);
                break;
            } else {
                System.out.println("Please enter a valid number: ");
            }
        } while (true);

        System.out.println("""
                Your matrix is now created and filled!
                Enter 1 to find minimal value, 2 to find maximum value,
                3 to find average value from sum of all elements, or 4 to see the matrix
                If you want to close the program, enter zero""");
        action = scanner.nextInt();
        do {
            switch (action) {
                case 1 -> message = "Minimum value of the matrix: " + findMin(matrix);
                case 2 -> message = "Maximum value of the matrix: " + findMax(matrix);
                case 3 -> message = "Average value from sum of all elements: " + calculateAverage(matrix);
                case 4 -> message = "Matrix:\n" + readMatrix(matrix);
                default -> message = "Please enter a valid number: ";
            }
            System.out.println(message);
            action = scanner.nextInt();
        } while (action != 0);
        scanner.close();
    }
    private static int findMin(int[][] matrix){
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < min){
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }
    private static int findMax(int[][] matrix){
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
    private static double calculateAverage(int[][] matrix){
        double sum = 0.0;
        int elements = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
                elements++;
            }
        }
        return sum / elements;
    }
    private static void fillManually(int[][] matrix){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("[%d][%d] = ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    private static void fillAutomatically(int[][] matrix){
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
            }
        }
    }

    private static String readMatrix(int [][] matrix){
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                output.append(matrix[i][j]).append(' ');
            }
            output.append('\n');
        }
        return output.toString();
    }
}
