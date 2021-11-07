/**
CloudStoragePart1 - Inheritance working with parent and children classes.
Project_4
@author Kyle Zimmerman - CS 1220
@version 11/6/2021
*/

public class CloudStoragePart1 {
   
   /**
   main method driver program.
   @param args not used.
   */
   public static void main(String[] args) {
   
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
      SharedCloud c3 = new SharedCloud("Cloud Three", 9.00, 25.0, 20.0);
      PublicCloud c4 = new PublicCloud("Cloud Four", 9.00, 25.0, 20.0);
      PersonalCloud c5 = new PersonalCloud("Cloud Five", 9.00, 21.0, 20.0);
   
      System.out.print(c1 + "\n\n" + c2 + "\n\n" 
         + c3 + "\n\n" + c4 + "\n\n" + c5);
   }

}