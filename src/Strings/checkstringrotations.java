package Strings;

import java.util.Scanner;

public class checkstringrotations {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();
        System.out.println(inrotated(s1,s2));
    }

     static boolean inrotated(String s1, String s2){
        String s3=s1+s1;
        return s3.contains(s2);


    }
}
