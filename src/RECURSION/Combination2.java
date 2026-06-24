package RECURSION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination2 {
    private static List<List<Integer>>  combinationSum2(int[] candidates, int target) {


        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(0, candidates, target, new ArrayList<>(), ans);
        return ans ;

    }

    public static void helper(int index, int[] arr, int target,
                              List<Integer> list,
                              List<List<Integer>> ans) {

        if(target==0)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        if(target<0)
        {
            return;
        }
        for (int i = index; i < arr.length ; i++) {


            if(i>index && arr[i]==arr[i-1])
            {
                continue;
            }

            list.add(arr[i]);

            helper(i+1,arr,target-arr[i],list,ans);
list.remove(list.size()-1);
            }

    }


    public static void main(String[] args) {

        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        System.out.println(combinationSum2(candidates, target));
    }


}
