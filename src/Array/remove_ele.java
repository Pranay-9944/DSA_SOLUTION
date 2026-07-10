package Array;

public class remove_ele {
    public static int rem(int[] a, int tar)
    {

//       int i=0;
//       int k=0;
//       while (i<a.length)
//       {
//           if(a[i]!=tar)
//           {
//               a[k]=a[i];
//               k++;
//           }
//           i++;
//       }
//       return  k;

        int k=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=tar)
            {
                a[k]=a[i];
                k++;
            }


        }
        return  k;
    }

    void main(){
        int[] a={2,3,2,1,2,3};
        int tar=3;
        System.out.println( rem(a,tar));;
    }
}
