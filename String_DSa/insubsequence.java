package String_DSa;

public class insubsequence {
    public  static boolean find(String s, String t)
    {
//        int left=0;
//        int right=0;
//        StringBuilder ans=new StringBuilder("");
//        while(left< s.length() && right<t.length())
//        {
//            if(s.charAt(left)==t.charAt(right)){
//
//                ans.append(t.charAt(right));
//               left++;
//            }
//            else{
//
//                right++;
//
//            }
//
//        }
//        if(ans.toString().equals(s))
//        {
//            return true;
//
//        }
//        else{
//            return false;
//        }

        // ANOTHER APPROCH

        int left=0;
        int right=0;
           while(left< s.length() && right<t.length())
           {
               if(s.charAt(left)==t.charAt(right))
               {
                   left++;

               }
               else {
                   right++;
               }

           }
           return left==s.length();




    }
    public static void main (String[] args)
    {
        String s="abc";
        String t="anhbhfbc";

        System.out.println(find(s,t));;
    }
}
