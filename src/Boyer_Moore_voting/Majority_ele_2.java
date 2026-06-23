package Boyer_Moore_voting;

import java.util.ArrayList;
import java.util.List;

public class Majority_ele_2 {
    public static void main(String[] args)
    {
        int a[]={2,2,2,2,1,1,1,1};
        int c1=0 ,ele1=0;
        int c2=0,ele2=0;
  int n=a.length;
        for (int i = 0; i <n ; i++) {
            if(c1==0 && ele2!=a[i])
            {
                c1++;
                ele1=a[i];
            } else if (c2==0 && ele1!=a[i]) {

                c2++;
                ele2=a[i];


            } else if (ele1==a[i]) {
                c1++;


            } else if (ele2==a[i]) {
                c2++;

            }
            else{
                c1--;
                c2--;
            }

        }
        c1=0;
        c2=0;

        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {


            if(ele1==a[i])
                c1++;
            if (ele2==a[i])
                c2++;
        }
        if(c1> n/3)
        {
         list.add(ele1);
        }
        if(c2> n/3    )
        {
            list.add(ele2);
        }
        System.out.println(list);
    }
}
