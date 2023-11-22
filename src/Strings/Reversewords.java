package Strings;
import java.util.Scanner;

public class Reversewords {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        String[] words=s.trim().split(" +");   //trims begining and end spaces -- splits trimmed words into array of words
        //based on spaces btw -" +"  --one or more spaces

        // Initialize the output string
        String out = "";

        // Iterate through the words in reverse order
        for (int i = words.length - 1; i > 0; i--) {
            // Append the current word and a space to the output
            out += words[i] + " ";
        }

        // Append the first word to the output (without trailing space)
        System.out.println(out + words[0]);



    }
}

