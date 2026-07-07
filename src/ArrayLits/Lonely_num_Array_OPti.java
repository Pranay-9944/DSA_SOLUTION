package ArrayLits;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class Lonely_num_Array_OPti {
    public static ArrayList<Integer> opti(int[] arr)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i: arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> ans = new ArrayList<>();


        for (int num : arr) {
            if (map.get(num) == 1 &&
                    !map.containsKey(num - 1) &&
                    !map.containsKey(num + 1)) {

                ans.add(num);
            }
        }
        return ans;
    }
    void main()
    {
        int arr[]={1,2,6,4,7,10,22,22};
        System.out.println(   opti(arr));
    }
}
