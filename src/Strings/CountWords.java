package Strings;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(countwords(str));
    }

    public static int countwords(String str){
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.split(" +");
        return words.length;

    }
}
