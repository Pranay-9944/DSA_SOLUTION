package Divide_conqure;

public class merge_sort {

    public static void mergesort(int arr[],int low,int high)
    {
        if(low>=high)
        {
            return ;
        }
//work
   int mid=(low+high)/2;
    mergesort(arr,low,mid);  //left
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);

    }
    public static void merge(int arr[],int low,int mid ,int high)
    {

   int temp[]=new int[high-low+1];
   int left=low;
   int right=mid+1;
   int k=0;
    while (left<= mid && right<=high)
    {
        if(arr[left]<=arr[right])
        {
            temp[k]=arr[left];
            left++;
        }
        else{
            temp[k]=arr[right];
            right++;
        }
        k++;
    }
    while (left<=mid)
    {
        temp[k++]=arr[left++];

    }
    while (right<=high)
{
    temp[k++]=arr[right++];
}

        for (int i = low; i <=high; i++) {
arr[i]=temp[i-low];
        }
    }

    void main()
    {
        int arr[]={2,1,3,2};
        System.out.println(arr.length);
        mergesort(arr,0,arr.length-1);
           }
}
