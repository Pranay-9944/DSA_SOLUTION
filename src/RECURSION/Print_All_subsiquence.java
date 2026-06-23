package RECURSION;

import java.util.ArrayList;
import java.util.List;

public class Print_All_subsiquence {
    public static void printsub(int indx,int arr[],ArrayList<Integer>list)

    {
        if(indx== arr.length)
        {
            System.out.println(list);
            return;
        }

        //take
        list.add(arr[indx]);

        printsub(indx+1,arr,list);

        //backtrack
        list.remove(list.size()-1);

        // dont take
        printsub(indx+1,arr,list);



    }
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int arr[]={3,2,1};
        printsub(0,arr,list);
    }
}
