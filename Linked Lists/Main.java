public class Main {

    public static void main (String[] args)
    {

        LinkedList <Integer> list = new LinkedList<Integer>();

        list.InsertAtEnd(6);
        list.InsertAtEnd(3);
        list.InsertAtEnd(4);
        list.Display();
        System.out.println();
        System.out.println();

        list.InsertAtStart(7);
        list.Display();
        System.out.println();
        System.out.println();

        list.InsertAfter(6, 9);
        list.Display();
        System.out.println();
        System.out.println();


        list.DeleteFromStart();
        list.Display();
        System.out.println("");
        System.out.println("");

        list.DeleteFromEnd();
        list.Display();
        System.out.println("");
        System.out.println("");

        list.DeleteAny(9);
        list.Display();
        System.out.println("");
        System.out.println("");

        Node h = list.Reverse(list.head);
        System.out.println("Reversed list head: " + h.data);

        list.FindMax();
        list.FindMin();






    }

}
