package Bit;

public class singelnumber2 {
    public static  void main(String[] args)
    {
        int[] n={1,3,1,1,2};
        int count=1;
        int right=1;
        for (int i = 0; i < n.length; i++)
        {
            if(n[i]==n[right])
            {
                right++;
                count++;
            }

            if(count%3!=0)
            {

            }


        }
    }
}
