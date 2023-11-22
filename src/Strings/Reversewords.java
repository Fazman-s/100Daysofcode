package Strings;
import java.util.Scanner;

public class Reversewords {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        String[] words=s.trim().split(" +");   //trims begining and end spaces -- splits trimmed words into array of words
        //based on spaces btw -" +"  --one or more spaces
        int i=0,j=words.length-1;
        while(i<j) {
            String t = words[i];
            words[i] = words[j];
            words[j] = t;
            i++;
            j--;
        }
        System.out.println(String.join(" ", words));




    }
}

