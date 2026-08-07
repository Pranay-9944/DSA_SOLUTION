package STACK_PACK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class astroid_colison_brute {
    public  static  void  collison(List<Integer> list ) {

        int x = 0;
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 0; i < list.size()-1; i++) {
                int first = list.get(i);
                int sec = list.get(i + 1);
                if (first > x && sec < x) {
                    if (Math.abs(sec) < Math.abs(first)) {
                        list.remove(i + 1);
                    } else if (Math.abs(first) < Math.abs(sec)) {
                        list.remove(i);

                    } else {
                        list.remove(i);
                        list.remove(i + 1);
                    }
                    changed = true;
                }
            }
        }
        for (int a : list) {
            System.out.println(a);

        }
    }
    void main()
    {        int[] arr = {10, 2, -5};
        List<Integer> list= new ArrayList<>();
        for (int x:arr)
        {
            list.add(x);
        }

        collison(list);
    }
}
