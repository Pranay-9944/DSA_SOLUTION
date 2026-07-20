package RECURSION;

public class binaryserach {

    public static int bs(int[] a,int i,int j,int t)
    {
        if(i>j)
        {
            return  -1;
        }

         int mid=(i+j)/2;
         if(a[mid]==t)
         {
             return mid;
         }

         else if(t<a[mid]) {
            return bs(a, i, mid - 1, t);
         }
         else {
             return bs(a,mid+1,j,t);
     }

    }
    void main()
    {
        int a[]={1,2,3,4,5,6,8};
        int t=5;
        int ans=bs(a,0,a.length,t);
        System.out.println(ans);
    }
}
