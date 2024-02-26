package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

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
        HashMap< String, Integer > wordCount = new HashMap< String, Integer >();

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

        // Extracting all keys of wordCount
        final Set< String > wordsInString = wordCount.keySet();

        // Iterating through all words in wordCount

        for (String word: wordsInString) {
            // if word count is greater than 1

            if (wordCount.get(word) > 1) {
                // Printing that word and it's count
                System.out.println(word + " : " + wordCount.get(word));
            }
        }

    }

}
