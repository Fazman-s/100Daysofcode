package Strings;

import java.util.Scanner;

public class RetainConsecutiveVowels {
    public static String retainConsecutiveVowels(String inputStr) {
        String vowels = "AEIOUaeiou";
        String output = "";
        String consecutiveVowels = "";

        for (char c : inputStr.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                consecutiveVowels += c;
            } else {
                if (consecutiveVowels.length() > 1) {
                    output += consecutiveVowels;
                }
                output += c;
                consecutiveVowels = "";
            }
        }
        if (consecutiveVowels.length() > 1) {
            output += consecutiveVowels;
        }

        return output;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();

        System.out.println(retainConsecutiveVowels(s));

    }
}