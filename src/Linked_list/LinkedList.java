//package Linked_list;
//
//public class LinkedList<I extends Number> {
//
//        class Node {
//            int data;
//            Node next;
//
//            public Node(int data) {
//                this.data = data;
//                this.next = null;
//
//            }
//
//        }
//    Node head;
//  public void  adFirst(int data)
//  {
//        Node newNode= new Node(data);
//        if(head==null)
//        {
//            head=newNode;
//            return;
//        }
//        newNode.next=head;
//        head=newNode;
//  }
//
//  public  void Addlast(int data)
//  {
//      Node NewNode=new Node(data);
//      if(head==null)
//      {
//          head=NewNode;
//          return;
//      }
//      Node cur=head;
//          while (cur.next!=null)
//          {
//              cur.next=cur.next;
//          }
//          cur.next=NewNode;
//          NewNode.next=null;
//
//  }
//  public void display()
//  {
//      if(head==null)
//      {
//          System.out.println("list is empty ");
//          return;
//      }
//      Node curr=head;
//      while (curr!=null)
//      {
//          System.out.print(curr.data+"->");
//            curr=curr.next;
//      }
//      System.out.print("null");
//  }
//
//  public void addmiddel(int data,int inx)
//  {
//      Node newnode=new Node(data);
//      if(head==null)
//      {
//          head=newnode;
//          return;
//      }
//      Node cur=head;
//      int i=0;
//      while (i<inx-1)
//      {
//          cur=cur.next;
//          i++;
//
//      }
//      newnode.next=cur.next;
//      cur.next=newnode;
//  }
//  public void delfirst()
//  {
//      if(head==null)
//      {
//          System.out.println("list empty");
//          return;
//      }
//      head=head.next;
//
//
//  }
//  public void dellast()
//  {
//      Node cur=head;
//      Node seclast=head.next;
//      if(head==null)
//      {
//          System.out.println("list empty");
//          return;
//      }
//    while(cur.next!=null)
//    {
//        cur=cur.next;
//        seclast=seclast.next;
//
//    }
//      seclast.next=null;
//   }
//
//   public void rev()
//   {
//       Node temp=head;
//       Node prev=null;
//       while(temp!=null)
//       {
//            Node front=temp.next;
//            temp.next=prev;
//            prev=temp;
//            temp=front;
//       }
//
//       head = prev;
//   }
//public void delnthnode(int n )
//{
//    int size=0;
//    Node temp=head;
//    while(temp!=null)
//    {
//        temp=temp.next;
//        size++;
//
//    }
//    if(n==size)
//    {
//        head=head.next;
//        return;
//    }
//    int i=0;
//    int itofind=size-n;
//    Node prev=head;
//    while(i<itofind)
//    {
//        prev=prev.next;
//        i++;
//    }
//    prev.next=prev.next.next;
//    return;
//}
//public Node ftm(Node head)
//{
//    Node slow=head;
//    Node fast=head;
//    while(fast!=null && fast.next!=null)
//    {
//      slow=slow.next;
//      fast=fast.next.next;
//    }
//    return slow;
//}
//public boolean checkpalin()
//{
//    if(head==null || head.next==null)
//    {
//        return true;
//    }
//    Node mid=ftm(head);
//Node prev=null;
//Node curr=mid;
//Node next;
//while(curr!=null)
//{
//    next=curr.next;
//    curr.next=prev;
//    prev=curr;
//        curr=next;
//
//
//
//}
//Node right=prev;
//Node left=head;
//
//
//while(right!=null)
//{
//    if(left.data != right.data)
//    {
//        return false;
//    }
//    left=left.next;
//    right=right.next;
//
//}
//return true;
//}
//
//
//    public static void main(String[] args)
//    {
//    LinkedList<Number> l=new LinkedList<Number>();
//    l.adFirst(10);
//        l.adFirst(20);
//        l.adFirst(10);
//        System.out.println( l.checkpalin());;
//    }
//}
