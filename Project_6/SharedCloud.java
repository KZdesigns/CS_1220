import java.text.DecimalFormat;
/**
SharedCloud - Inheritance working with parent and children classes.
Project_4
@author Kyle Zimmerman - CS 1220
@version 11/6/2021
*/

public class SharedCloud extends CloudStorage {

   protected double dataStored;
   protected double dataLimit;
   
   /**
   Class field representing the cost factor.
   */
   public static final double COST_FACTOR = 1.0;
   
   /**
   SharedCloud constructor creates an instance of the object and calls super.
   @param nameIn passed to super.
   @param storageCostIn passed to super.
   @param dataStoredIn set to the dataStored field.
   @param dataLimitIn set to the dataLimit field.
   */
   public SharedCloud(String nameIn, double storageCostIn, 
      double dataStoredIn, double dataLimitIn) {
      super(nameIn, storageCostIn);
      setDataStored(dataStoredIn);
      setDataLimit(dataLimitIn);
   }
   
   /**
   getDataStored returns the dataStored field.
   @return double representing data stored in GB.
   */
   public double getDataStored() {
      return dataStored;
   }
   
   /**
   setDataStored accepts double the data stored in GB, sets field.
   @param dataStoredIn double set to the field.
   */
   public void setDataStored(double dataStoredIn) {
      dataStored = dataStoredIn;
   }
   
   /**
   getDataLimit returns dataLimit feild.
   @return a double representing the data limit in GB.
   */
   public double getDataLimit() {
      return dataLimit;
   }
   
   /**
   setDataLimit sets the field and returns nothing.
   @param dataLimitIn sets to the field.
   */
   public void setDataLimit(double dataLimitIn) {
      dataLimit = dataLimitIn;
   }
   
   /**
   getCostFactor returns the COST_FACTOR.
   @return double representing the cost factor.
   */
   public double getCostFactor() {
      return COST_FACTOR;
   }
   
   /**
   dataOverage calculates the amount of data stored that exceeds the limit.
   @return double representing the amount of data stored exceeds the data limt.
   */
   public double dataOverage() {
      double overage;
      
      overage = dataStored - dataLimit;
      
      if (overage <= 0) {
         return 0;
      } else {
         return overage;
      }
   }
   
   /**
   monthlyCost calculates the monthly cost of storage.
   @return double representing the monthly cost.
   */
   public double monthlyCost() {
      return baseStorageCost + dataOverage() * SharedCloud.COST_FACTOR;
   }
   
   /**
   toString describes the object in a string.
   @return string representing the object.
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("0.000");
     
      String output = super.toString();
      
      output += "\nData Stored: " + df.format(getDataStored()) + " GB";
      output += "\nData Limit: " + df.format(getDataLimit()) + " GB";
      output += "\nOverage: " + df.format(dataOverage()) + " GB";
      output += "\nCost Factor: " + getCostFactor();
   
      return output;
   }
}