//task1 - will be used for task 2 as well
import java.util.*;
public class Iterator<T> //generic class
{
        ArrayList <T> it = new ArrayList <T>();
        int index;

        //parameterised constructor
        public Iterator(T it, int index)
        {
            this.it = (ArrayList<T>) it;
            this.index = index;
        }

        //has next method - checks agar aur elements hain k nai, yaani aik ext exist karta hai k nai
        public boolean hasNext()
        {
            int size = it.size();

            if (index>size)  //yaani jo index hamary paas ayi, agar wo size sa bari hai tou aur elements hain yaani
            {
                return true;
            }
            else return false;
        }

        //next method gets next element
        public T next()
        {
            int size = it.size();
            if (index>size)
            {
                return it.get(index++); //next print karanay k lye
            }
            else return null;
        }

    }

