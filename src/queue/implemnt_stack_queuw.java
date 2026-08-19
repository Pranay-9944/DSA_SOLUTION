package queue;

import java.util.LinkedList;
import java.util.Queue;

public class implemnt_stack_queuw {

  static   Queue<Integer> q = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    static class Stack{


        public static  void push(int data)
        {
            q.add(data);

            int n=q.size();
            for (int i = 0; i < n-1; i++) {
                q.add(q.remove());
            }
        }
        public static int pop() {
            if (q.isEmpty()) {
                return -1;
            }
            return q.remove();
        }

        public static int peek() {
            if (q.isEmpty()) {
                return -1;
            }
            return q.peek();
        }
        public static  int size()
        {

            return q.size();

        }
    }

    void main()

    {
Stack s= new Stack();
s.push(10);
        s.push(20);


int n=s.size();
        for (int i = 0; i < n; i++) {
            System.out.println(s.peek());
            s.pop();

        }

    }


}
