package queue;

import java.util.Stack;

public class implemnt_queu_stack {
    public class queue
    {
        static  Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isempty()
        {
            return  s1.isEmpty();
        }
   public  static void  add(int data)
   {
       while (!s1.isEmpty())
       {
           s2.push(s1.pop());
       }
       s1.push(data);

       while(!s2.isEmpty())
       {
           s1.push(s2.pop());
       }
   }
        public static int remove()
        {
            if (s1.isEmpty())
            {
                return -1;
            }

            return s1.pop();
        }
        public static int  peek()

        {
            if (s1.isEmpty())
            {
                return -1;
            }
            return s1.peek();
        }
    }
    void main()
    {
queue q= new queue();
q.add(10);
q.add(20);
q.add(30);
q.add(40);

while(!q.isempty())
{
    System.out.println(q.peek());
    q.remove();
}



    }
}
