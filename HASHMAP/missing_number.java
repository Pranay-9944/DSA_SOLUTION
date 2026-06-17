package HASHMAP;

import kotlin.collections.UCollectionsKt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class missing_number {
    public static int find(int[] n)
    {
        HashSet<Integer> set = new HashSet<>();

        for(int num : n) {
            set.add(num);
        }

        for(int i = 0; i <= n.length; i++) {
            if(!set.contains(i)) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String [] args)
    {
        int[] n={1,2,4};
        System.out.println(find(n));;
    }
}
