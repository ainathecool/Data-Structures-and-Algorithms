import java.util.*;
public class OwnDCLL <T extends Comparable<T>>
{

    class OwnNodeDCLL<T>
    {


        T data; //generic data
        OwnNodeDCLL next;
        OwnNodeDCLL previous;

        //parameterised constructor
        public OwnNodeDCLL(T data)
        {
            this.data = data;
            this.next = null;
            this.previous = null;
        }



    }

    OwnNodeDCLL head = null;
    OwnNodeDCLL tail = null;


    //constructor
    OwnDCLL()
    {
        this.head = null;
        this.tail = null;
    }

    public boolean CheckForEmpty()
    {
        return head == null;
    }

    void DisplayAllElements()
    {
        OwnNodeDCLL current = head;
        if(CheckForEmpty())
        {
            System.out.println("\nList Empty.");
        }
        else
        {
            System.out.println("Nodes of the doubly circular linked list:");
            int num = 0; //for counting elements in list
            while(current != null)
            {   //forward printing
              //  System.out.println("Forward Printing: ");
                System.out.println(current.data);
                current= current.next;
                num++;

                /*System.out.println("Backward Printing:" );
                //current = tail;
                while(current != null)
                {
                    System.out.println(current.data);
                    current = current.previous;
                    num++;
                } //end of backward while*/

            } //end of forward while
        } //end of else
    } //end of print function

    void InsertAtEnd(T data)
    {
        OwnNodeDCLL newNode = new OwnNodeDCLL(data);
        OwnNodeDCLL current = head;
        newNode.data = data;

        while(current.next == head && current.previous != null) //if current.next==head that means we're at end of list and ab next ma head ka reference hai
        {
            current = current.next;

        }
        //we're at the end of the list
        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;
        tail.next = head;
    }

    void InsertAtBeginning(T data)
    {
        OwnNodeDCLL newNode = new OwnNodeDCLL(data);
        OwnNodeDCLL current = head;

        newNode.data = data;
            if(head==null) //first node insertion
            {
                head = tail = newNode;
                head.previous = tail;
                tail.next = null;
            }
            else if(head!=null && head.previous ==tail)
            {

                newNode.next = head;
                head.previous = newNode;
                newNode = head;
              //  head.previous = tail;
                tail.next = head;
            }

    }

     void InsertionBeforeAfterNode(int index, T data)
    {
        OwnNodeDCLL newNode = new OwnNodeDCLL(data);
        OwnNodeDCLL current = head;
        int currIndex = 1;

        if(index < 0)
        {
            System.out.println("Enter index 0 or above.");
        }
        while(index > currIndex)
        {
            current = current.next;
            currIndex++;
        }

        if(index > 0 && current.next == null)
        {
            System.out.println("End of list, Index greater.");
        }

        newNode.next = current.next;
        current.next = newNode;
        //newNode.next.previous = newNode;
       // newNode.previous.next = current;
    }

    void DeleteFirstNode()
    {
        //OwnNodeDCLL prevNode = null;
        //OwnNodeDCLL currNode = head;

      //  if(currNode.data == data && currNode == head && )

            OwnNodeDCLL oldNode;
            oldNode = head;
            oldNode.previous.next = oldNode.next; //tail ma betha dya head ka next
            oldNode.next.previous = oldNode.previous; //tail betha dee
            head = oldNode.next; //new head bangya
            //old node disconnected from list

    }

    void DeleteSpecificMiddleNode(T data)
    {
        OwnNodeDCLL current = head;

        while(current.data != data)
        {
            current = current.next;
        }

        if(current.data == data)
        {
            OwnNodeDCLL oldNode;
            oldNode = current;
            oldNode.previous.next = oldNode.next;
            oldNode.next.previous = oldNode.previous;
            current = oldNode.previous;
            //old node disconnected from list
        }
    }

    void DeleteLastNode()
    {
        OwnNodeDCLL oldNode = tail;
        oldNode.previous.next = head;
        oldNode.next.previous = oldNode.previous;
        tail = oldNode.previous;
        //last node disconnected

    }
    public void SortList()
    {
        OwnNodeDCLL currentNode = null;
        OwnNodeDCLL currentIndex = null;

        OwnNodeDCLL temp = null;

        if(head == null) //if list is empty
            return;

        else
        {
            ComparingClass<T> comparingClass = new ComparingClass<T>();
            //Current will point to head
            for(currentNode = head; currentNode.next != null; currentNode = currentNode.next) {
                //Index will point to node next to current
                for(currentIndex = currentNode.next; currentIndex != null; currentIndex = currentIndex.next) {
                    if(comparingClass.compareTwoValues(currentNode.data, currentIndex.data))
                    {

                        temp.data = currentNode.data;
                        currentNode.data = currentIndex.data;
                        currentIndex.data = temp.data;
                    }
                }
            }
        }
    } //end of sort function
    public class ComparingClass<T extends Comparable<T>> {

        public boolean compareTwoValues(T value1, T value2) {
            return value1.compareTo(value2) < 0;
        }

        public boolean compareTwoValues(Object data, Object data1) {
            return data.equals(data1) < 0;
        }
    }
}
