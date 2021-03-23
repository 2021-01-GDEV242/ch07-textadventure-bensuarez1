
/**
 * Write a description of class Item here.
 *
 * @author (Ben Suarez)
 * @version (2021.03.22)
 */
public class Item
{
    // instance variables - replace the example below with your own
    private String description;
    private int weight;

    /**
     * Constructor for objects of class Item
     */
    public Item(String description, int weight)
    {
        this.description = description;
        weight = weight;
        //this.list = new ArrayList<Item>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param getShortDescription
     * @return the description of the item
     */
    public String getShortDescription()
    {
        return description;
    }
    
    /**
     * The weight of the items.
     * @param weight
     * @return the weight of the item(s)
     */
    public int weight()
    {
        return weight;
    }
    
    /**
     * Gives line for item name, description and weight.
     * @return name, description and weight.
     */
    public String toString()
    {
        return "Item:" + description + "weight " + weight;
    }
}