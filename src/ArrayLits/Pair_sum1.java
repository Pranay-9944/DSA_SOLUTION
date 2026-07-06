package ArrayLits;

import javax.xml.transform.stax.StAXResult;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;

public class Pair_sum1 {
    public static boolean findpair(int[] arr, int target)
    {
        int low=0;
        int high=arr.length-1;
        int total=0;
        while(low<high)
        {
            if(arr[low]+arr[high]==target)

            {
                    return true;
            }

            if(arr[low]+arr[high]>target)
            {
                high--;
            }
            else{
                low++;
            }

        }
        return false;

    }

    void main()
    {
 int[] arr={1,2,3,4,5,6};
 int target=5   ;

        System.out.println(findpair(arr,target));

    }
}
