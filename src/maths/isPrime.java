package maths;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number n to get prime numbers till n = ");
        n=in.nextInt();
        for(int i=1;i<=n;i++) {  // prime numbers till n
            System.out.println(i + " " + Prime(i));
        }


    }
    static boolean Prime(int n) {
        if (n <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
