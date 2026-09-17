package Greedy;

import java.util.Arrays;

public class Mini_abs_pair {

            void main()
            {
                int a[]={1,2,3};
                int b[]={2,1,3};
                int sum=0;
                Arrays.sort(a);
                Arrays.sort(b);
                for (int i = 0; i < a.length; i++) {

                   sum+= Math.abs(a[i]-b[i]);

                }
                System.out.println(sum);
                System.out.println(sum);

            }
        }
