package HASHMAP;

import java.util.HashMap;


public class FIRSTstNonrepeating {
    public static  int  non(String a)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        for (char n: a.toCharArray())
        {
            map.put(n, map.getOrDefault(n,0)+1);
        }


        for (int i = 0; i < a.length(); i++) {



                  if(map.get(a.charAt(i))==1)
                  {
                       return  i;
                  }



        }
        return 0;
    }
    public static void main(String[] args)
    {
        String a="leetcodelove";
        System.out.println(non(a));;
    }
}
