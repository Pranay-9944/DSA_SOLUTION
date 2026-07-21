package STACK_PACK;

public class StackLinkedlist {

    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }

    }
    static Node head;

    static class stack
    {

        public boolean isempty()

        {
            return head==null;
        }
        public void push(int data)
        {
            Node newnode = new Node(data);
            if(isempty())
            {
           head=newnode;
           return;
              }
            newnode.next=head;
            head=newnode;
        }
        public int pop()
        {
            if(isempty())
            {
                return -1;
            }
            int top=head.data;
            head=head.next;

      return top;
        }

        public int peek()
        {
            if(isempty())
            {
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String args[])
    {
        stack s=new stack();
        s.push(10);
        s.push(30);
        System.out.println(s.peek());;
    }

}
