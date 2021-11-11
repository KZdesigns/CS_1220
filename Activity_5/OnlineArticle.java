/**
OnlineArticle - Inheritance working with parent and children classes.
Activity_5
@author Kyle Zimmerman - CS 1220
@version 10/31/2021
*/

public class OnlineArticle extends OnlineTextItem {

   private int wordCount;
   
   /**
   OnlineArticle create an object of type onlinearticle.
   @param nameIn name of item.
   @param priceIn price of item.
   */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      
      wordCount = 0;
   }
   
   /**
   setter method for wordcount variable.
   @param countIn of words in the article. 
   */
   public void setWordCount(int countIn) {
   
      wordCount = countIn;
   }


}