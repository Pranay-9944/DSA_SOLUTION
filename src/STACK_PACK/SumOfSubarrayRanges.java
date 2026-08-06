package STACK_PACK;

import java.util.Stack;

import java.util.Stack;

public class SumOfSubarrayRanges {

    // Previous Greater Index
    public static int[] previousGreater(int[] a) {
        int n = a.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && a[st.peek()] <= a[i]) {
                st.pop();
            }

            if (st.isEmpty())
                ans[i] = -1;
            else
                ans[i] = st.peek();

            st.push(i);
        }

        return ans;
    }

    // Next Greater Index
    public static int[] nextGreater(int[] a) {
        int n = a.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && a[st.peek()] < a[i]) {
                st.pop();
            }

            if (st.isEmpty())
                ans[i] = n;
            else
                ans[i] = st.peek();

            st.push(i);
        }

        return ans;
    }

    // Previous Smaller Index
    public static int[] previousSmaller(int[] a) {
        int n = a.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && a[st.peek()] > a[i]) {
                st.pop();
            }

            if (st.isEmpty())
                ans[i] = -1;
            else
                ans[i] = st.peek();

            st.push(i);
        }

        return ans;
    }

    // Next Smaller Index
    public static int[] nextSmaller(int[] a) {
        int n = a.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && a[st.peek()] >= a[i]) {
                st.pop();
            }

            if (st.isEmpty())
                ans[i] = n;
            else
                ans[i] = st.peek();

            st.push(i);
        }

        return ans;
    }

    // Main Logic
    public static long range(int[] a) {

        int[] pg = previousGreater(a);
        int[] ng = nextGreater(a);

        int[] ps = previousSmaller(a);
        int[] ns = nextSmaller(a);

        long ans = 0;

        for (int i = 0; i < a.length; i++) {

            long leftMax = i - pg[i];
            long rightMax = ng[i] - i;

            long leftMin = i - ps[i];
            long rightMin = ns[i] - i;

            long maxContribution = (long) a[i] * leftMax * rightMax;
            long minContribution = (long) a[i] * leftMin * rightMin;

            ans += maxContribution - minContribution;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] a = {2, 1, 4, 3};

        System.out.println(range(a));
    }
}
