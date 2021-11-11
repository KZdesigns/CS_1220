/**
InventoryListApp - Polymorphism.
Project_5
@author Kyle Zimmerman - CS 1220
@version 11/8/2021
*/

public class InventoryListApp {
   
   /**
   Method creates an invetory list and prints out itemsa & calculates total.
   @param args not used.
   */
   public static void main(String[] args) {
   
      ItemsList myItems = new ItemsList();
   
      InventoryItem.setTaxRate(0.05);
      
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      
      System.out.println(myItems);
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   
   }

}