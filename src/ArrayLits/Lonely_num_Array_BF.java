package ArrayLits;

import java.util.ArrayList;
import java.util.HashMap;

public class Lonely_num_Array_BF {
    public  static ArrayList<Integer> Lonely(ArrayList<Integer> list)


    {

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Count frequency of each number
        for (int num : list) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int v=list.get(i);

            if( freq.get(v) == 1 && !list.contains(v+1) && !list.contains(v-1)  )
            {
                ans.add(list.get(i));
            }


        }
        return  ans;
    }


void main()
{
    int arr[]={1,2,10,3,7};
    ArrayList<Integer> list = new ArrayList<>();
    for (int i:arr)
    {
        list.add(i);
    }
    System.out.println( Lonely(list));


}
}