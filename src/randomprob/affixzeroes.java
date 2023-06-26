package randomprob;

import java.util.Scanner;

/* Given a pair of positive integers m and n (m < n; 0 < m < 999; 1 < n < = 999),
 write a program to smartly affix zeroes, while printing the numbers from m to n.

Example-1
Input
5 10
Expected output
05 06 07 08 09 10 */

public class affixzeroes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       /* int n = in.nextInt();
        int m = in.nextInt();

         for(int i=n;i<=m;i++){
            System.out.print("0"+n+" ");
           n++;
         }  */
        // OR

        // optimized code without any errors


        int low = in.nextInt();
        int up = in.nextInt();
        for (int i = low; i <= up; i++) {
            if (up >= 100)
                System.out.printf("%03d ", i);
            else if (up >= 10)
                System.out.printf("%02d ", i);
            else
                System.out.printf("%d ", i);
        }


    }
}
