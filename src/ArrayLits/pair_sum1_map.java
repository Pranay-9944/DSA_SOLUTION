package ArrayLits;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class pair_sum1_map {

    public static boolean findpairb(int[] arr,int target)
    {
        HashSet<Integer> set =new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int need= target-arr[i];
            if(set.contains(need))
            {
                return true;
            }
            else{
                set.add(arr[i]);
            }

        }
return false;
    }
    void main()
    {
        int[] arr={1,2,3,4,5,6};
        int target=5;



         findpairb(arr,target);
    }
}
