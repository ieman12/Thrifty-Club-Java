
/**
 * Write a description of class Store here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Store
{
    // instance variables - replace the example below with your own
    private String storeName;
    private int total;

    /**
     * Constructor for objects of class Store
     */
    public Store(String storeName)
    {
        this.storeName = storeName;
        this.total = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * Printing a welcome message.
     */
    public void memberRegister1(Member member)
    {
        member.setStore(this);
        System.out.println(storeName + " welcomes " + member.getName() + " (id:" + member.getId() + ")");
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * Printing a welcome message.
     */
    public void memberRegister2(String name, String id, String pinNumber)
    {
        Member member = new Member(name, id, pinNumber);
        member.setStore(this);
        System.out.println(storeName + " welcomes " + member.getName() + " (id:" + member.getId() + ")");
    }
    
     public void checkout(int tenderedAmount, Member member)
    {
        Item item = member.getItem();
        if (item == null) {
            int price = item.getPrice();
            int change = tenderedAmount - price;
            System.out.println("No item in the basket. Please select an item first.");
            return;
        }
        int price = item.getPrice();
        int change = tenderedAmount - price;
        System.out.println(storeName + ": Serving " + member.getName());
        System.out.println("Your basket contains");
        System.out.println(item.getName() + " at " + price + "p");
        System.out.println("You have tendered " + tenderedAmount + "p");
        System.out.println("Your change is " + change + "p");
        total += price;
        member.setMoney(member.getMoney() - price);
    }
}
