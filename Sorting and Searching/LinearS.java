import java.util.Arrays;
import java.util.Objects;

public class LinearS {

    public void Search (String[][] arr)
    {
        int i,j;
        int[][] CAT = new int[2][3];

        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr.length;j++)
            {
                if(Objects.equals(arr[i][j], "C") && i==0)
                {

                    CAT[0][0] = i;
                    CAT[1][0] = j;


                }
                else if(Objects.equals(arr[i][j],"A") && i==1)
                {
                    CAT[0][1] = i;
                    CAT[1][1] = j;
                }
                else if(Objects.equals(arr[i][j],"T") && i==2)
                {
                    CAT[0][2] = i;
                    CAT[1][2] = j;
                }
            }//end of inner for - column
        }//end of outer for - row
        //return CAT[2][3];
        System.out.println(Arrays.deepToString(CAT));
    } //end of function
}
