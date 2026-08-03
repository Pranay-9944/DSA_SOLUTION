package Array;

public class next_greater_3 {

    public  static  int ng3 (int n)
    {
        char[] digit=String.valueOf(n).toCharArray();
        int small=-1;
        int big=-1;
        for (int i = digit.length-1; i >0 ; i--) {


            if(digit[i-1]<digit[i])
            {
                small=i-1;
                break;
            }

        }
        if (small == -1) {
            return small;
        }
        for (int i = digit.length-1; i >0 ; i--) {
            if(digit[i]>digit[small])
            {
                big=i;
                break;
            }


        }
        if(big>small) {
            char temp = digit[small];
            digit[small] = digit[big];
            digit[big] = temp;

        }
        else {
            System.out.println("-1");
        }

int left=small+1;
        int right= digit.length-1;
        while (left<right)
        {
            char temp=digit[left];
            digit[left]=digit[right];
            digit[right]=temp;
            left++;
            right--;
        }


        String s = new String(digit);
        long ans = Long.parseLong(s);
        if (ans > Integer.MAX_VALUE) {
            return -1;
        }

        return (int) ans;
    }
    void main()
    {
        int n=21;
        System.out.println(        ng3(n));
    }
}
