package Divide_conqure;

public class search_sorted_array {
    public static int rotated(int []arr,int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low)/2;
            if (arr[mid] == target) {
                return mid;
            }
            if(arr[low]<=arr[mid])
            {
                if(target < arr[mid] && target>=arr[low])
                {
                        high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else
            {
                if(target>=arr[mid ] && target<=arr[high])
                {
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }

        }
        return -1;
        }

        void main()
        {
            int[] arr = {4,5,6,7,0,1,2};
            int target = 7;

            System.out.println(   rotated(arr, target));

        }
    }
