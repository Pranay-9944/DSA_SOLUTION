package Divide_conqure;

public class merge_sorted_array {

    void main()
    {

        int[]    nums1 = {1,2,3};
        int[] nums2 = {2,5,6};
        int left=0;
        int right=0;
int[] temp=new int[nums1.length+nums2.length];
        int k=0;
        while(left < nums1.length && right < nums2.length)
        {
            if (nums1[left] <= nums2[right]) {
                temp[k] = nums1[left];
                left++;
            }
            else {
                temp[k]=nums2[right];
                right++;
            }
            k++;



        }

        while (left<nums1.length)
        {
            temp[k] = nums1[left];
            left++;
            k++;
        }
        while (right< nums2.length)
        {
            temp[k]=nums2[right];
            right++;
            k++;
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }


    }



}
