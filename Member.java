
/**
 * Write a description of class Member here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Member
{
    // instance variables - replace the example below with your own
    private String name;
    private String id;
    private String pinNumber;
    private Store store;
    private Item item;
    private int money;

    /**
     * Constructor for objects of class Member
     */
    public Member(String name, String id, String pinNumber)
    {
        this.name = name;
        this.id = id;
        this.pinNumber = pinNumber;
        this.store = null;
        this.item = null;
        this.money = 500;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     *Accessor Method
     */
    public String getName()
    {
        return name;
    }
    
    public String getId()
    {
        return id;
    }
    
    public String getPinNumber()
    {
        return pinNumber;
    }
    
    public Store getStore()
    {
        return store;
    }
    
    public int getMoney()
    {
        return money;
    }
    
    public Item getItem()
    {
        return item;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     *Mutator Method
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setId(String id)
    {
        this.id = id;
    }
    
    public void setPinNumber(String pinNumber)
    {
        this.pinNumber = pinNumber;
    }
    
    public void setStore(Store store)
    {
        this.store = store;
    }
    
    public void selectItem(Item selectItem) 
    {
        this.item = selectItem;
        int price = selectItem.getPrice();
        String priceString;
        if (price < 100) {
            priceString = price + "p";
        } else {
            int pounds = price / 100;
            int pence = price % 100;
            priceString = "£" + pounds + "." + (pence < 10 ? "0" : "") + pence;
        }
         System.out.println(name + " has selected " + selectItem.getName() + " at " + priceString);
    }
    
    public void setMoney(int money)
    {
        this.money = money;
    }
    
    public void goToCheckout(int pyment)
    {
        if (store == null) {
            System.out.println("You are not in a store. Please registe at a store first.");
            return;
        }
        
        store.checkout(pyment, this);
    }
}
