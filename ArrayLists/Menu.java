import java.util.*;

import static java.lang.System.exit;

public class Menu {

    Scanner input = new Scanner(System.in);
    public int MainMenu()
    {
        int choice;

        System.out.println("Welcome to the telephone directory. With which option would you like to proceed? \n\n\n ");
        System.out.println("1.Add a new contact. \n2.Display all contacts. \n3.Display specific contact. \n4.Delete a contact. \n5.Quit.");
        System.out.println("Enter your choice: ");
        choice = input.nextInt(); //takes user input
        return choice;
    }
    public int Continue()
    {
        int ans;
        System.out.println("Exit program or return to main menu? Press 0 to exit and 1 to return to main menu: ");
        ans = input.nextInt();
        if(ans==0)
        {
            exit(0);
        }
        else if(ans==1)
        {
            System.out.println("");
        }
        return ans;

    }

    public void DisplayElements(ArrayList<Contacts> A1)
    {
        System.out.println("First Name" + "Last Name" + "Phone" + "Email Address.");
        for(int i=0;i< A1.numOfObjArr;i++)
        {
          Contacts c=   A1.getObject(i);
          System.out.println(c.getfName() + " " + c.getlName()+ " " + c.getPhone() + " " + c.getEmail());
        }
    }

    public void DisplayElementFName(ArrayList<Contacts> A1, String f)
    {
        System.out.println("First Name" + "Last Name" + "Phone" + "Email Address.");
        for(int i=0;i< A1.numOfObjArr;i++)
        {
            Contacts c=   A1.getObject(i);
            if(c.getfName().equals(f))
            {
                System.out.println(c.getfName() + " " + c.getlName()+ " " + c.getPhone() + " " + c.getEmail());
            }
            else
                System.out.println("Contact not found.");

        }
    }



}

