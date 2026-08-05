package STACK_PACK;

import java.util.Stack;

public class sum_of_subarray {

    public  static  int[] nse(int a[])
    {
        Stack<Integer> stack = new Stack<>();
        int nse[]= new int[a.length];
        for (int i = a.length-1; i >=0; i--) {
            while(!stack.isEmpty() && a[stack.peek()]>=a[i])
            {
                stack.pop();


            }
            if(stack.isEmpty())
            {
                nse[i]= a.length;

            }
            else{
                nse[i]=stack.peek();
                 }

            stack.push(i);

        }
        return nse;
    }
    public  static  int[] pse(int a[])
    {
        Stack<Integer> stack = new Stack<>();
        int pse[]= new int[a.length];
        for (int i = 0;i<a.length;i++) {
            while(!stack.isEmpty() && a[stack.peek()]>a[i])
            {
                stack.pop();


            }
            if(stack.isEmpty())
            {
                pse[i]=-1;

            }
            else{
                pse[i]=stack.peek();
            }

            stack.push(a[i]);

        }
        return pse;
    }


    public  static  int sum_min(int[] a)
    {
        int mod = 1000000007;
        int n = a.length;

        int[] pse = pse(a);
        int[] nse = nse(a);
        long ans = 0;
        for (int i = 0; i < n; i++) {

            long left = i - pse[i];
            long right = nse[i] - i;

            ans = (ans + (a[i] * left * right) % mod) % mod;
        }

        return (int) ans;
    }
    void main(){

        int a[]={3,1,2,4};
        System.out.println(sum_min(a));;

    }

}

