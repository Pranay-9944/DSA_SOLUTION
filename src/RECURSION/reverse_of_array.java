package RECURSION;

public class reverse_of_array {
    public static void rev (int[] arr ,int i)
    {

        if(i>= arr.length/2)
        {
            return ;

        }


            int temp=arr[i];
             arr[i]=arr[arr.length-i-1];
        arr[arr.length-i-1]=temp;

            rev(arr,i+1);




    }

    public static void main(String[] args)
    {
        int []arr={1,2,3,4,5};
        int i=0;
        rev( arr,i);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
