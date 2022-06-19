import java.util.*;

public class Dish extends ArrayList<Dish> {
    //priv attributes
    private String DishName;
    private String DishID;
    private double DishPrice;

    public Dish()
    {
        DishName = " ";
        DishID = " ";
        DishPrice = 0.0;
    }

    //getters and setters
    public String getDishName()
    {
        return DishName;
    }
    public void setDishName(String DishName)
    {
        this.DishName = DishName;
    }


    public String getDishID()
    {
        return DishID;
    }
    public void setDishID(String DishID)
    {
        this.DishID = DishID;
    }


    public double getDishPrice()
    {
        return DishPrice;
    }
    public void setDishPrice(double DishPrice)
    {
        this.DishPrice = DishPrice;
    }

}