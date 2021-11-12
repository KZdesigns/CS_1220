import org.junit.Assert;
// import static org.junit.Assert.*;
// import org.junit.Before;
import org.junit.Test;

/**
SharedCloudTest - Inheritance working with parent and children classes.
Project_4
@author Kyle Zimmerman - CS 1220
@version 11/6/2021
*/
public class SharedCloudTest {

   private SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
   private SharedCloud c3 = new SharedCloud("Cloud Three", 9.00, 25.0, 20.0);
   
   /**
   dataOverage method test.
   */
   @Test public void dataOverageTest() {
      double overage2 = c2.dataOverage();
      double overage3 = c3.dataOverage();
      
      Assert.assertEquals(0, overage2, 0.001);
      Assert.assertEquals(5.0, overage3, 0.01);
   }
   
   /**
   monthlyCost method test.
   */
   @Test public void monthlyCostTest() {
      double monthlyCost = c2.monthlyCost();
      Assert.assertEquals(9.0, monthlyCost, 0.01);
   }
   
   /**
   toString method test.
   */
   @Test public void toStringTest() {
      String testOutput = "Cloud Two (class SharedCloud) Monthly Cost: $9.00";
      testOutput += "\nBase Storage Cost: $9.00";
      testOutput += "\nData Stored: 12.000 GB";
      testOutput += "\nData Limit: 20.000 GB";
      testOutput += "\nOverage: 0.000 GB";
      testOutput += "\nCost Factor: 1.0";
      
      Assert.assertEquals(testOutput, c2.toString());
   
   }



















//    /** Fixture initialization (common initialization
//     *  for all tests). **/
   // @Before public void setUp() {
   // }
// 
// 
//    /** A test that always fails. **/
   // @Test public void defaultTest() {
      // Assert.assertEquals("Default test added by jGRASP. Delete "
         //    + "this test once you have added your own.", 0, 1);
   // }
}
