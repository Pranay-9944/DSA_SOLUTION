package STACK_PACK;

import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.util.Stack;

public class find_celebrity_op {
    public static  int  find(int a[][])
    {
        Stack<Integer> st= new Stack<>();
        for (int i = 0; i < a.length; i++)
        {
            st.add(i);
        }

        while(st.size()>1)
        {
            int a1=st.pop();
            int  b1=st.pop();

            if(a[a1][b1]==1)
            {
                st.push(b1);
            }
            else{
                st.push(a1);
            }
        }

        int can=st.pop();
        for (int i = 0; i < a.length; i++) {
            if(i!=can)
            {
                if(a[can][i]==1)
                {
                    return -1;
                }
                if(a[i][can]==0)
                {
                    return -1;
                }
            }

        }
        return can;

    }
void main()
{
    int a[][]={{0,0,0},
            {1,1,0},
            {1,0,0}};


    int b= find(a);
    System.out.println(b);
}



}
