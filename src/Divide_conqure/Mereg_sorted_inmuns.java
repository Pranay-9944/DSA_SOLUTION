package Divide_conqure;

import java.util.Arrays;

public class Mereg_sorted_inmuns {
    public static void innum1(int[] arr1,int[] arr2,int m,int n)
    {
        int i=m-1;
        int j= n-1;
        int k=m+n-1;


        while (i>=0 && j>=0)
            {
            if(arr1[i]>arr2[j])
            {
                arr1[k]=arr1[i];
                k--;
                i--;

            }
            else {
                arr1[k]=arr2[j];
                        k--;
                j--;
            }
        }
        while (j>=0)
        {
            arr1[k]=arr2[j];
j--;
k--;
        }


        System.out.println(Arrays.toString(arr1));


    }
    void main()
    {

        int[]    nums1 = {1,3,9,0,0,0};
        int[] nums2 = {2,5,6};

        innum1(nums1,nums2,3,3);
        for (int n:nums1)
        {
            System.out.println(n);
        }
    }
}
