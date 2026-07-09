package String_DSa;

public class Shfit_vowel {
    public static String shift(String str)
    {
        char ch[] = str.toCharArray();
        String vowel="AEIOUaeiou";
       int i=0;
       int j=str.length()-1;
       while(i<j)
       {


         while(i<j && vowel.indexOf(ch[i])==-1)

         {i++;

           }
         while(i<j && vowel.indexOf(ch[j])==-1)
         {
             j--;

         }
            char temp=ch[i];
         ch[i]=ch[j];
         ch[j]=temp;
         i++;
         j--;
       }
       return new String(ch);
    }


    void main()
    {
        String a="hello";
        System.out.println(shift(a));
    }
}
