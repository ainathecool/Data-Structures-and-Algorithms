public class Markov
{
    public void MarkovMatrix(double arr[][])
    {
        double row1 = 0, row2 =0 , row3 =0; //variables to store sum of each row
        for(int i=0;i<3;i++) //outer
        {
            for(int j =0;j<3;j++)
            {
                if(i==0) //first row sum
                {
                    row1 += arr[i][j];
                }

                if(i==1) //second row
                {
                    row2 += arr[i][j];
                }

                if(i==2) //third row
                {
                    row3 += arr[i][j];
                }

            } //end of inner for

        }//end of outer for

        if(row1 == 1 && row2 ==1 && row3 ==1)
        {
            System.out.println("The entered matrix is a markov matrix.");
        }
        else
            System.out.println("The entered matrix is not a markov matrix.");
    }
}
