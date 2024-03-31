package stacks;

import java.util.Stack;

public class builtinstack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        System.out.println("push");
        System.out.println(st.push(1));
        System.out.println(st.push(20));
        System.out.println(st.push(33));
        System.out.println(st.push(45));


        System.out.println("pop");
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
