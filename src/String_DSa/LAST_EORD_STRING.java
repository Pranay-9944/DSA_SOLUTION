package String_DSa;

public class LAST_EORD_STRING {
    void main()
    {

        String s = "   fly me   to   the moon  ";
        String[] words = s.trim().split(" ");

            System.out.println(words[words.length-1].length());
        }

    }
