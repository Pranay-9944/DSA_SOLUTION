package queue;

public class queue_linkedList {
 static  class Node
 {
     int data;
     Node next;
     Node(int data)
     {
         this.data=data;
         this.next=null;
     }
 }
    public class qlist
    {
        static Node head=null;
        static Node tail=null;

       public static boolean isEmpty()
       {
           return (head == null && tail == null);
       }

       public static void add(int data)
       {
           Node newnode =new Node(data);
           if(head==null)
           {
               head=tail=newnode;
               return;

           }
          tail.next=newnode;
           tail=newnode;
       }
       public static int remove()
       {
           if(isEmpty())
           {
               return -1;

           }
           int front= head.data;
           if(  tail==head)
           {
               tail=head=null;
           }
           else {
               head=head.next;
           }
return front;
       }
       public static int peek()
       {
           if(isEmpty())
           {
               return -1;

           }
           return  head.data;

       }
    }

    void main()

    {
        qlist q=new qlist();
        q.add(10);
        while (!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();

        }

    }
}
