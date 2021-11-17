/**
Division - Handle exceptions that can occur in 
   your program using a try-catch statement.
Activity 1
@author - Kyle Zimmerman CS 1220
@version - 11/16/21
*/

public class Division {
   
   /**
   intDivide takes in two ints and divides the numbers.
   @param numerator - int reps the numerator of the problem.
   @param denominator - int reps the denominator of the problem.
   @return answer the int value after the division takes place.
   */
   public static int intDivide(int numerator, int denominator) {
      int answer = 0;
      answer = numerator / denominator;  
      return answer;
   }
   
   /**
   decimalDivide takes in two ints and performs floating point division.
   @param numerator - int reps the numerator of the problem.
   @param denominator - reps the denominator of the problem.
   @return double answer. 
   */
   public static double decimalDivide(int numerator, int denominator) {
      double answer = 0;
      answer = (double) numerator / denominator;
      return answer;
   }


}