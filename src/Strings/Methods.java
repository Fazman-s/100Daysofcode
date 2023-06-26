package Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
       String name = "Mission Impossible";
        System.out.println(Arrays.toString(name.toCharArray()));

       int x= name.length();
        System.out.println(x);

        String y=name.concat(" "+7);
        System.out.println(y);

        char z=name.charAt(0);
        System.out.println(z);

        System.out.println(name.indexOf("s"));

        System.out.println("    rahul     ".strip());

        System.out.println(Arrays.toString(name.split(" ")));

        String nam="   rahul ";
        System.out.println(nam.trim());//removes leading and trailing zeroes

    }
}
