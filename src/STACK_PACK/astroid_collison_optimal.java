package STACK_PACK;

import java.util.Stack;

public class astroid_collison_optimal {
    public  static  void astroid_op(int[] a)
    {
        Stack <Integer> st= new Stack<>();
        for (int astro : a)
        {
            boolean alive = true;

            while (!st.isEmpty() &&st.peek()>0&& astro<0  )
          {

              if(Math.abs(astro)>st.peek())
              {
                  st.pop();
              } else if (Math.abs(astro)==st.peek()) {
                  st.pop();
                  alive = false;
                  break;
                  
              }   else {
                  alive = false;
                  break;
              }


          }
            if (alive) {
                st.push(astro);
            }
        }
        for (int s:st)
        {
            System.out.println(s);
        }
    }
    void main()
    {
        int a[]={2,3,-1,-3};
        astroid_op(a);
    }
}
