package Divide_conqure;

public class Find_min_sorted_rotated {
    public static void findmin(int arr[])
    {
        int low=0;
        int high=arr.length-1;
        while(low<high)
        {
            int mid=low+(high-low)/2;


            if(arr[high]<arr[mid] )
                {

                   low=mid+1;
                }
            else {

                    high=mid;
                }

            }
        System.out.println(arr[low]);
            }

    void main()
    {
        int[] arr = {3,4,5,1,2};

        Find_min_sorted_rotated.findmin(arr);
    }
}
