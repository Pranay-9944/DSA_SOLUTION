package queue;

import java.util.LinkedList;
import java.util.Queue;

public class binary_quque {
    public  static  void  binary(int n )
    {
        Queue<String> q = new LinkedList<>();
        q.add(String.valueOf(1));

        Queue<String> ans = new LinkedList<>();

        for (int i = 1; i <=n ; i++) {
            String s = q.peek();    // look at front
            q.remove();             // remove that same front element
            System.out.println(s);
              String s1=s+"0";git
              q.add(s1);
            String s2=s+"1";
            q.add(s2);


        }
int size=q.size();
        for (int i = 0; i < size; i++) {
            System.out.println(q.peek());
            q.remove();

        }
    }
    void main()
    {
        
        int n=5;
        binary(n);
    }
}
