package RECURSION;

public class Incorder {
    public static void inc(int m)
    {
        if(m==1)
        {
            System.out.println(m);
            return;
        }
        inc(m-1);
        System.out.println(m);
    }
//    public static void inc(int n)
//    {
//        if(n==10){
//            System.out.println(n);
//            return;
//
//        }
//        System.out.println(n);
//        inc(n+1);
//    }
//    public static  void main(String[] args)
//    {
//        int n=1;
//        inc(n);
//    }
//}
    public static void main(String[] args)
    {
        int n=10;
        inc(n);
    }
}