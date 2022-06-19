import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        ArrayList<Restaurant> RestaurantsList = new ArrayList<Restaurant>();
        Restaurant r = new Restaurant();
        boolean option1 = false;
        boolean option2 = false;

        do {
            System.out.println("Enter your choice");
            System.out.println("1. Open already existing restaurant");
            System.out.println("2. Create new Restaurant");
            System.out.println("0. Exit");
            int choice1 = sc.nextInt();
            switch (choice1) {
                case 1:		//existing restaurant
                    System.out.println("Enter Name of restaurant");
                    String rname = sc.next();
                    for (Restaurant rest : RestaurantsList) {
                        if (rest.getRestaurantName().equals(rname)) {

                            do {
                                System.out.println("Enter your choice");
                                System.out.println("1. Display Complete Menu");
                                System.out.println("2. Add dish to certain Menu");
                                System.out.println("3. Update price of certain dish");
                                System.out.println("4. Remove certain dish from menu");
                                System.out.println("5. Add different menus to the restaurant");
                                System.out.println("0. Exit");
                                int choice2 = sc.nextInt();
                                switch (choice2) {
                                    case 1:
                                        rest.displayAllMenus();
                                        break;
                                    case 2:
                                        rest.addDishToMenu();
                                        break;
                                    case 3:
                                        rest.updatePrice();
                                        break;
                                    case 4:
                                        rest.removeDish();
                                        break;
                                    case 5:
                                        rest.addMenu();
                                        break;
                                    case 0:
                                        option2 = true;
                                        break;
                                    default: System.out.println("Invalid choice");
                                }


                            } while(!option2);


                        }
                    }

                    break;
                case 2:		//create restaurant
                    System.out.println("Enter Name of restaurant");
                    String name = sc.next();
                    r.setRestaurantName(name);
                    RestaurantsList.add(r);
                    System.out.println("New restaurant has been created succcessfully");
                    break;
                case 0:
                    option1 = true;
                    break;
                default: System.out.println("Invalid choice");
            }

        }while(!option1);

    }

}