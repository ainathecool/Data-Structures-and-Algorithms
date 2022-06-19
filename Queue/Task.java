
public class Task
{
    private int id;
    private int exT;

    //constructor
    public Task()
    {
        this.id = 0;
        this.exT = 0;
    }
    public Task(int id, int exT)
    {
        this.id = id;
        this.exT = exT;
    }

    //getter setters


    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public void setExT(int exT)
    {
        this.exT = exT;
    }

    public int getExT()
    {
        return exT;
    }
}
