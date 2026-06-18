package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Two_sumtwopointer {

    public static int[] twosum(int[] arr,int target)
    {
        int right= arr.length-1;
        int left=0;

        while(left<right)
        {
            int sum=arr[left]+arr[right];
            if(target==sum)
            {
                System.out.println(left+" ,"+right);
                break;
            } else if (sum>target) {
                right--;

                
            }
            else {
                left++;
            }

        }
        return new  int[] {-1,-1};
    }


    public static void main(String[] args)
    {
        int[] arr={1,2,3,5};
        int target=8;
     Arrays.sort(arr);
        twosum(arr , target);

    }
}
