import java.io.*;
public class LinkedList <T extends Comparable> //extending comparable for using it with min and max functions
{

    Node head;

    //display function to print all elements
    public void Display()
    {
        Node currentNode = head;

        if(currentNode == null)
        {
            System.out.println("List empty");
        }
        for(int i = 0; currentNode != null; i++)  //until list(array) is empty
        {
            System.out.print(currentNode.data);
            System.out.print(",  ");
            currentNode = currentNode.next;
        }
    }

    //inserrt at start function
    public void InsertAtStart(T a)
    {
        Node newNode = new Node(a); //node creation
        newNode.next = head; //node insertion
        head = newNode;      //new head assigned since insertion is at start
    }

    //insert at end function
    public void InsertAtEnd(T d)
    {
        Node endN = head; //declare new node and assign it head

        if(endN != null) //if list not empty
        {
            while(endN.next != null) //loop traversal till list array ends
            {
                endN = endN.next;
            }
            endN.next = new Node(d); //node created and data is assigned (through node k parametrised constructor
        }
        else head = new Node(d); //head he pehla node hai end sa bhe if list is empty
    }


    //insert after function (using c after p)
    public void InsertAfter(T p, T c) //yaani p data k baad c data wala node insert
    {
        Node InsertN = new Node(c); //new node created and data assigned
        Node currentNode = head;

        while (currentNode != null && currentNode.data != p) //traversal to reach p node takay uskay baad c node add kya jaye
        {
            currentNode = currentNode.next;
        }

        if (currentNode != null) //yaani list is not at end
        {
            Node afterInsertN = currentNode.next; //iss node sa pehlay insertion honi hai
            currentNode.next = InsertN; //insertion
            InsertN.next = afterInsertN;
        }

    }

    //delete from start
    public void DeleteFromStart()
    {
        Node newHead = head.next; //start sa remove karaingay head tou head ka next will be new head
        head = null; //current first node(head) removed
        head = newHead;

    }

    //delete from end
    public void DeleteFromEnd()
    {
        Node currentNode = head;
        if(currentNode != null && currentNode.next != null) //traversal
        {
            while(currentNode.next.next != null) //stopping traversal at last node except when list ends
            {
                currentNode = currentNode.next;
            }
            currentNode.next = null; //last node removed
        }
    }


    //delete any node
    public void DeleteAny(T a)
    {
        Node currentNode = head;

        while (currentNode != null && currentNode.next.data != a) //traversal till data (a) matches
        {
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next; //node removed from middle, connection to it lost, java will have it removed
    }



    //find max - function to help delete max
    public void FindMax()
    {
        Node currentNode = head;
        T max = (T) head.data; //pehlay lets assume k first value (head ka data) is the max value

        while(currentNode != null)
        {
            if(max.compareTo(currentNode.data)<0) //comparing objects
            {
                max = (T) currentNode.data;
            }
        }//end of while traversal
        DeleteMax(max);
    }

    public void DeleteMax(T max)//max ayega find max function sa
    {
        DeleteAny(max); //use delete any function - it will delete the node with max value
    }


    //find min - function to help delete min
    public void FindMin()
    {
        Node currentNode = head;
        T min = (T) head.data; //pehlay lets assume k first value (head ka data) is the min value

        while(currentNode != null)
        {
            if(min.compareTo(currentNode.data)>0) //comparing objects
            {
                min = (T) currentNode.data;
            }
        }//end of while traversal
        DeleteMin(min);
    }
    public void DeleteMin(T min)//min ayega find min function sa
    {
        DeleteAny(min); //use delete any function - it will delete the node with min value
    }

    //rev link list using c and p
    public Node Reverse(Node h) //main sa head bhej rahay, and ismay new head we'll return jo list ko rev karnay k baad ayega
    {
        Node prevNode = null;
        Node currNode = head;
        Node nextNode;

        while(currNode != null)//list is not empty or does not end
        {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode; //list reversal

        }
        h = prevNode; //new head assigned
        return h;

    }



}
