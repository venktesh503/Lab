package groceries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @author 
 */
public class GroceryCart implements Iterable<GroceryItem>
{

   private ArrayList<GroceryItem> groceries;

   /**
    * Constructor.
    * Sets values of groceries to a new empty array list of grocery 
    * items.
    */
   public GroceryCart()
   {
      this.groceries = new ArrayList<>();
   }

   /**
    * Adds an item to groceries.
    * @param item The item to be added.
    */
   public void addItem(GroceryItem item)
   {
     this.groceries.add(item);
   }

   /**
    * Sorts the items in groceries according to the natural order 
    * of the GroceryItem class.
    */
   public void sortNaturalOrder()
   {
       Collections.sort(groceries);
   }

   /**
    * Sorts the items in groceries according to the price of the item.
    */
   public void sortByPrice()
   {
     Collections.sort(groceries, new Comparator<GroceryItem>(){

         @Override
         public int compare(GroceryItem o1, GroceryItem o2) {
             //throw new UnsupportedOperationException("Not supported yet."); 
             if(o1.getPrice()<o2.getPrice())
             {
                 return -1;
             }
             if(o1.getPrice()>o2.getPrice())
             {
                 return 1;
             }
             else
                 return 0;
         }
         
     });
   }

   /**
    * Returns an array list containing only the produce items 
    * in groceries.
    * @return an array list containing only the produce items in 
    * groceries.
    * HINT:  The instanceof operator might be useful here, and you
    * might need to cast.
    */
   public ArrayList<Produce> getProduce()
   {
       ArrayList<Produce> produce = new ArrayList<>();
       for(GroceryItem gi:groceries)
       {
         if(gi instanceof Produce)
         {
           produce.add((Produce) gi);
         }
       }
      return produce;
   

   }
   /**
    * Returns an iterator over groceries.
    * @return an iterator over groceries.
    */
   @Override
   public Iterator<GroceryItem> iterator()
   {
       Iterator<GroceryItem> myItr = groceries.iterator();
     while(myItr.hasNext())
     {
         System.out.println(myItr.next());
     }
     return myItr;
   }

   /**
    * Returns a String representation of items in groceries.
    * The string representation consists of a listing of each item
    * in groceries, with each displayed according to the toString
    * method of the appropriate class.  
    * See sample output for more details.
    * @return a String representation of items in groceries.
    */
   @Override
   public String toString()
   {
       String str="";
       for(GroceryItem gi:groceries)
       {
           
           str+=gi.toString()+"\n";
       }
       
      return str;
   }
}
