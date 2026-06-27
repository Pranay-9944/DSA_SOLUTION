package RECURSION;


import java.util.ArrayList;
import java.util.List;

public class Palindrome_partision {

public static List<List<String>> parti_palin(String s)
{
    List<String> list=new ArrayList<>();
        List<List<String>> ans=new ArrayList<>();
    helper_palin(0,s,list,ans);
    return  ans;
}

public static void helper_palin(int index, String s, List<String> list ,List<List<String>> ans)
{


    if(index==s.length())
    {
       ans.add(new ArrayList<>(list));
    return;
    }




    for (int i = index; i <s.length() ; i++)

    {
        if (ispalndrome(s,index,i))
        {
            list.add(s.substring(index,i+1));
            helper_palin(i+1,s,list,ans);
            list.remove(list.size()-1);

        }

    }


}

public static boolean ispalndrome(String s,int start,int end)
{
    while(start< end)
    {
        if(s.charAt(start)!=s.charAt(end))
        {
            return  false;
        }
        start++;
        end--;
    }
    return  true;
}





    void main()
    {
        String s="aab";
        System.out.println(parti_palin(s));

    }
}
