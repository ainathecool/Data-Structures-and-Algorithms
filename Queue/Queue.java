public class Queue <T>
{
    private int front, rear, capacity;
    T[] queue = (T[]) new Object[capacity];

    //constructor
    Queue()
    {
        front = rear = (int) queue[0];
        queue = (T[]) new Object[0];
    }
    Queue(int capacity)
    {
        this.capacity = capacity;
        this.front = 0;
        this.rear = 0;
        queue = (T[]) new Object[capacity];
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getFront() {
        return front;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public int getRear() {
        return rear;
    }

    public Boolean IsEmpty()
    {
        if(front == rear)
            return true;
        else
            return false;
    }

    public Boolean IsFull()
    {
        if(rear == capacity)
            return true;
        else
            return false;
    }

    public void EnQueue(T data)
    {
        //check is q is full
        if(IsFull())
        {
            System.out.println("Q is full.");
            return;
        }
        else
        {
            queue[rear] = data;
            rear++;
        }
        return;
    }

    public void DeQueue()
    {
        //check if front is empty
        if(IsEmpty())
        {
            System.out.println("List is empty.");
            return;
        }
        else
        {
            for(int i=0;i<rear-1;i++)
            {
                queue[i] = queue[i+1]; //moving the front forward, shifting values
            }
            rear--;// rear ko decrement karrahay
        }
    }

    public T Peek()
    {
        //check if q is empty
        if(IsEmpty())
        {
            System.out.println("Empty list. No front available.");
            return null;
        }
        else
            return queue[front];
    }


}
