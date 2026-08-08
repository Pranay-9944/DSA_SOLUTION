package STACK_PACK;

import java.io.LineNumberInputStream;
import java.util.Stack;

public class remove_k_digit {
    public static String  remove(String a)
    {
        int k=3;
        Stack<Character> st= new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            char digit = a.charAt(i);

            while(!st.isEmpty() && k>0 && st.peek()>digit)
            {
                st.pop();
                k--;

            }
            st.push(digit);


        }
        if(k>0)
        {
            while (!st.isEmpty() && k>0)
            {
                st.pop();
                k--;
            }
        }
        StringBuilder ans=new StringBuilder();
       while(!st.isEmpty())
       {
           ans.append(st.pop());
       }
        ans.reverse();
        int i = 0;

        while (i < ans.length() - 1 && ans.charAt(i) == '0') {
            i++;
        }

        ans = new StringBuilder(ans.substring(i));

        // If nothing remains
        if (ans.length() == 0) {
            return "0";
        }

        return ans.toString();

    }
    void main()
    {
        String a="1432219";
        System.out.println(     remove(a));;
    }
}
