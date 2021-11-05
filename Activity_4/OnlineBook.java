/**
OnlineBook - Inheritance working with parent and children classes.
Activity_4
@author Kyle Zimmerman - CS 1220
@version 10/31/2021
*/

public class OnlineBook extends OnlineTextItem {

   protected String author;
   
   /**
   Constructor for onlinebook.
   @param nameIn name of item.
   @param priceIn price of item.
   */
   public OnlineBook(String nameIn, double priceIn) {
      
      super(nameIn, priceIn);
      
      author = "Author Not Listed";  
   }
   
   /**
   toString returns string rep. of the object.
   @return string that reps. the object.
   */
   public String toString() {
      String output = "";
      
      output += name + " - " + author + ": $" + price;
      
      return output;
   }
   
   /**
   setAuthor sets the author variable to the name passed.
   @param authorIn name of author of the book.
   */
   public void setAuthor(String authorIn) {
      
      author = authorIn;
      
   }

}