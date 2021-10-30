/**
Scores - - working with arrays and interacting with them.
Activity 3
@author Kyle Zimmerman - CS - 1220
@version 10/27/2021
*/
public class Scores {

   private int[] numbers;
   
   /**
   Scores constructor taks in array of ints.
   @param numbersIn an array of numbers.
   */
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }
   
   /**
   findEvens returns an array of even numbers.
   @return evens an array of even numbers.
   */
   public int[] findEvens() {
      int numberEvens = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         } 
      }
      
      int[] evens = new int[numberEvens];
      
      int count = 0;
       
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
      
      return evens;
   }
   
   /**
   findOdds return an array of odd numbers.
   @return odds which an array of odd numbers.
   */
   public int[] findOdds() {
      int numberOdds = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            numberOdds++;
         }
      }
      
      int[] odds = new int[numberOdds];
      
      int count = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            odds[count] = numbers[i];
            count++;
         }
      }
      
      return odds;
   }
   
   /**
   calculateAverage returns a the average of the array.
   @return the average of the numbers array.
   */
   public double calculateAverage() {
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      
      return sum / (double) numbers.length;
   }
   
   /**
   toString returns a string constaining all the scores.
   @return the string value of each element in the numbers array.
   */
   public String toString() {
      String result = "";
      
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      
      return result;
   }
   
   /**
   toStringInReverse returns a string of scores in reverse.
   @return the string value of each element in reverse order.
   */
   public String toStringInReverse() {
      String result = "";
      
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      }
      
      return result;
   }
   

}

