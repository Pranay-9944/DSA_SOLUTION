package Linked_list;

public class LinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }

    }

   static Node head=null;

    public void adFirst(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    public void Addlast(int data) {
        Node NewNode = new Node(data);
        if (head == null) {
            head = NewNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = NewNode;

    }

    public void display() {
        if (head == null) {
            System.out.println("list is empty ");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.print("null");
    }

    public void addmiddel(int data, int inx) {
        Node newnode = new Node(data);
        if(inx==0)
            {
                newnode.next=head;
                head=newnode;
                return;
        }
        Node cur = head;
        int i = 0;
        while (i < inx - 1) {
            cur = cur.next;
            i++;

        }
        newnode.next = cur.next;
        cur.next = newnode;
    }

    public void delfirst() {
        if (head == null) {
            System.out.println("list empty");
            return;
        }
        head = head.next;


    }

    public void dellast() {
        Node cur = head;
        Node seclast = head.next;
        if (head == null) {
            System.out.println("list empty");
            return;
        }
        while(cur.next.next!=null)
        {
           cur= cur.next;
        }
        cur.next=null;
    }
    public void delmid(int data ,int idx)
    {
        if(head==null)
        {
            return;
        }

        if(idx==0)
        {
            head=head.next;
            return;
        }

        Node temp=head;
        for (int i = 0; i < idx-1; i++) {

        temp=    temp.next;
        }

        temp.next=temp.next.next;
    }

    public void rev() {
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        head = prev;
    }

    public void delnthnode11(int n) {
      Node temp=head;
        for (int i = 0; i < n-1; i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;

    }

    public Node ftm(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkpalin() {
        if (head == null || head.next == null) {
            return true;
        }
        Node mid = ftm(head);
        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;


        }
        Node right = prev;
        Node left = head;


        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;

        }
        return true;
    }

    public void zigzag(Node head) {
        if (head == null || head.next == null) {
            return;
        }

        Node mid = ftm(head);
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        Node right = prev;
        Node left = head;
        Node nextl;
        Node nextr;

        while (left != null && right != null) {
            nextl = left.next;
            left.next = right;
            nextr = right.next;
            right.next = nextl;

            right = nextr;
            left = nextl;

        }


    }




    public static void main(String[] args)
    {
    LinkedList l=new LinkedList();
    l.adFirst(10);
        l.adFirst(20);
        l.adFirst(10);
        l.adFirst(40);
        l.display();
    }
}
