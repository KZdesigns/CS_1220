import org.junit.Assert;
// import static org.junit.Assert.*;
// import org.junit.Before;
import org.junit.Test;

/**
PublicCloud - Inheritance working with parent and children classes.
Project_4
@author Kyle Zimmerman - CS 1220
@version 11/6/2021
*/
public class PublicCloudTest {

   private PublicCloud c4 = new PublicCloud("Cloud Four", 9.00, 25.0, 20.0);

   /**
   monthlyCost method test.
   */
   @Test public void monthlyCostTest() {
      double monthlyCost = c4.monthlyCost();
      
      Assert.assertEquals(19.0, monthlyCost, 0.001);
   }
   
   /**
   getCostFactor method text.
   */
   @Test public void getCostFactorTest() {
      Assert.assertEquals(c4.getCostFactor(), 2.0, 0.001);
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
