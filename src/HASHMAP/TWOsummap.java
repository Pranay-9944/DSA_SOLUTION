package HASHMAP;

import java.util.Arrays;
import java.util.HashMap;

public class TWOsummap {
    public static int[] mapsum(int arr[],int targer)
    {
        HashMap<Integer, Integer> map= new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            int need= targer-arr[i];


            if(map.containsKey(need))
            {
                return new int[]{map.get(need),i};

        }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args)
    {

        int arr[]={2,3,2,1,8,2};
        int target=9;
        System.out.println(Arrays.toString(mapsum(arr,target)));;

    }
}
