package RECURSION;

public class fabonacii {

    public static int fab(int n )
    {
        if(n<=1)
        {
            return n;
        }
           int firts=fab(n-1);
        int last=fab(n-2);
        return firts+last;
    }


    public static void main(String[] args){
        System.out.println(fab(5));;
    }
}
