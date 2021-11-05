/**
ElectronicsItem - Inheritance working with parent and children classes.
Activity_4
@author Kyle Zimmerman - CS 1220
@version 10/31/2021
*/
public class ElectronicsItem extends InventoryItem {
   
   /**
   class variable representing the shipping rate.
   */
   public static final double SHIPPING_COST = 1.5;
   protected double weight = 0;
   
   /**
   Constrctor method calls super extends the InventoryItem.
   @param nameIn name of the item.
   @param priceIn price of the item.
   @param weightIn weight of the item.
   */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      
      weight = weightIn;
   }
   
   /**
   calculateCost calculates the cost of an electronic item.
   @return the cost of the item plus shipping.
   */
   public double calculateCost() {
      
      return super.calculateCost() + (SHIPPING_COST * weight);
      
   }

}