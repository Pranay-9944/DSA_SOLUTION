package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queue_reverese {
    public static  void rev(Queue<Integer> q)
    {
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty())
        {
            s.push(q.remove());
        }

        while(!s.isEmpty())
        {
            q.add(s.pop());
        }

int n =q.size();
        for (int i = 0; i < n; i++) {
            System.out.println(q.peek());
            q.remove();
        }
    }
    void main()

    {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            q.add(i);

        }

   rev(q);
    }
}
