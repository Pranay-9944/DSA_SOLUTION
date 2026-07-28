package STACK_PACK;


import java.util.Stack;

public class Duplictae {
    public static  boolean duplicate_parenthesis(String a)
    {
        Stack<Character> s=new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            char c=a.charAt(i);
            if(c==')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }

                if (count<1) {
                    return true;
                } else {
                    s.pop();
                }
            }
            else {
                s.push(c);
            }
        }
        return  false;
    }
    void main()
    {
        String a="(A+b)";
        String b="((A=b))";
        System.out.println(   duplicate_parenthesis(a));;
    }
}
