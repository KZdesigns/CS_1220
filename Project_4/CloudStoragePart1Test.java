import org.junit.Assert;
// import static org.junit.Assert.*;
// import org.junit.Before;
import org.junit.Test;

/**
CloudStoragePart1 - Inheritance working with parent and children classes.
Project_4
@author Kyle Zimmerman - CS 1220
@version 11/6/2021
*/

public class CloudStoragePart1Test {

   /**
   Main method Test.
   */
   @Test public void mainTest() {
      CloudStorage.resetCount();
      CloudStoragePart1.main(null);
      Assert.assertEquals("CloudStorage count should be 5.", 
         5, CloudStorage.getCount());
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
