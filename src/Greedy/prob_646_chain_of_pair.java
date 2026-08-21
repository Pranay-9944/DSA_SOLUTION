package Greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class prob_646_chain_of_pair {
    void main()
    {
        int[][] pairs = {
                {1, 2},
                {2, 3},
                {3, 4}
        };
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
        ArrayList<Integer> ans = new ArrayList<>();

        int count =1;
        int latend=pairs[0][1];
        for (int i = 1; i < pairs.length ; i++) {
            if(pairs[i][0]>latend)
            {
                ans.add(pairs[i][0]);
                count++;
                latend=pairs[i][1];
            }
        }
        System.out.println(count);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i)+"-->");


        }    }
}
