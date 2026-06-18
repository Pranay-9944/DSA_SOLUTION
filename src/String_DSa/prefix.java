package String_DSa;

public class prefix {
    public static String  prefixof(String strs[])
    {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            if(strs[1].indexOf(prefix)!=0)
            {
                prefix =prefix.substring(0,strs.length-1);
            }

        }
        return prefix;

    }

    public static void main(String[] args)
    {
        String[] strs = {"flower", "flow", "flight"};
      prefixof(strs);
    }
}
