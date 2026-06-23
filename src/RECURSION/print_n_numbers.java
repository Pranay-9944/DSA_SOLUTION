package RECURSION;

import java.util.Scanner;

public class print_n_numbers {
    public static  void p(int i,int n )
    {
        if(i==n)
        {
            return;
        }
        System.out.println("pranay");
        p(i+1,n);
    }
    public static  void main(String[] args)
    {
        int i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n ");
        int n=sc.nextInt();
        p(i,n);
    }
}
