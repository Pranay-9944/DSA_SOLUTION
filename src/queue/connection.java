package queue;

import java.util.PriorityQueue;

public class connection {

    public static  void connection(PriorityQueue<Integer> pq)
    {
        int tot=0;

        while(pq.size()>1)
        {
            int a=pq.poll();
            int b=pq.poll();
            int c=a+b;
            tot = tot+ c;
            pq.add(c);
        }
        System.out.println(tot);



    }
    void main()
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(4);
        pq.add(3);
        pq.add(2);
        pq.add(6);

        connection(pq);
    }
}
