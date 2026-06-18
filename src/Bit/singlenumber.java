package Bit;

public class singlenumber {
    public static void main(String[] args)
    {
        int nums[]={1,1,2,2,3,3};
        int ans=0;
        for(int num :nums)
        {
            ans=ans^num;
        }
        System.out.println(ans);
    }
}
