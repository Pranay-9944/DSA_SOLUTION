package Linked_list;

public class DLL
{
class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data)
    {
        this.data=data;
        next=null;
        prev=null;

    }
}

public Node head=null;

public void addfirt(int data)
{
    Node newnode=new Node(data);
        newnode.next=head;
        if(head!=null)
        {
            head.prev=newnode;
        }
        head=newnode;

}

public void addlast(int data)
{
    Node newnode=new Node(data);
    if (head == null) {
        head = newnode;
        return;
    }
    Node temp=head;
    while(temp.next!=null )
    {
        temp=temp.next;

    }
    temp.next=newnode;
    newnode.prev=temp;
}

public void addmiddel(int data,int indx)
{
    Node newnode=new Node( data);
    if(head==null)
    {
        head=newnode;
        return;
    }
    int i=0;
    Node temp=head;
    while (i<indx-1)
    {
        temp=temp.next;
        i++;
    }
    newnode.next=temp.next;
    newnode.prev=temp;
    if(temp.next!=null)
    {
        temp.next.prev=newnode;
    }
    temp.next=newnode;

}

public void delfirst()
{
    if(head==null)
        return;
    if(head.next==null)
    {
        head=null;
        return ;
    }

    head=head.next;
    head.prev=null;

}
public void dellast()
{
    if (head == null) {
        return;
    }

    if (head.next == null) {
        head = null;
        return;
    }
    Node temp=head;
    while(temp.next.next!=null)
    {
        temp=temp.next;
    }
    temp.next=null;

}

public void delmid(int indx)
{
    if (head == null) {
        return;
    }

    if (head.next == null) {
        head = null;
        return;
    }

    Node temp=head;
    int i =0;
    while (i<indx-1)
    {
        temp=temp.next;
        i++;

    }
Node delnode=temp.next;
    temp.next=delnode.next;
    if(delnode.next!=null)
    {
        delnode.next.prev=temp;
    }



}


public int size()
{
    int size=0;

    Node temp=head;
    while (temp!=null)
    {
        size++;
        temp=temp.next;
    }
    return size;

}

public void display()
{
    Node temp=head;
    while(temp!=null)
    {
        System.out.println(temp.data+ " ");
        temp=temp.next;

    }
}

public void revrese()
{

    if(head==null || head.next==null)
    {
        return;

    }
    Node temp=head;
    Node prev=null;

    while (temp!=null)
    {
        Node next=temp.next;
        temp.next=prev;
        prev=temp;
        temp.prev=next;

        temp=next;

    }
    head=prev;

}

    public Node removeElements(Node head, int val) {
        Node temp = head;

        if(temp)
        while (temp != null) {
            if (temp.data == val) {

                temp.prev.next=temp.next;
                temp.next.prev=temp.prev;


            }
            temp=temp.next;

        }
return ;
    }
    }

public static void main(String[] args)
{
DLL l= new DLL();
l.addfirt(10);
l.addlast(20);
l.addlast(30);
l.addlast(40);
l.display();
l.revrese();
l.display();

}
}
