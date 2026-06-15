package TWO_D_array;

public class arrcompreseion {


        public int compress(char[] chars) {

            int write = 0;
            int i = 0;

            while (i < chars.length) {

                char current = chars[i];
                int count = 0;

                while (i < chars.length && chars[i] == current) {
                    count++;
                    i++;
                }

                chars[write++] = current;

                if (count > 1) {
                    String cnt = String.valueOf(count);

                    for (int j = 0; j < cnt.length(); j++) {
                        chars[write++] = cnt.charAt(j);
                    }
                }
            }

            return write;
        }

    public  static  void main (String arg[])
    {
        char[] arr = {'a','a','a','a','b','b','c','c'};


    }
}
