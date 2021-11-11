/**
InventoryItem - Inheritance working with parent and children classes.
Activity_5
@author Kyle Zimmerman - CS 1220
@version 10/31/2021
*/

public class InventoryItem {
   
   protected String name = "";
   protected double price = 0;
   private static double taxRate = 0;
   
   /**
   constructor method creating an inventoryItem.
   @param nameIn a string for the name of the item.
   @param priceIn a double for the price.
   */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
   
   /**
   getName returns the name of the item.
   @return name string for name variable.
   */
   public String getName() {
      return name;
   }
   
   /**
   calculateCost takes the price and adds the tax.
   @return the cost of the item including tax.
   */
   public double calculateCost() {
      return price * (1 + taxRate);
   }
   
   /**
   setTaxRate sets the tax rate of the item.
   @param taxRateIn in a double to be set as the tax rate.
   */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn; 
   }
   
   /**
   toString returns string representing the item.
   @return a string format of the item.
   */
   public String toString() {
      return name + ": $" + calculateCost();
   }

}