package Strings;

import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();

        System.out.println(isAnagram(s1,s2));
    }
    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()) return false;

        int[] countchar = new int[26];
        for(int i=0;i<s1.length();i++){
            countchar[s1.charAt(i)-'a']++;
            countchar[s2.charAt(i)-'a']--;
        }
        for(int count : countchar){
            if(count != 0){
                return false;
            }
        }
        return true;

    }
}
