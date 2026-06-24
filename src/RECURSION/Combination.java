package RECURSION;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    public static void comb(int index,int arr[],int target, List<Integer> list,List<List<Integer>> ans)
    {

        if(index == arr.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        //pick
        if(arr[index] <=target)
        {


            list.add(arr[index ]);
            comb(index,arr,target-arr[index],list,ans);
            list.remove(list.size() - 1);

        }
        //not pick
        comb(index + 1, arr, target, list, ans);

    }
    void main()
    {
        int[] arr = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        comb(0, arr, target, list, ans);

        System.out.println(ans);    }
}
