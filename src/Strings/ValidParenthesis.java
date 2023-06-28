package Strings;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '{'|| c== '[' || c=='('){
                stack.push(c);
            }else if(c =='}' && !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            }else if(c == ']' && !stack.isEmpty() && stack.peek() =='['){
                stack.pop();
            }else if(c == ')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();

            }else {
                return false;
            }

        }
        return stack.isEmpty();


    }
}


//       if(s.length()%2 !=0) return false;
//               Stack<Character> stack = new Stack<>();
//
//        for(char c : s.toCharArray()){
//        if(c == '{' || c == '[' || c=='('){
//        stack.push(c);
//        }
//        else if(c =='}' && !stack.isEmpty() && stack.peek() == '{'){
//        stack.pop();
//        } else if(c ==']' && !stack.isEmpty() && stack.peek() == '['){
//        stack.pop();
//        } else if(c ==')' && !stack.isEmpty() && stack.peek() == '('){
//        stack.pop();
//        }
//        }
//        return stack.isEmpty();
