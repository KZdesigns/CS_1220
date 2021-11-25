import java.text.DecimalFormat;
/**
DedicatedCloud - Inheritance working with parent and children classes.
Project_4
@author Kyle Zimmerman - CS 1220
@version 11/6/2021
*/

public class DedicatedCloud extends CloudStorage {
   
   private double serverCost;
   
   /**
   DedicatedCloud constructor accepts 3 params and calls super.
   @param nameIn variable passed to super class.
   @param storageCostIn passed to super class.
   @param serverCostIn set to serverCost field.
   */
   public DedicatedCloud(String nameIn, double storageCostIn, 
      double serverCostIn) {
      super(nameIn, storageCostIn);
      
      setServerCost(serverCostIn);
   }
   
   /**
   getServerCost accepts no params returns server cost.
   @return server cost field.
   */
   public double getServerCost() {
      return serverCost;
   }
   
   /**
   setServerCost accepts a double params sets the server cost field.
   @param serverCostIn representing the server cost.
   */
   public void setServerCost(double serverCostIn) {
      serverCost = serverCostIn;
   }
   
   /**
   monthlyCost no params return a double representing the cost.
   @return monthly cost of cloud storage.
   */
   public double monthlyCost() {
      return baseStorageCost + getServerCost();
   }
   
   /**
   toString returns a string describing the object.
   @return string describing the object.
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
   
      String output = super.toString() 
         + "\nServer Cost: " + df.format(serverCost);
      return output;
   }
}