public class Sorting {

    public void InsertionSort(int[] arr)
    {
        int l = arr.length;
        int key = 0;
        for(int i=1;i<arr.length;i++)
        {
            key = arr[i];
            int j = i-1;
            while((j>-1) && (arr[j]>key))

            {
            arr[j+1] = arr[j];
            j--;
            }
            arr[j+1] = key;
        }

    }

    public void SelectionSort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int loc = i;
            for(int j =i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[loc])
                {
                    loc = j;
                }
            }
            int lowerNum = arr[loc];
            arr[loc] = arr[i];
            arr[i] = lowerNum;
        }
    }

    public void BubbleSort(int[] arr)
    {
        int temp =0;
        for(int i=0;i<(arr.length - 1);i++)
        {
            for(int j=0;j< (arr.length - i - 1); j++)
            {
                if(arr[j]> arr[j+1])
                {
                    //swapping

                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }//end of inner for
        }//end of outer for
    }
}
