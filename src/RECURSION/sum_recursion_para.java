package RECURSION;

public class sum_recursion_para {
    public  static void s(int i,int sum)

    {
        if(i<1)
        {
            System.out.println(sum);
            return;
        }

        s(i-1,sum+i);



    }

    public static void main(String[] args)
    {
        int sum=0;
        int i=5;
        s(i,sum);
    }
}
