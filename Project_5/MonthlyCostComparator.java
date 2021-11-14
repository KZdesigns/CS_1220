import java.util.Comparator;
/**
MonthlyCostComparator - Inheritance working with parent and children classes.
Project_5
@author Kyle Zimmerman - CS 1220
@version 11/13/2021
*/

public class MonthlyCostComparator implements Comparator<CloudStorage> {
   
   /**
   compare two cloud storage object based on monthly cost.
   @param c1 - first cloud storage object being compared.
   @param c2 - second cloud storage object being compared.
   @return a int value depending on the comparison.
   */
   public int compare(CloudStorage c1, CloudStorage c2) {
      if (c1.monthlyCost() > c2.monthlyCost()) {
         return -1;
      } else if (c1.monthlyCost() < c2.monthlyCost()) {
         return 1;
      } else {
         return 0;
      } 
   }
}