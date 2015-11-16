package groceries;

/**
 * @author 
 */
public abstract class GroceryItem implements Comparable<GroceryItem>
{
   private String itemID;
   private String itemDescription;

   /**
    * Constructor.  Uses the passed parameters to initialize the 
    * instance variables.
    * @param itemID The ID number for this item. 
    * @param itemDescription A description of this item.
    */
   public GroceryItem(String itemID, String itemDescription)
   {
      this.itemID = itemID;
      this.itemDescription = itemDescription;
   }
   
   /**
    * An abstract method that returns the price of this item.
    * @return the price of this item.
    */
   public abstract double getPrice();
   
   /**
    * Compares this item to another item,  based on the String 
    * comparison of the ids of the items.
    * @param item The item to which we are comparing this item.
    * @return A negative number, positive number, or zero, depending
    * on whether this item precedes, follows, or is equal to the
    * item passed as a parameter.
    */
   @Override
   public int compareTo(GroceryItem item)
   {
      return this.itemID.compareTo(item.itemID);
   }
   
   /** 
    * Returns a string representation of this item, including
    * the item id and the item description, each left justified 
    * in fields of width 5 and 35, respectively.
    * @return a string representation of this item.
    */
   @Override
   public String toString()
   {
      return String.format("%-5s  %-35s ", itemID, itemDescription);
   } 
}