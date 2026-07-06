package ArrayLits;

public class pair_unsorted {
    public static Boolean roated(int[] arr,int target)
    {

        int pivot=-1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1])
            {
                pivot=i;
                break;
            }
        }

        int low=pivot+1;
        int high=pivot;

        while(low!=high)
        {
            if(arr[low]+arr[high]==target)
            {
                return true;
            }
            if(arr[low]+arr[high]>target)
            {
            high=(arr.length+high- 1)% arr.length;
            }
            else
            {
                low=(low+1)% arr.length;
            }
        }
        return false;

    }
    void main()
    {

            int arr[]={11,15,6,8,9,10};
            int target=16;
            roated(arr,target);
    }

}
