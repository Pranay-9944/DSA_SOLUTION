package RECURSION;

public class sum_rec_fun {
    public  static int s( int n)

    {
        if(n==0)
        {

            return 0;
        }

       return n+s(n-1);



    }

    public static void main(String[] args)
    {
        int i=5;
       System.out.println(s(i));
    }
}
