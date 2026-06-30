package Divide_conqure;

public class Find_min_Sorted_2 {
    public static  void  findmin2(int []arr)
    {
        int low=0;
        int high=arr.length-1;
        while(low<high)
        {
            int mid=low+(high-low)/2;

            if(arr[mid]==arr[high])
            {
                high--;
                continue;
            }

            if(arr[high]<arr[mid] )
            {

                low=mid+1;
            }
            else {

                high=mid;
            }


        }
        System.out.println(arr[low]);;
    }
    void main()
    {
        int[] arr = {4,5,6,7,0,1,4};
        findmin2(arr);
    }
}
