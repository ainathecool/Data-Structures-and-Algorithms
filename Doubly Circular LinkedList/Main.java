import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        OwnDCLL dc1 = new OwnDCLL();
        dc1.InsertAtBeginning(12);
        dc1.InsertionBeforeAfterNode(1,4);
        dc1.InsertionBeforeAfterNode(2,6);
        dc1.InsertionBeforeAfterNode(3,10);
        dc1.InsertionBeforeAfterNode(4,8);
        dc1.DisplayAllElements();
        dc1.SortList();
        dc1.DisplayAllElements();

    }
}

