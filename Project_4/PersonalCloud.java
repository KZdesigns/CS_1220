/**
SharedCloud - Inheritance working with parent and children classes.
Project_4
@author Kyle Zimmerman - CS 1220
@version 11/6/2021
*/

public class PersonalCloud extends SharedCloud {
   
   /**
   class variable reps cost factor.
   */
   public static final double COST_FACTOR = 3.0;
   
   /**
   Constructor calls super and passes parameters to super.
   @param nameIn passed to super.
   @param storageCostIn passed to super.
   @param dataStoredIn passed to super.
   @param dataLimitIn passed to super.
   */
   public PersonalCloud(String nameIn, double storageCostIn, 
      double dataStoredIn, double dataLimitIn) {
      super(nameIn, storageCostIn, dataStoredIn, dataLimitIn);
   }
   
   /**
   getCostFactor method return cost factor.
   @return double cost factor.
   */
   public double getCostFactor() {
      return COST_FACTOR;
   }
   
   /**
   monthlyCost calculates monthly cost.
   @return double of monthly cost.
   */
   public double monthlyCost() {
      return baseStorageCost + dataOverage() * PersonalCloud.COST_FACTOR;
   }
   
}