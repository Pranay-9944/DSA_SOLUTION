package STACK_PACK;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.RandomAccess;

public class Sliding_window_max {
    public static  void maximum(int a[])
    {
//        int k=3;
//        int ans[] =new int[a.length-k+1];
//        for (int i = 0; i <=a.length-k; i++) {
//
//                    int max = Math.max(a[i], Math.max(a[i + 1], a[i + 2]));
//                    ans[i]=max;
//
//
//
//
//
//        }
//        for(int i:ans)
//        {
//            System.out.println(i);
//        }

        int k=3;
        int ans[]=new int[a.length-k+1];
        Deque<Integer> d= new ArrayDeque<>();
        for (int i = 0; i < a.length; i++) {

            while(!d.isEmpty() && d.peekFirst() <=i-k)
            {
                d.removeFirst();

            }
            while(!d.isEmpty() && a[d.peekLast()]<a[i])
            {
                d.removeLast();
            }
            d.addLast(i);
            if (i >= k - 1) {
                ans[i - k + 1] = a[d.peekFirst()];
            }


        }
        for (int b:ans)
        {
            System.out.println(b);
        }


    }
    void main()
    {
        int a[]={1,3,-1,-3,5,3,6,7};
        int b[]={1,3,-1,-3,5,3,6,7};

        maximum(a);
        maximum(b);
    }
}
