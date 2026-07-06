package Array;

import java.util.ArrayList;

public class Monotonic {
    public static void mono(ArrayList<Integer> arr) {
        boolean flag1 = false;
        boolean flag2 = false;

        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                flag1 = true;
            }

            if (arr.get(i) < arr.get(i + 1)) {
                flag2 = true;
            }

        }
        if (flag1 || flag2) {
            System.out.println("mono");
        } else {
            System.out.println("not mono");
        }
    }
    void main()
    {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        mono(arr);
    }
}
