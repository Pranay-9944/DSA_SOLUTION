//package STACK_PACK;
//
//public class Next_greater_element {
//
//    void main()
//    {
//        int a []={6,4,8};
//        int[] ans=new int[a.length];
//
//        int i =0;
//        int j=i+1;
//        while(i<a.length && j<a.length)
//        {
//            if(a[j]>a[i])
//            {
//                ans[i]=a[j];
//                i++;
//                j=i+1;
//
//
//
//            }
//            else {
//              j++;
//
//            }
//            if (j == a.length) {
//                ans[i] = -1;
//                i++;
//                j = i + 1;
//                if (i == a.length-1) {
//                    ans[i] = -1;
//                }
//
//
//
//            }
//
//
//        }
//        for (int a1:a)
//        {
//            System.out.print(a1);
//
//        };
//        System.out.println(" ");
//        for (int j1:ans)
//        {
//            System.out.print(j1);
//        }
//
//    }
//}



package STACK_PACK;

import java.util.Stack;

//
//public class Next_greater_element {
//
//    void main() {
//
//        int[] a = {6, 8, 2, 1, 0};
//        int[] ans = new int[a.length];
//
//
//        int i = 0;
//        while (i < a.length) {
//            int j = i + 1;
//            ans[i] = -1;
//
//
//        while (j < a.length)
//        {
//            if(a[j]>a[i])
//            {
//                ans[i]=a[j];
//                break;
//            }
//            j++;
//        }
//        i++;
//    }
//        for (int x : a) {
//            System.out.print(x + " ");
//        }
//
//        System.out.println();
//
//        for (int x : ans) {
//            System.out.print(x + " ");
//        }
//    }
//}
public class Next_greater_element
{
    void main()
    {
        int[] a = {6, 8, 2, 1, 0};
        int[] ans=new int[a.length];
        Stack <Integer> s= new Stack<>();

        for (int i = a.length-1; i >=0 ; i--) {

            while(!s.empty() && a[s.peek()]<=a[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                ans[i]=-1;
            }else{
               ans[i]=a[s.peek()];
            }
            s.push(i);
        }

        for (int x : a) {
            System.out.print(x + " ");
        }

        System.out.println();

        for (int x : ans) {
            System.out.print(x + " ");
        }
        }
}