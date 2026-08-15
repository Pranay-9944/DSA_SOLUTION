package STACK_PACK;

public class find_celebrity {

    public static  void find(int a[][])
    {
        int n=a.length;

        for (int i = 0; i < n; i++) {
            boolean kn=true;
            boolean kbe=true;
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1) {
                    kn = false;

                }


                if (a[j][i] == 0 && i != j) {
                    kbe = false;

                }
            }
            if (kn && kbe) {
                System.out.println("Celebrity is: " + i);
                return;
            }
        }
        System.out.println("No celebrity");

    }
    void main()
    {
        int a[][]={{0,0,0},
                {1,1,0},
                {1,0,0}};

        find(a);
    }
}
