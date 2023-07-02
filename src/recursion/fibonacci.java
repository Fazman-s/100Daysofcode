package recursion;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fib(n));
    }

    static int fib(int n){
        // base condition
        if(n<2){
            return n;
        }
        return fib(n-1 )+ fib(n-2);

    }
}
