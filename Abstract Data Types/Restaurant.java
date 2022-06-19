import java.util.*;

public class Restaurant {
    Scanner sc = new Scanner(System.in);//input object

    private String restaurantName;
    private ArrayList<Menu> RestaurantMenu = new ArrayList<Menu>();

    public Restaurant() //def constructor
    {
        restaurantName = " ";
        ArrayList<Menu> RestaurantMenu = new ArrayList<Menu>();
    }


    //getters and setters
    public ArrayList<Menu> getMenuOfRestaurant() {
        return RestaurantMenu;
    }

    public void setMenuOfRestaurant(ArrayList<Menu> RestaurantMenu) {
        this.RestaurantMenu = RestaurantMenu;
    }


    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }


    //functions for menu and dishes
    public void addDishToMenu() {
        System.out.println("Enter name of the menu you want to add new dish to: ");
        String name = sc.next();

        for (Menu m : RestaurantMenu) {
            if (m.getMenuName().equals(name)) {
                addDish(m);
            }

        }
    }

    public void addDish(Menu m) {

        System.out.println("You can add dishes to the menu now. Or, press 0 to exit./n");
        System.out.println("Enter Dish name");
        String nameOfDish = sc.nextLine();
        System.out.println("Enter Dish ID");
        String DishID = sc.next();
        System.out.println("Enter Dish Price");
        double price = sc.nextInt();


        Dish d = new Dish();
        d.setDishName(nameOfDish);
        d.setDishID(DishID);
        d.setDishPrice(price);
        m.setDishList(d);

    }


    public void updatePrice() {
        System.out.println("Enter name of the menu you want to update price in: ");
        String name = sc.next();

        for (Menu m : RestaurantMenu) {
            if (m.getMenuName().equals(name)) {
                System.out.println("Enter Dish name");
                Scanner sc1 = new Scanner(System.in);
                String nameOfDish = sc1.next();
                System.out.println("Name of dish" + nameOfDish);
                System.out.println("Enter Dish ID");
                Scanner sc2 = new Scanner(System.in);
                String DishID = sc2.next();


                for (Dish d : m.getDishList()) {
                    if (d.getDishID().equals(DishID) && d.getDishName().equals(nameOfDish)) {
                        System.out.println("The old price of the dish is " + d.getDishPrice());
                        System.out.println("Enter new price of the dish:");
                        double newPrice = sc.nextInt();
                        d.setDishPrice(newPrice);
                    }
                }//end of for
            }//end of if

        }//end of outer for

    }//end of function

    public void removeDish() {
        System.out.println("Enter name of the menu from where you want to remove dish:");
        String name = sc.next();

        for (Menu m : RestaurantMenu) {
            if (m.getMenuName().equals(name)) {
                System.out.println("Enter Dish ID:");
                String DishID = sc.next();
                for (Dish d : m.getDishList()) {
                    if (d.getDishID().equals(DishID)) {
                        m.getDishList().remove(d);
                    }
                }//end of inner for
            }//end of if

        }//end of outer for

    }//end of functions


    //add menus to restaurant
    public void addMenu() {
        System.out.println("Enter name of the new menu you want to add to the restaurant:");
        String name = sc.next();
        Menu m = new Menu();
        m.setMenuName(name);
        RestaurantMenu.add(m); //new menu object added
        System.out.println("Menu successfully added./n");
        addDish(m); //takay menu ke dishes add houn phir

    }

    public void displayAllMenus() {
        for (Menu m : RestaurantMenu) {
            System.out.println("Menu Name : " + m.getMenuName());

            System.out.println("Dish ID \t Dish Name \t Dish Price");
            for (Dish d : m.getDishList()) {
                System.out.println(d.getDishID() + "\t" + d.getDishName() + "\t" + d.getDishPrice());
            }

        }//end of outer for

    }//end of function
}