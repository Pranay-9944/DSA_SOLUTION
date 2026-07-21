package STACK_PACK;

import java.util.Stack;

public class rec_stack {
    public static  void revstack(Stack<Integer> s,int p)
    {
        if(s.isEmpty())
        {
            s.push(p);
            return;
        }
        int a=s.pop();
        revstack(s,p);
        s.push(a);


    }

    public static  void rev(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return ;
        }
        int p=s.pop();
        rev(s);
        revstack(s,p);

    }

    void main()
    {


        Stack<Integer> s= new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s);
        rev(s);
        System.out.println(s);
    }
}
