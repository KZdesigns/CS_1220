/**
OnlineTextItem - Inheritance working with parent and children classes.
Activity_4
@author Kyle Zimmerman - CS 1220
@version 10/31/2021
*/

public abstract class OnlineTextItem extends InventoryItem {
   
   /**
   Constructor method for abstract class.
   @param nameIn name of item.
   @param priceIn price of item.
   */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   
   /**
   method calculates the price.
   @return the price of the item.
   */
   public double calculateCost() {
      return price;
   }
}