package STACK_PACK;

import kotlin.jvm.JvmClassMappingKt;

import java.util.Stack;

public class next_greater2 {
    public static void next2(int[] a) {

            int n = a.length;
            int[] ans = new int[n];

            int i = 0;

            while (i < n) {

                ans[i] = -1;
                int count = 1;

                while (count < n) {

                    int j = (i + count) % n;

                    if (a[j] > a[i]) {
                        ans[i] = a[j];
                        break;
                    }

                    count++;
                }

                i++;
        }

        for (int x : ans)
            System.out.println(x);
    }
    void main()
    {
        int a[]={1,2,3,4,1};

    }
}
