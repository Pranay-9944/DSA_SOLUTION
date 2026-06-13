package String_DSa;

public class easyrev {
    public static String rev(String st)
    {
        StringBuilder ans= new StringBuilder("");

       String[] word=st.split(" ");

        for (int i = 0; i < word.length; i++)
        {
            StringBuilder temp= new StringBuilder(word[i]);
            ans.append(temp.reverse());

            if(i != word.length - 1) {
                ans.append(" ");
            }

        }



        return ans.toString();
    }
    public static void main(String[] args)
    {
        String st="i am legendary seyian son goku";
        System.out.println(rev(st));
    }
}
