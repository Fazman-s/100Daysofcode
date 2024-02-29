package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VowelsFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str =in.nextLine();
        findAndDisplayVowels(str);
    }

    static void findAndDisplayVowels(String str){
        HashMap<Character,Integer> vowels = new HashMap<>();
        vowels.put('a',0);
        vowels.put('e',0);
        vowels.put('i',0);
        vowels.put('o',0);
        vowels.put('u',0);

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(vowels.containsKey(ch)){
                vowels.put(ch,vowels.get(ch)+1);
            }
        }
        for(Map.Entry<Character,Integer> entry:vowels.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }

}
