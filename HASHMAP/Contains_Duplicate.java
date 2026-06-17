package HASHMAP;

import com.sun.jdi.request.StepRequest;

import java.util.HashMap;///////////////////slove using set

public class Contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                return true;
            }
            map.put(nums[i],i); //use set

        }
        return false;

    }
    public static void main(String[] args)
    {
       int[] arr={1,2,3};
        System.out.println(  containsDuplicate(arr));;
    }
}
