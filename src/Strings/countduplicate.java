package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countduplicate {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        countdub(s);
    }

    public static void countdub(String s){
        // Splitting inputString into words
         String[] words = s.toLowerCase().split(" +");

        // Creating one HashMap with words as key and their count as value
        HashMap< String, Integer > wordCount = new HashMap<>();

        // Checking each word
        for (String word: words) {
            // whether it is present in wordCount
            if (wordCount.containsKey(word)) {
                // If it is present, incrementing it's count by 1
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                // If it is not present, put that word into wordCount with 1 as
                // it's value
                wordCount.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();

            if (count > 1) {
                System.out.println(word + " : " + count);
            }
        }





    }

}
