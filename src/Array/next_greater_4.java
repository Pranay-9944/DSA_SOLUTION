package Array;

///// BRUTE FORCE
import java.util.Arrays;
import java.util.Stack;
//
//public class next_greater_4 {
//    public  static  int[] nextg4(int[] a)
//    {
//        int ans[]=new int [a.length];
//        Arrays.fill(ans,-1);
//        for (int i = 0; i < a.length; i++) {
//            int count=0;
//
//            for (int j = i+1; j <a.length; j++) {
//
//                if(a[j]>a[i]){
//                    count++;
//                    if(count==2)
//                    {
//                        ans[i]=a[j];
//                        break;
//                    }
//                }
//
//
//            }
//
//        }
//return  ans;
//    }
//    void main()
//    {
//        int a[]={2,4,0,9,6};
//       int g[]= nextg4(a);
//       for(int H:g)
//       {
//           System.out.println(H);
//       }
//    }
//}

class next_greater_4 {
    public static int[] nextg4(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Current number is the first greater
            while (!s2.isEmpty() && nums[s2.peek()] < nums[i]) {
                ans[s2.pop()] = nums[i];
            }

            // Current number is the first greater
            while (!s1.isEmpty() && nums[s1.peek()] < nums[i]) {
                temp.push(s1.pop());
            }

            // Move them to stack2
            while (!temp.isEmpty()) {
                s2.push(temp.pop());
            }

            // Current index waits for its first greater
            s1.push(i);
        }

        return ans;


    }

    void main() {


        int a[] = {2, 4, 0, 9, 6};
        int g[] = nextg4(a);
        for (int H : g) {
            System.out.println(H);
        }
    }
}
