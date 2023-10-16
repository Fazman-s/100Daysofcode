package maths;

import java.util.Scanner;

public class prime1ton {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        prime(n);
    }

    static void prime(int N) {
        int flg;

        System.out.println("All the Prime numbers within 1 and " + N + " are:");

        for (int x = 2; x <= N; x++) {
            flg = 1;

            for (int y = 2; y * y <= x; y++) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }

            if (flg == 1)
                System.out.print(x + " ");
        }
    }

}
