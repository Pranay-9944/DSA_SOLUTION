package RECURSION;

public class opposite {
    public static void o(int i,int n)
    {
        if(i==n)
        {
            return;
        }
        System.out.println(n);
        o(i,n-1);
    }
    public static  void main(String[] args)
    {
        int n=10;
        int i=0;
        o(i,n);
    }
}
