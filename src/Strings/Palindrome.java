package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str;
        System.out.println("Enter a string to check palindrome  ");
        str =in.nextLine();
        System.out.println(isPalindrome(str));

    }

    static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2 ; i++) {
            char start= str.charAt(i);
            char end = str.charAt(str.length()-1 - i);

            if(start != end ){
                return false;
            }
        }
        return true;
    }
}
