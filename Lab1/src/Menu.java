import java.util.*;

public class Menu
{
    //menu attributes - menu has name and dishes
    private String MenuName;
    private ArrayList<Dish> DishList = new ArrayList<Dish>();

    public Menu() //def constructor initialising the attributes
    {
        MenuName = " ";
        ArrayList<Dish> DishList = new ArrayList<Dish>();
    }


    //getters and setters
    public String getMenuName()
    {
        return MenuName;
    }
    public void setMenuName(String MenuName)
    {
        this.MenuName = MenuName;
    }
    public ArrayList<Dish> getDishList()
    {
        return DishList;
    }
    public void setDishList(ArrayList<Dish> DishList)
    {
        this.DishList = DishList;
    }

}