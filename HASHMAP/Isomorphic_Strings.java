package HASHMAP;

import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Isomorphic_Strings {
    public static boolean iso(String s, String t)
    {
        if(s.length()!=t.length()) {

            return false;
        }

            HashMap<Character, Character> smap=new HashMap<>();
            HashMap<Character, Character> tmap=new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c1=s.charAt(i);
            char c2=t.charAt(i);

            if(smap.containsKey(c1))

            {
                if(smap.get(c1)!=c2)
                {
                    return false;
                }
            }
            else {
                smap.put(c1,c2);
            }

            if(tmap.containsKey(c2))

            {
                if(tmap.get(c2)!=c1)
                {
                    return false;
                }
            }
            else {
                tmap.put(c2,c1);
            }
        }



        return true;
    }

    public static void main(String[] args)
    {
        String s="abc";
        String t="drf";
        System.out.println(iso(s,t));;
    }
}
