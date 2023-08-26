package randomprob;

import java.util.Arrays;
import java.util.Scanner;

public class SaddlePointMatrix {

    public static boolean isSaddlePoint(int[][] mat, int n){
        for (int i = 0; i < n; i++)
        {
            // Find the minimum element of row i.
            // Also find column index of the minimum element
            int min_row = mat[i][0], col_ind = 0;
            for (int j = 1; j < n; j++)
            {
                if (min_row > mat[i][j])
                {
                    min_row = mat[i][j];
                    col_ind = j;
                }
            }

            // Check if the minimum element of row is also
            // the maximum element of column or not
            int k;
            for (k = 0; k < n; k++)

                // Note that col_ind is fixed
                if (min_row < mat[k][col_ind])
                    break;

            // If saddle point is present in this row then
            // print it
            if (k == n)
            {
                System.out.println("Value of Saddle Point " + min_row);
                return true;
            }
        }

        // If Saddle Point not found
        return false;

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[][] mat = new int[n][n];
        for (int i=0;i< mat.length;i++){
            for(int j=0;j< mat.length;j++){
                mat[i][j] =in.nextInt();
            }
        }

        for(int i=0;i< mat.length;i++){
            System.out.println(Arrays.toString(mat[i]));
        }

        boolean x=isSaddlePoint(mat,n);
        System.out.println(x);
    }

}
