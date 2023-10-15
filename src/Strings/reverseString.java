package Strings;

import java.util.Collections;
import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
//        String str="Hello";
//        String rev="";
//        for(int i=str.length()-1;i>=0;i--){
//            rev += str.charAt(i);
//
//        }
//        System.out.print(rev);
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] s1 = s.toCharArray();

        int start = 0;
        int end = s1.length - 1;
        while (start < end) {
            char temp = s1[start];
            s1[start] = s1[end];
            s1[end] = temp;

            start++;
            end--;
        }
        System.out.print(s1);

    }
}
