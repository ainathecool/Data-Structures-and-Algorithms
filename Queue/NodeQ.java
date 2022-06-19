public class NodeQ<T> {
    private T key;
    NodeQ next;

    public NodeQ() {}
    public NodeQ(T key)
    {
        this.key = key;
        this.next = null;
    }



    public void setKey(T key)
    {
        this.key = key;
    }

    public T getKey()
    {
        return key;
    }

    public void setNext(NodeQ next)
    {
        this.next = next;
    }

    public NodeQ getNext()
    {
        return next;
    }
}
