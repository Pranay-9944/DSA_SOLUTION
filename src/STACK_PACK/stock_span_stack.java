package STACK_PACK;

import java.util.Stack;

import static RECURSION.sum_rec_fun.s;

public class stock_span_stack {
    void main()
    {
        int[] arr={100, 80, 60, 70, 60, 75, 85};
        Stack<Integer> s= new Stack<>();
        int[] span = new int[arr.length];
        span[0] = 1;
        s.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - s.peek();
            }

            // Push current index
            s.push(i);
        }

        // Print spans
        for (int x : span) {
            System.out.print(x + " ");
        }
        }
}
