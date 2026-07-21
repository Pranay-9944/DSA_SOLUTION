package STACK_PACK;

import java.util.Stack;

public class push_at_bottom {
    public static void push_bottom(int data,Stack<Integer> s)
    {

        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int iteam=s.pop();
        push_bottom(data,s);
        s.push(iteam);


    }
    public static  void dis(Stack<Integer> s)
    {
        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }
    }

    public static  void main(String[] args)
    {
        Stack<Integer> s= new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        push_bottom(4,s);
        dis(s);

    }
}
