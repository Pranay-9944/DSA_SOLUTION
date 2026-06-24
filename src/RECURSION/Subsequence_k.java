package RECURSION;

import java.util.ArrayList;
import java.util.List;

public class Subsequence_k {

    public static void subK(int index,int[] arr, int target,  List<Integer > list, int sum,int n)
    {

        if(index==n)
        {
            if(sum==target)
            {
                System.out.println(list);
            }
            return;

        }

        list.add(arr[index]);
        sum += arr[index];
        subK(index+1,arr,target,list,sum,n);

        sum -= arr[index];
        list.remove(list.size()-1);
        subK(index+1,arr,target,list,sum,n);



    }
    void main()
    {
        int[] arr={1,2,1};
        int n = arr.length;
        int target=2;
        List<Integer> list=new ArrayList<>();
   subK(0,arr,target,list,0,n);
    }
}
