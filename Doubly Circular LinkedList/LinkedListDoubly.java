
public class LinkedListDoubly <T extends Comparable<T>>
{

    Node head;
    Node tail;


    //display all values
    public void Display()
    {
        Node currentNode = head;

        for(int i = 0; currentNode != null; i++)  //traversal loop
        {
            //forward printing - (backward printing ma currNode ko tail kar k prev kar kar k print karana
            System.out.print(currentNode.data);
            System.out.print(",  ");
            currentNode = currentNode.next;
        }
    }

    //insertion  at start
    public void InsertAtStart(int a)
    {
        Node newNode = new Node(a); //node creation and data assignemnt

        if(head != null)
        {
            head.previous = newNode;
            newNode.next = head;
        }
        else
        {
            head = newNode;
        }

    }



    //insertion at end
    public void InsertAtEnd(int a)
    {
        Node currentNode = head;
        Node newNode = new Node (a); //node creation and assignment
        if(head != null)  //checking for empty list basically
        {
            while(currentNode.next != null) //loop traversal through ll till list comes to an end
            {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            newNode.previous = currentNode;
        }
        else head = newNode;
    }



    //insertion c before p
    public void InsertBefore(int p, int c)
    {
        Node toInsert = new Node(c); //c ko curr node sa pehlay dalna
        Node currentNode = head;

        while (currentNode != null && currentNode.data != p)
        {
            currentNode = currentNode.next;
        }

        Node beforeInsert = currentNode.previous;
        currentNode.previous = toInsert;
        toInsert.previous = beforeInsert;
        beforeInsert.next = toInsert;
        toInsert.next = currentNode;
    }


    //insertion c after p
    public void InsertAfter(int p, int c)
    {
        Node toInsert = new Node(c); //c inserting after curr node
        Node currentNode = head;

        while (currentNode.next != null && currentNode.data != p)
        {
            currentNode = currentNode.next;
        }

        currentNode.next = toInsert;
        Node afterInsert = new Node(currentNode.next.data);
        afterInsert.previous = toInsert;
        toInsert.next = afterInsert;
        toInsert.previous = currentNode;
    }



    //delete from beginning
    public void DeleteFromStart()
    {
        Node newHead = head.next;
        newHead.previous = null;
        head = null; //removing first node
        head = newHead;

    }



    //delete from end
    public void DeleteFromEnd()
    {
        Node currentNode = head;
        if(currentNode != null && currentNode.next != null)
        {
            while(currentNode.next.next != null)
            {
                currentNode = currentNode.next;
            }

            currentNode.next = null;

        } //end of if
    }


    //delete any node doubly ll
    public void DeleteAny(int a)
    {
        Node currentNode = head;

        while (currentNode.data != a && currentNode != null)
        {
            currentNode = currentNode.next;
        }

        Node afterDeletion = currentNode.next.next;
        currentNode.next = afterDeletion;
        afterDeletion.previous = currentNode;
    }



    //sorting doubly linked list
    public Node Sorting()
    {
        Node currentNode = head;

        int swapped = 0;

        Node Node1;
        Node Node2 = null;

        if (currentNode == null) //list empty
            return null;

        do
        {   swapped = 0; //counter to keep track k value swap hoyi k nai and for loop
            Node1 = currentNode;
            while (Node1.next != Node2)
            {
                if (Node1.data > Node1.next.data)
                {
                    int temp =Node1.data;
                    Node1.data = Node1.next.data;
                    Node1.next.data = temp;
                    swapped = 1;
                }
                Node1 = Node1.next;
            }
            Node2 = Node1;
        } while (swapped != 0);
        return currentNode;
    }


    //removing duplicates from doubly ll
    public void RemoveDuplicates()
    {
        Node current; //curr node
        Node index;  //curr k next wala node - inn dono k beech ma duplicates check hongay two loops ma
        if(head == null)  //list empty
        {
            return;
        }
        else
        {
            for(current = head; current != null; current = current.next) //traversal
            {
                for(index = current.next; index != null; index = index.next) //next node traversal
                {
                    if(current.data == index.data) //if duplicate found
                    {
                        index.previous.next = index.next; //duplicate removed

                        if(index.next != null) //list k end nai aya
                            index.next.previous = index.previous;

                    }
                }//end of inner for
            } //end of outer for
        } //end of else

    } //end of fucntion
}

