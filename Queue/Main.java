import java.util.*;

public class Main
{
    public static void main(String[] args)
{
    Queue <Task> taskQueue = new Queue<Task>(4); //q array initialised w 4 spaces

    //task class objects
    Task t1,t2,t3,t4;
    t1 = new Task(1,40);
    t2 = new Task(2,30);
    t3 = new Task(3,80);
    t4 = new Task(4,100);


    /*{
        t1.setId(1);
        t1.setExT(40);

        t2.setId(2);
        t2.setExT(30);

        t3.setId(3);
        t3.setExT(80);

        t4.setId(4);
        t4.setExT(100); //all ids and ex times have been assigned
    }*/
    {
        //all task objects sent into the q array with their data as id and ex time

        taskQueue.EnQueue(t1);
        taskQueue.EnQueue(t2);
        taskQueue.EnQueue(t3);
        taskQueue.EnQueue(t4);
    }
    {
        RoundRobin(taskQueue,40);
    }
}

public static void RoundRobin(Queue<Task> taskQueue, int timeSlot)
{

    Task t;
    int rem;

    while(!taskQueue.IsEmpty()) //takay yeh loop bhe decrease hojaye jesay jesay list kam hogi

    {
        Task temp;

        t = taskQueue.Peek();
        rem = t.getExT() - timeSlot;



        if(rem<=0)
        {
            System.out.println("TASK ID: " + t.getId());
            System.out.println("EXECUTION TIME: " + t.getExT());
            System.out.println("REMAINING EXECUTION TIME: " + rem);

            System.out.println("Task: " + t.getId() + " completed. Popping off.");
            taskQueue.DeQueue();
        }
        else
            System.out.println("\n\n\n");
        
        if(rem>0)
        {
            System.out.println("TASK ID: " + t.getId());
            System.out.println("EXECUTION TIME: " + t.getExT());
            System.out.println("REMAINING EXECUTION TIME: " + rem);

            System.out.println("Task: " + t.getId() + " incomplete. Moving to rear.");
            taskQueue.DeQueue();
            taskQueue.EnQueue(t);
            rem = t.getExT() - timeSlot;

        }
        else
            System.out.println("\n\n\n\n");


    }
}





}
