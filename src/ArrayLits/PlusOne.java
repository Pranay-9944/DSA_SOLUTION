package ArrayLits;

import java.util.Arrays;

public class PlusOne
{
    public static int[] plus(int digits[])
{

//   int ele=a.length-1;
//   a[ele]=ele+1;
//    for (int n:a)
//    {
//        System.out.println(n);
//    }
    for (int i = digits.length - 1; i >= 0; i--) {

        // If the digit is less than 9, just add 1 and return
        if (digits[i] < 9) {
            digits[i]++;
            return digits;
        }

        // If the digit is 9, make it 0 and continue
        digits[i] = 0;
    }

    // If all digits were 9, create a new array
    int[] ans = new int[digits.length + 1];
    ans[0] = 1;

    return ans;

}
void main()
{
    int a[]={1,2,3};
   int[] ans= plus(a);
    System.out.println(Arrays.toString(ans));

}


}