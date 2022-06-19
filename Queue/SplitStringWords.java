
public class SplitStringWords {


    Queue[] queue = new Queue[10]; //queue initialised

    {
        for(int i=0;i<queue.length;i++)

        {
            queue[i] = new Queue();
        }
    }

    public void SplitString(String x)
    {
        //string split into words
        String[] words = x.split("\\s"); //splitting string into words by whitespaces


        //now split words into characters to send into separate queues

        for(int i =0; i< words.length; i++)
        {
            String[] arr = words[i].split(""); //words broken down into characters

            for(int j =0;j< arr.length;j++)
            {
                queue[i].EnQueue(arr[j]);
            }
            arr = null;
        }

        //print concatenated queues
        for(int k =0;k<words.length;k++)
        {
            queue[k].PrintQueue();
        }


    }
}
