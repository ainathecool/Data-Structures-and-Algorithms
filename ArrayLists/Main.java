import java.util.*;
public class Main
{
    public static void main(String [] args)
    {

        Scanner input = new Scanner(System.in);
        int choice;
        Menu m = new Menu();

        Contacts c = new Contacts();

       ArrayList <Contacts> A1 = new ArrayList<Contacts>();

        int run = m.Continue();
        while(run!=0)
        {
            choice = m.MainMenu();

            switch (choice)
            {    //int another = 0;

                case 1:
                        System.out.println("ADD A NEW CONTACT.");
                        System.out.println("Enter first name: ");
                        c.setfName(input.nextLine());
                        System.out.println("Enter last name: ");
                        c.setlName(input.nextLine());
                        System.out.println("Enter mobile number (10 digits):  ");
                        c.setPhone(input.nextLong());
                        input.nextLine();
                        System.out.println("Enter email: ");
                        c.setEmail(input.nextLine());
                        A1.AddObj(c);
                        System.out.println("Contact Added. Number of contacts:  " + A1.numOfObjArr );
                        break;

                case 2:
                        System.out.println("DISPLAY ALL CONTACTS.");
                        m.DisplayElements(A1);
                        break;

                case 3:
                        System.out.println("DISPLAY SPECIFIC CONTACT.");
                        System.out.println("Enter first name of contact you want to search: ");
                        String f = input.nextLine();
                        m.DisplayElementFName(A1,f);
                        break;

                case 4:
                        System.out.println("DELETE A CONTACT.");
                        System.out.println("Enter first name of contact you want to delete: ");
                        String d = input.nextLine();
                    for(int i=0;i< A1.numOfObjArr;i++) {
                        Contacts con = A1.getObject(i);
                        if (c.getfName().equals(d)) {
                            A1.RemoveObj(c);
                        }
                    }
                    break;

                default: break;

            }
        }
    }

}
