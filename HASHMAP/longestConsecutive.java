package HASHMAP;

import java.util.Arrays;
import java.util.HashSet;

public class longestConsecutive {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // Add all numbers to HashSet
        for (int n : nums) {
            set.add(n);
        }

        int longest = 0;

        for (int n:set)
        {
            if(!set.contains(n-1))
            {
                int currentnum=n;
                int currentstreak=1;

                while(set.contains(currentnum + 1))
                {
                    currentnum++;
                    currentstreak++;
                }
                longest = Math.max(longest, currentstreak);

            }
        }
        return longest;
    }

    public static void main(String[] args) {


        int[] nums={1,2,3,4111,32,1,1};
        System.out.println(  longestConsecutive(nums));;
    }
}
