package RECURSION;

import java.util.ArrayList;
import java.util.List;

public class Print_All_subsiquence_esy {

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        helper(0, nums, new ArrayList<>(), ans);

        return ans;
    }

    public static void helper(int index, int[] arr,
                              List<Integer> list,
                              List<List<Integer>> ans) {

        ans.add(new ArrayList<>(list));

        for (int i = index; i < arr.length; i++) {

            list.add(arr[i]);

            helper(i + 1, arr, list, ans);

            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        System.out.println(subsets(nums));
    }
}