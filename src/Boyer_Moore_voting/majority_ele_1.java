package Boyer_Moore_voting;

import com.sun.jdi.event.StepEvent;

public class majority_ele_1 {
    public static void main (String[] args)
    {
        int a[]={1,2,2,3,2,2,2,2,3,2,1,1,1,1,2,2,2,2,2,2,2,2,2,2};

     int count=0;
     int ele=0;
        for (int i = 0; i < a.length; i++) {

            if(count==0)
            {
                count++;
                ele=a[i];
            }
            else if (a[i]==ele) {
                count++;

            }
            else {
                count--;
            }

        }


        for (int i = 0; i < a.length; i++) {
          if(a[ele]== a[i]){
              count++;
          }



        }
        if(count>a.length/2)
        {
            System.out.println(ele);
        }
        else {
            System.out.println("0");
        }
    }

}
