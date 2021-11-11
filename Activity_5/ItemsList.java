/**
ItemList - Polymorphism.
Project_5
@author Kyle Zimmerman - CS 1220
@version 11/8/2021
*/

public class ItemsList {

   private InventoryItem[] inventory;
   private int count;
   
   /**
   Constructor creating new item list objects.
   */
   public ItemsList() {
   
      inventory = new InventoryItem[20];
      count = 0;
   
   }
   
   /**
   adds an item to the inventory array.
   @param itemIn represents an item to be added to the array.
   */
   public void addItem(InventoryItem itemIn) {
   
      inventory[count] = itemIn;
      count++;
   
   }
   
   /**
   Calculates the total cost for the items array.
   @param electronicsSurcharge double representing the surcharge amount.
   @return total vost of the items including any surcharges.
   */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         } else {
            total += inventory[i].calculateCost();
         }
      }
      
      return total;
   }
   
   /**
   toString method overrides inherited toString.
   @return string that prints each item on a new line.
   */
   public String toString() {
      String output = "All inventory: \n\n";
      
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      
      return output;
   }
   
}