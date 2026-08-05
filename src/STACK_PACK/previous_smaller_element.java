package STACK_PACK;

import java.util.Arrays;
import java.util.Stack;

public class previous_smaller_element {
    public  static  void pre(int[] a)
    {
        Stack<Integer> stack= new Stack<>();
        int[] ana=new int[a.length];

        for (int i = 0; i < a.length; i++) {


            while (!stack.isEmpty() && stack.peek() >= a[i]) {
                stack.pop();

            }
            if (stack.isEmpty()) {
                ana[i] = -1;
            } else {
                ana[i] = stack.peek();
            }
            stack.push(i);

        }


        for (int ans:ana)
        {
            System.out.println(ans);
        }
    }
    void main()
    {
        int a[]={5,6,7,8,9};
        pre(a);
    }
}
