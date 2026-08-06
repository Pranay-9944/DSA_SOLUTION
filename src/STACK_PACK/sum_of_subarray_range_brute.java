package STACK_PACK;

public class sum_of_subarray_range_brute {
    public  static  void range(int a[]){

        int sum=0;


        for (int i = 0; i <a.length ; i++) {
            int small=a[i];
            int large=a[i];

            for (int j = i+1; j < a.length; j++) {
           small=Math.min(small,a[j]);
           large=Math.max(large,a[j]);

           sum =sum+(large-small);
             }

        }
        System.out.println(sum);
    }
    void main()
    {
        int a[]={1,3,3};
        System.out.println(a.length);
        range(a);
    }
}
