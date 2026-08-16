package queue;

public class queue_array {
public  class   Queue
{
    static int arr[];
    static int size;
    static  int rear;

    Queue(int n)
    {
        arr=new int[n];
        size=n;
        rear=-1;

    }

    public static  boolean isempty()
    {
        return  rear==-1;
    }

    public static  void add(int data)
    {
        if(rear==size-1)
        {
            System.out.println("is full");
            return ;

        }
        rear++;
        arr[rear]=data;
    }

    public  static  int dequeue()
    {
        if(isempty())
        {
            return  -1;
        }
        int front=arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i]=arr[i+1];

        }
        rear = rear -1;
        return  front;

    }
    public  static  int peek()
    {
        if(isempty())
        {
            return -1;
        }
        return arr[0];
    }



}

    void main()
    {
        Queue q =  new Queue(5);
        q.add(10);
        q.add(20);
        while(!q.isempty())
        {
            System.out.println(q.peek());
            q.dequeue();


        }


    }
}
