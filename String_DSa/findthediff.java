package String_DSa;



public class findthediff {

    public static char comp(String a, String b)
    {
      int sum=0;
      for(char a1 : b.toCharArray())
      {
          sum+=a1;
      }
      for(int a2:a.toCharArray())
      {
          sum-=a2;
      }
      return (char) sum;


    }
    public static void main (String[] args)
    {

        String a="abcd";
        String b="abcde";

        System.out.println(comp(a,b));
      }
}
