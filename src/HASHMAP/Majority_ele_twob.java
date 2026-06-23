package HASHMAP;

public class Majority_ele_twob {
    public static void main(String[] args)
    {
        int a[]={1,2,2,3,2,2,2,2,3,2,1,1,1,1};
        int n=a.length;

        for (int i = 0; i < a.length; i++) {
     int count=0;

            for (int j = 0; j <a.length ; j++) {
                if (a[j] == a[i]) {
                    count++;

                }




            }
            if(count > n/2) {
                System.out.println(a[i]);
                break;
            }
        }

    }
}
