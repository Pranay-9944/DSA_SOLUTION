package STACK_PACK;

import java.util.ArrayList;

class StackDemoArraylist {
    static class stack
    {
        ArrayList<Integer> l= new ArrayList<>();

        public boolean isempty()
        {
            return l.size()==0;


        }
        public void push(int a )
        {
            l.add(a);

        }
        public int pop()

        {
            int get=l.get(l.size()-1);
            l.remove(l.size()-1);
            return get ;
        }
        public int peek()

        {
            return l.get(l.size()-1);

        }

public void push_bottom(int data)
{
    int size=l.size();
    l.add(0,data);
}
public void displsy()
{
    for (int a:l)
    {
        System.out.println(a);
    }
}
    }

    public static  void main(String[] args)

    {
        stack s = new stack();

        s.push(10);
        s.push(10);
        s.push(20);
        s.push(40);
        s.push_bottom(10000001);

        s.displsy();


    }
}
