/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceries;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author S519306
 */
public class GroceryDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("items.txt"));
        GroceryCart gc = new GroceryCart();
        while(sc.hasNext())
        {
            String str=sc.nextLine();
            if(str.equals("produce"))
            {
                String id = sc.nextLine();
                String desc=sc.nextLine();
                double priceperpound=Double.parseDouble(sc.nextLine());
                double weight=Double.parseDouble(sc.nextLine());
                
                Produce p1= new Produce(id, desc, priceperpound, weight);
                gc.addItem(p1);
                System.out.println(p1);
            } 
            
            if(str.equals("canned"))
            {
                String id1 = sc.nextLine();
                String desc1=sc.nextLine();
                double price=Double.parseDouble(sc.nextLine());
               CannedFood cf=new CannedFood(id1, desc1, price);
               gc.addItem(cf);
                System.out.println(cf);
            }
            
        }
        System.out.println("");
        gc.sortNaturalOrder();
        System.out.println(gc);
        gc.sortByPrice();
        System.out.println(gc);
        
    }
    
}
