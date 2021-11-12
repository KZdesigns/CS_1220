import org.junit.Assert;
// import static org.junit.Assert.*;
// import org.junit.Before;
import org.junit.Test;

/**
SharedCloud - Inheritance working with parent and children classes.
Project_4
@author Kyle Zimmerman - CS 1220
@version 11/6/2021
*/

public class PersonalCloudTest {


   private PersonalCloud c5 = new PersonalCloud("Cloud Five", 9.00, 21.0, 20.0);
   
   /**
   monthlyTest method test.
   */
   @Test public void monthlyCostTest() {
      double monthlyCost = c5.monthlyCost();
      Assert.assertEquals(monthlyCost, 12.0, 0.001);
   }
   
   /**
   getCostFactor method text.
   */
   @Test public void getCostFactorTest() {
      Assert.assertEquals(c5.getCostFactor(), 3.0, 0.001);
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
