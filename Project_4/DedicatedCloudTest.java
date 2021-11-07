import org.junit.Assert;
// import static org.junit.Assert.*;
// import org.junit.Before;
import org.junit.Test;

/**
DedicatedCloud - Inheritance working with parent and children classes.
Project_4
@author Kyle Zimmerman - CS 1220
@version 11/6/2021
*/

public class DedicatedCloudTest {

   private DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
   
   /**
   monthlyCost Test.
   */
   @Test public void monthlyCostTest() {
      double monthlyCost = c1.monthlyCost();
      Assert.assertEquals(50.00, monthlyCost, 0.001);
   }
   
   /**
   toString test.
   */
   @Test public void toStringTest() {
      String testOutPut = "Cloud One (class DedicatedCloud)" 
         + " Monthly Cost: $50.00";
      testOutPut += "\nBase Storage Cost: $40.00";
      testOutPut += "\nServer Cost: $10.00";
      
      Assert.assertEquals(testOutPut, c1.toString());
   }
   
   /**
   getCount method test.
   */
   @Test public void getCountTest() {
      CloudStorage.resetCount();
      DedicatedCloud c6 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      Assert.assertEquals(CloudStorage.getCount(), 1);
   
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
