package queue;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

public class interleave {


    public  static  void interleave_queue()
    {
        int n=10;
        Queue<Integer> q= new LinkedList<>();
        Queue<Integer> q2=new LinkedList<>();

        for (int i = 1; i <=10; i++) {
             q.add(i);
        }




        for (int i = 0; i < n/2; i++) {
            q2.add(q.remove());

        }

        while(!q2.isEmpty())
        {
            q.add(q2.remove());
            q.add(q.remove());
        }

        for (int i = 0; i <n; i++) {

            System.out.println(q.peek());
            q.remove();
        }
    }

    void main()
    {
     interleave_queue();
    }
}
