/**
InventoryApp - Inheritance working with parent and children classes.
Activity_4
@author Kyle Zimmerman - CS 1220
@version 10/31/2021
*/

public class InventoryApp {
   
   /**
   main method for inventory app.
   @param args array of string args.
   */
   public static void main(String[] args) {
      
      InventoryItem.setTaxRate(0.05);
      
      InventoryItem item1 = new InventoryItem("Oil change kit", 39.00);
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80.00, 1.8);
      OnlineArticle item3 = new OnlineArticle("Java News", 8.50);
      item3.setWordCount(700);
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
      item4.setAuthor("L. G. Jones");
      
      System.out.println(item1);
      System.out.println(item2);
      System.out.println(item3);
      System.out.println(item4);
      
   }

}