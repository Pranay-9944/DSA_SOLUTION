package HASHSET;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.HashSet;

public class Happynumber {
    public static boolean hn(int n)
    {
        HashSet<Integer> set = new HashSet<>();

        while (n != 1) {

            if (set.contains(n)) {
                return false;
            }

            set.add(n);

            int sum = 0;

            while (n > 0) {

                int digit = n % 10;

                sum += digit * digit;

                n = n / 10;
            }

            n = sum;
        }

        return true;
    }
    public static void main(String[] args)
    {
        int n=19;
        hn(n);
    }
}
