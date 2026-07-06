package ArrayLits;

import java.util.ArrayList;
import java.util.List;

public class paire_sum_list {
    public static boolean  findarr(ArrayList<Integer> list , int target)
    {
        int total=0;
        for (int i = 0; i < list.size(); i++) {

            for (int j = i+1; j < list.size() ; j++) {

                if(list.get(i)+list.get(j)==target)
                {
                    return true;
                }
            }

        }
        return false;
    }
    void main()
    {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        int target=80;
        System.out.println(        findarr(list,target));    }
}
