package Greedy;

import java.util.Arrays;

public class prob_435_non_overlapping {
    void main()
    {
        int[][] pairs = {
                {1, 2},
                {2, 3},
                {3, 4},
                {1,3}
        };

        Arrays.sort(pairs ,(a,b)->Integer.compare(a[1],b[1]));


        int count=pairs.length-1;
        int t=pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if(pairs[i][0]>=t)
            {
                count--;
                t=pairs[i][1];

            }

        }
        System.out.println(count);
        System.out.println(count);
    }
}
