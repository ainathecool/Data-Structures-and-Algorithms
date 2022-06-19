public class ArrayList <T>
{

    int n;
    Object[] arrList; //will be initialised from def cons
    int numOfObjArr; //  will allow us to keep a count of objects/contacts registered in the directory

    T data;

    public ArrayList()
    {
        arrList = new Object[10]; //initialised with ten contacts
    }

    //method to check if the array is full, we'll use this when we have to increase the size of the array to check the array before
    public boolean ArraySpace()
    {
        return this.arrList.length == this.numOfObjArr;  //will check if the objects in the array are equal to the size of the array
    }

    //a method transfer array which will copy the current array to a larger array when increasing size
    public void TransferArray(String size)
    {
        int newSize;
        newSize = DetermineNewSize(size); //method will return with the amount of size we should increase the array by
        Object[] tempArr = new Object[newSize];

        int temObj = 0; //will be used as index for temp arr and keep track if current array has obj or is null
        int i; //loop counter

        for(i=0; i<arrList.length;i++,temObj++)
        {
            if(this.arrList[i] == null)
            {
                temObj--;
                continue; //skip this code and continue bcs now curr arr is null
            }

            tempArr[temObj] = this.arrList[i]; //if index is not null, then copying object from curr arr to temp arr
        } //end of for loop

        this.arrList = null;// stating the curr array null
        this.arrList = new Object[tempArr.length]; //new larger array created with increased array size
        this.arrList = tempArr; //temp array contents(Contact class objects have been assigned to the new increased array)

    }

    //method determines the length by which we will increase the current array
    public int DetermineNewSize(String size)
    {
        int newSize;
        if(size.equals("single"))
        {
            newSize= this.arrList.length + 10;
        }
        else if(size.equals("double"))
        {
            newSize= this.arrList.length + 20;
        }
        else
            newSize = this.arrList.length;

        return newSize;
    }

    //method for adding a new object to the array
    public void AddObj(T a)  //contacts type ka object ayega
    {
        //checking if array has space or we need to increase size
        if(ArraySpace())
        {
            TransferArray("double"); //either single or double
        }
        this.arrList[this.numOfObjArr] = a; //object added to end of array
        this.numOfObjArr++; //counter incremented.

    }
    //delete method - deleting the object which contains the name/id entered by the user
    public void RemoveObj(T a) //obj a is the obj needed to be removed, weve already matched it from main class
    {
        int i;
        for(i=0;i<numOfObjArr;i++)
        {
            if(a.equals(this.arrList[i]))
            {
                this.arrList[i] = null;
                this.numOfObjArr--;
                TransferArray(""); // array ka size ab chota hova tou trasferring it into a smaller array
                return;
            }
        } //end of for loop

    }

    public T getObject(int i)
    {
        if(arrList[i]!=null)
        {
            return (T) arrList[i];
        }
        else return null;
    }



}
