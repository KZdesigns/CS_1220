/**
InvalidCategoryException custom exception for handling an invalid type.
Project 6
@author Kyle Zimmerman - CS 1220
@version 11/18/21
*/
public class InvalidCategoryException extends Exception {
   
   /**
   InvalidCategoryException call super and passes categoryIn.
   @param categoryIn the category type for the invalid record.
   */
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + categoryIn);
   }

}