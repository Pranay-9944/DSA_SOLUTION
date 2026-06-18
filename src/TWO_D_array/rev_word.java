package TWO_D_array;

class rev_word {

    public static String rev(String st)
    {
            st= st.trim();
        String[] words = st.split("\\s+");
        StringBuilder r=new StringBuilder("");
        for (int i = words.length-1; i >=0 ; i--) {

          r=r.append(words[i]);

          if(i!=0)
          {
              r.append(" ");
          }


        }
        return r.toString();
    }
    public static void main(String[] args)
    {
        String st="i am legendary seyian            son goku";
        System.out.println(rev(st));
    }
}
