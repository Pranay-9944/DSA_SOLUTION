package RECURSION;

public class reverse_rec_2pointer {
    public static void rev(int [] arr,int left ,int right)
    {


        if(left>=right)
        {
            return;
        }
            int temp=arr[right];
             arr[right]=arr[left];
             arr[left]=temp;

        rev(arr,left+1,right-1);

    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        rev(arr,0,arr.length-1);
        for (int n:arr)
        {
            System.out.println(n);
        }
    }
}
