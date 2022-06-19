import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Collection;


public class Main
{
    public static void main(String[] args)
    {
            //take user input (string ma take input - either int, double or ch,
            //then identify them  their types and send to their arraylists
            // print each lists
            // find max of list and display

        String input = "";
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> materialA = new ArrayList<>();
        ArrayList<Float> materialB = new ArrayList<>();
        ArrayList<String> materialC = new ArrayList<>();

        int cont = 1;
        while(cont!=10) //give 30 values for 30 labels
        {
            System.out.println("Enter you box label (int or float or char only):  ");
            input = sc.nextLine();
            cont++;
        }


        /* checking for type and adding into lists w their data types */
        if(input.matches("\\d+") )
        {
            //int label = (int) input;
            //type is integer
            materialA.add(Integer.valueOf(input));
        }
        else if(input.matches("\\d*[.]\\d+"))
        {
            //type is float
            materialB.add(Float.valueOf(input));
        }
        else
        {
            //yaani its string ya char
            materialC.add(input);
        }

        //displaying lists



        Iterator<ArrayList<Integer>> itA = new Iterator<ArrayList<Integer>>(materialA,15);
        while (itA.hasNext())
        {
            System.out.print(itA.next());
            System.out.println("\t");
        }

        Iterator<ArrayList<Float>> itB = new Iterator<ArrayList<Float>>(materialB,15);
        while (itB.hasNext())
        {
            System.out.print(itB.next());
            System.out.println("\t");
        }

        Iterator<ArrayList<String>> itC = new Iterator<ArrayList<String>>(materialC,15);
        while (itC.hasNext())
        {
            System.out.print(itC.next());
            System.out.println("\t");
        }

        //finding max

        Integer max = Collections.max(materialA);
        System.out.println("Max value from material A: "+ max);

        Float maxF = Collections.max(materialB);
        System.out.println("Max value from Material B: "+ maxF);




    }
}
