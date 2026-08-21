package Greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class activity_selection {
    void main()
    {
        int start[] = {1, 3, 3, 4, 5};
        int end[]   = {2, 4, 6, 9, 9};


        int count=1;
            int endtime=end[0];
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        for (int j = 1; j < end.length; j++) {

                if(start[j]>=endtime)
                {
                    count++;
                    endtime=end[j];
                    ans.add(j);

            }

            }
        System.out.println("max actvity="+count);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println("A"+ans.get(i));

        }

    }
}
