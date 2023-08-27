package randomprob;
import java.util.Scanner;

public class MaximumSumSubMatrix {
    // Function to find maximum sum submatrix
    static void maxSubmatrixSum(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        int maxSubmatrix = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = i; k < r; k++) {
                    for (int l = j; l < c; l++) {
                        int sumSubmatrix = 0;

                        for (int m = i; m <= k; m++) {
                            for (int n = j; n <= l; n++) {
                                sumSubmatrix += matrix[m][n];
                            }
                        }
                        maxSubmatrix = Math.max(maxSubmatrix, sumSubmatrix);
                    }
                }
            }
        }
        System.out.println(maxSubmatrix);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the matrix values:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        maxSubmatrixSum(matrix);
    }
}


