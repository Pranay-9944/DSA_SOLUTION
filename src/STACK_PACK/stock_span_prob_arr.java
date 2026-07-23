package STACK_PACK;

public class stock_span_prob_arr {
    void main()
    {
             int[] arr={100, 80, 60, 70, 60, 75, 85};
         int[] ans=new int[arr.length];

        for (int j = 0; j < arr.length; j++) {

            int span=1;
            int i=j-1;
            while (i >= 0 && arr[i] <= arr[j]) {
                span++;
                i--;
            }
            ans[j]=span;

        }

        for (int a:ans)
        {
            System.out.println(a);
        }


        }
    }

