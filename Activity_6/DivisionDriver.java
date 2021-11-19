import  javax.swing.JOptionPane;
/**
Division Driver Class driver class for division program.
Activity 6
@author Kyle Zimmerman - CS 1220
@version 11/16/21
*/
public class DivisionDriver {

   /**
   Main method for division, calls the division class methods.
   @param args - no args passed to main.
   */
   public static void main(String[] args) {
      String numInput
         = JOptionPane.showInputDialog("Enter the numerator:");
      String denomInput
         = JOptionPane.showInputDialog("Enter the denominator:");
         
      try {   
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
      
         String result = "Integer division: \n"
            + Division.intDivide(num, denom)
            + "\n\nFloating point division: \n"
            + Division.decimalDivide(num, denom);
         
         JOptionPane.showMessageDialog(null, result, 
            "Result", JOptionPane.PLAIN_MESSAGE);
      }
      catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null, 
            "Invalid input: enter numerical integer values only.", 
            "Error", JOptionPane.ERROR_MESSAGE);
      
      }
      catch (IllegalArgumentException e) {
         JOptionPane.showMessageDialog(null, e, 
            "Error", JOptionPane.ERROR_MESSAGE);
      }
   
   }

}