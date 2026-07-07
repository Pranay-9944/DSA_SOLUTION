package ArrayLits;

import java.util.HashMap;

public class Most_fre_after_key {
    public static int find(int[] arr,int k)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = -1;
        int maxFreq = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == k) {
                int next = arr[i + 1];
                map.put(next, map.getOrDefault(next, 0) + 1);
                if (map.get(next) > maxFreq) {
                    maxFreq = map.get(next);
                    ans = next;
                }

            }
        }
        return ans;



    }
    void main()
    {
        int[] arr={1,100,200,1,100};
        int key=1;
        System.out.println(find(arr,key));
    }
}
