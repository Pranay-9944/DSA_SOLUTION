package HASHMAP;

import java.util.HashMap;


public class Majority_Element {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n:nums)
        {

                map.put(n, map.getOrDefault(n,0)+1);


        }
        int maxfreq=0;
        int ans=0;
        for (int key : map.keySet())
        {
            if(map.get(key)>maxfreq)
            {
                maxfreq=map.get(key);
                ans=key;
            }
        }



  return ans ;
    }
    public static void main(String[] args) {
        int []nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));;

    }
}


