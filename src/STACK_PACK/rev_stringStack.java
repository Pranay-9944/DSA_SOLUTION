package STACK_PACK;

import java.util.Stack;

public class rev_stringStack {

    public static void pushbottom(Stack<Character> st, char a) {
        if (st.isEmpty()) {
            st.push(a);
            return;
        }

        char d = st.pop();
        pushbottom(st, a);
        st.push(d);
    }

    public static void revst(Stack<Character> st) {
        if (st.isEmpty()) {
            return;
        }

        char a = st.pop();
        revst(st);
        pushbottom(st, a);
    }

    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();

        st.push('h');
        st.push('e');
        st.push('l');
        st.push('l');
        st.push('o');

        System.out.println("Original Stack: " + st);

        revst(st);

        System.out.println("Reversed Stack: " + st);
    }
}