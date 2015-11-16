package groceries;

/**
 * @author 
 */
public class CannedFood extends GroceryItem
{
   private double price;

   /**
    * Constructor.  Uses the passed parameters to initialize the 
    * private instance variables.
    * @param itemID The ID number for this item.
    * @param itemDescription A description of this item.
    * @param price The price of this item.
    */
   public CannedFood(String itemID, String itemDescription, 
      double price)
   {
      super(itemID, itemDescription);
      this.price=price;
              
   }

   /**
    * Returns the price of this item.
    * @return the price of this item.
    */
   @Override
   public double getPrice()
   {
      return this.price;
   }

   /**
    * Returns a String representation of this item.  
    * The returned string consists of the String produced by the 
    * toString method of the GroceryItem class, followed by the
    * price of this item, formatted as shown in the sample output.
    * @return a String representation of this item. 
    */
   @Override
   public String toString()
   {
      return super.toString()+" "+this.price;
   } 
}
