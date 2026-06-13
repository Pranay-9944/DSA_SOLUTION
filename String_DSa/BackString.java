package String_DSa;

import com.sun.jdi.event.StepEvent;

public class BackString {
    public  static  boolean back(String s, String t)
    {
       int skip=0;
       int skip1=0;

        StringBuilder ans= new StringBuilder("");
        StringBuilder ans1= new StringBuilder("");


        for (int i = s.length()-1; i >=0 ; i--) {

            if(s.charAt(i) == '#')
            {
                skip++;

            } else if (skip>0) {
                skip--;

            }
            else
            {

                ans.append(s.charAt(i));
            }



        }

        for (int i = t.length()-1; i >=0 ; i--) {

            if(t.charAt(i) == '#')
            {
                skip1++;

            } else if (skip1>0) {
                skip1--;

            }
            else
            {

                ans1.append(t.charAt(i));
            }



        }
        return ans.toString().equals(ans1.toString());


    }
    public static void  main(String[] args)
    {
        String s="ab#c";
        String t="ab#c";
        System.out.println(back(s,t));;
    }
}
