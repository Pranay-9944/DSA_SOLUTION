package HASHMAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class topKFrequent {

    public static void kf(int[] nums, int f) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        ArrayList<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        for (int i = 0; i < f; i++) {
            System.out.println(list.get(i).getKey());
        }
    }

    public static void main(String[] args) {

        int[] nums = {1,1,1,2,2,2,3,4,5};
        int f = 2;

        kf(nums, f);
    }
}