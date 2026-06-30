package Divide_conqure;

public class rotated_sorted_aray {
    public static int rotated(int []arr,int target)
    {

        for (int i = 0; i <arr.length ; i++) {


            if(arr[i]==target)
            {

            return i;


            }

        }
        return -1;

    }
    void main()
    {
         int[] arr = {2, 3, 6, 7};
        int target = 7;

        System.out.println(   rotated(arr,target));
    }
}
