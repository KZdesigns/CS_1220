import java.text.DecimalFormat;
/**
CloudStorage - Inheritance working with parent and children classes.
Project_4
@author Kyle Zimmerman - CS 1220
@version 11/6/2021
*/

public abstract class CloudStorage {

   protected String name;
   protected double baseStorageCost;
   
   protected static int count = 0;
   
   /**
   Constructor accepts two params and assigns to instance varaibles.
   @param nameIn the name of the cloud storage.
   @param storageCostIn the base storage cost for the service.
   */
   public CloudStorage(String nameIn, double storageCostIn) {
   
      setName(nameIn);
      setBaseStorageCost(storageCostIn);
      count++;
   }
   
   /**
   getName getter method for name variable.
   @return string name field.
   */
   public String getName() {
      return name;
   }
   
   /**
   setName set method for field.
   @param nameIn sets the name of the field.
   */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
   /**
   getBaseStorageCost returns the base storage cost.
   @return double representing the BSC field.
   */
   public double getBaseStorageCost() {
      return baseStorageCost;
   }
   
   /**
   setBaseStorageCost sets the field.
   @param storageCostIn takes in a double for the BSC field.
   */
   public void setBaseStorageCost(double storageCostIn) {
      baseStorageCost = storageCostIn;
   }
   
   /**
   getCount returns the count field.
   @return count static variable for count of objects.
   */
   public static int getCount() {
      return count;
   }
   
   /**
   resetCount resets the count to zero.
   */
   public static void resetCount() {
      count = 0;
   }
   
   /**
   toString returns a string describing the object.
   @return string describing the object.
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
     
      String output = getName() + " " + "(" + this.getClass() + ") " 
         + "Monthly Cost: " + df.format(monthlyCost());
         
      output += "\nBase Storage Cost: " + df.format(getBaseStorageCost());
      
      return output;
   }
   
   /**
   monthlyCost abstract method representing the monthly cost.
   @return double representing the monthly cost.
   */
   public abstract double monthlyCost();    

}