package Divide_conqure;

import java.util.ArrayList;
import java.util.List;

public class Inversion {
    public static void inversion(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);

                    list.add(temp);
                }

            }

        }
        System.out.println(list);


    }

    void main() {
        int[] arr = {4, 3, 2, 1, 7};
        int target = 7;

        inversion(arr);

    }
}