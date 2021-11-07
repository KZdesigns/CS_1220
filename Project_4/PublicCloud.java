/**
PublicCloud - Inheritance working with parent and children classes.
Project_4
@author Kyle Zimmerman - CS 1220
@version 11/6/2021
*/

public class PublicCloud extends SharedCloud {
   
   /**
   Class variable for cost factor.
   */
   public static final double COST_FACTOR = 2.0;
   
   /**
   PublicCloud class must contain a constructor that accepts four parameters.
   @param nameIn passed to super.
   @param storageCostIn passed to super.
   @param dataStoredIn passed to super.
   @param dataLimitIn passed to super.
   */
   public PublicCloud(String nameIn, double storageCostIn, 
      double dataStoredIn, double dataLimitIn) {
      super(nameIn, storageCostIn, dataStoredIn, dataLimitIn);
   }
   
   /**
   getCostFactor returns COST_FACTOR.
   @return COST_FACTOR double.
   */
   public double getCostFactor() {
      return COST_FACTOR;
   }
   
   /**
   monthlyCost calculates the monthly cost.
   @return double representing the monthly cost.
   */
   public double monthlyCost() {
      return baseStorageCost + dataOverage() * PublicCloud.COST_FACTOR;
   }
}