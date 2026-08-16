package queue;

public class circular_queu {
    public static class Circular {
        static int arr[];
        static int front;
        static int size;
        static int rear;

        Circular(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;

        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;

        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                return -1;
            }
            int res = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return res;


        }

        public static int peek() {
            if (isEmpty()) {
                return -1;

            }
            return arr[front];

        }
    }

    public static  void main(String[] args)
    {
        Circular c=new Circular(10);
        c.add(10);
        c.add(20);
        c.add(20);
        c.add(20);
        c.add(20);


        while (!c.isEmpty())
        {
            System.out.println(c.peek());
            c.remove();
        }

    }
    }
