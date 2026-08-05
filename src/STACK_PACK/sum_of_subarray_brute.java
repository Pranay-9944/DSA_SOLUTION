package STACK_PACK;

public class sum_of_subarray_brute {
    public static int sumSubarrayMins(int[] arr) {


        int n = arr.length;
        int mod = 1000000007;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int min = arr[i];
            for (int j = 0; j < n; j++) {
                min = Math.min(min, arr[j]);
                sum = (sum + min) % mod;
            }


        }return (int) sum;

    }



    void main()
    {
int a[]={3,1,3,2};
        System.out.println( sumSubarrayMins(a));;
    }
}
