package STACK_PACK;

public class Sliding_window_max {
    public static  void maximum(int a[])
    {
        int k=3;
        int ans[] =new int[a.length-k+1];
        for (int i = 0; i <=a.length-k; i++) {

                    int max = Math.max(a[i], Math.max(a[i + 1], a[i + 2]));
                    ans[i]=max;





        }
        for(int i:ans)
        {
            System.out.println(i);
        }

    }
    void main()
    {
        int a[]={1,3,-1,-3,5,3,6,7};
        maximum(a);
    }
}
