package Strings;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(countwords(str));
    }

    public static int countwords(String str){
        int count=0;
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.split(" +");
        for(int i=0;i<words.length;i++){
            count++;
        }
        return count;

    }
}
