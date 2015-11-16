package groceries;

/**
 * @author 
 */
public class Produce extends GroceryItem
{ 
   private double pricePerPound;
   private double weight; // weight, in pounds
   private double price;

   /**
    * Constructor.
    * Uses the passed parameters to set the values of the private
    * instance variables.  The instance variable price is calculated
    * by multiplying the price per pound and the weight.
    * @param itemID The ID number of this item.
    * @param itemDescription A description of this item.
    * @param pricePerPound The price per pound for this item.
    * @param weight The weight, in pounds, of this item.
    */
   public Produce(String itemID, String itemDescription,
      double pricePerPound, double weight)
   {
     super(itemID, itemDescription);
     this.pricePerPound=pricePerPound;
     this.weight=weight;
   }

   /**
    * Returns the price of this item.
    * @return the price of this item.
    */
   @Override
   public double getPrice()
   {
      return this.pricePerPound*this.weight;
   }

   /**
    * Returns a String representation of this item.  
    * The returned string consists of the String produced by the 
    * toString method of the GroceryItem class, followed by the
    * price, weight, and price per pound of this item, formatted 
    * as shown in the sample output.
    * @return a String representation of this item. 
    */
   @Override
   public String toString()
   {
      return super.toString()+"$ "+this.getPrice()+" ("+this.weight+" pounds  @"+this.pricePerPound+"/pound)";
   } 
}
