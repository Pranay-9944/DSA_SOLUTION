package Divide_conqure;

public class quick_sort {
  public static void quicksort(int arr[],int low,int high)
    {
        if(low<high)
        {
            int pivot=fun(arr,low,high);
            quicksort(arr,low,pivot-1);
            quicksort(arr,pivot+1,high);
        }


    }

    public static int fun(int arr[],int low, int high)
    {
        int pivot=arr[low];
        int i=low;
        int j=high;


        while(i<j)
        {
            while(arr[i]<=pivot & i<=high)
            {
                i++;
            }
            while (arr[j]>pivot & j>=low)
            {
                j--;
            }
            if(i<j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    void main()
    {
        int arr[]={2,1,3,5,7,4};
        quicksort(arr,0,arr.length-1);
        for (int n:arr)
        {
            System.out.print(n);
        }



    }
}
