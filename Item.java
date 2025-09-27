
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    // instance variables 
    private String name;
    private int price;

    /**
     * Constructor for objects of class Item
     */
    public Item(String name, int price)
    {
        this.name =name;
        this.price = price;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        return name;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public String getPriceString()
    {
        return Integer.toString(price);
    }
}
