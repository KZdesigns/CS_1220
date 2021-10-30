import org.junit.Assert;
// import static org.junit.Assert.*;
// import org.junit.Before;
import org.junit.Test;

/**
* SpherocylinderListTest - arrays and JUnit.
* Project 3
* @author Kyle Zimmerman - CS 1220
* @version 10/29/2021
*/

public class SpherocylinderListTest {

   private Spherocylinder s = new Spherocylinder("Example 1", 0.5, 0.25);
   private Spherocylinder m = new Spherocylinder("Example 2", 10.8, 10.1);
   private Spherocylinder l = new Spherocylinder("Example 3", 98.32, 99.0);
   private Spherocylinder[] list = {s, m, l};
   private SpherocylinderList testList = 
      new SpherocylinderList("TestList", list, 3);
   
   private Spherocylinder[] eList = {}; 
   private SpherocylinderList emptyList 
      = new SpherocylinderList("Empty", eList, 0);

   /**
   getName method test.
   */
   @Test public void getNameTest() {
      String name = testList.getName();
      Assert.assertEquals("Getter Error", "TestList", name);
   }
   
   /**
   numberOfSpherocylinders method test.
   */
   @Test public void numberOfSpherocylindersTest() {
      int count = testList.numberOfSpherocylinders();
      Assert.assertEquals(3, count);
   }

   /**
   totalSurfaceArea method Test.
   */
   @Test public void totalSurfaceAreaTest() {
      double total = s.surfaceArea() + m.surfaceArea() + l.surfaceArea();
      double totalSA = testList.totalSurfaceArea();
      Assert.assertEquals(total, totalSA, 0.0001);
   }
   
   /**
   totalVolume method Test.
   */
   @Test public void totalVolumeTest() {
      double total = s.volume() + m.volume() + l.volume();
      double totalV = testList.totalVolume();
      Assert.assertEquals(total, totalV, 0.0001);
   }
   
   /**
   averageSurfaceArea method test.
   */
   @Test public void averageSurfaceAreaTest() {
      Assert.assertEquals(emptyList.averageSurfaceArea(), 0, 0.0001);
      Assert.assertEquals(testList.averageSurfaceArea(), 61596.809, 0.01);
   }
   
   /**
   averageVolume method test.
   */
   @Test public void averageVolumeTest() {
      Assert.assertEquals(emptyList.averageVolume(), 0, 0.0001);
      Assert.assertEquals(testList.averageVolume(), 2332244.347, 0.01);
   }
   
   /**
   toString method test.
   */
   @Test public void toStringTest() {
      Assert.assertTrue(testList.toString()
         .contains("----- Summary for TestList -----"));
      Assert.assertTrue(testList.toString()
         .contains("Number of Spherocylinders: 3"));
      Assert.assertTrue(testList.toString()
         .contains("Total Surface Area: 184,790.426"));
      Assert.assertTrue(testList.toString()
         .contains("Total Volume: 6,996,733.041"));
      Assert.assertTrue(testList.toString()
         .contains("Average Surface Area: 61,596.809"));
      Assert.assertTrue(testList.toString()
         .contains("Average Volume: 2,332,244.347"));
   }
   
   /**
   getList method test.
   */
   @Test public void getListTest() {
      Assert.assertArrayEquals(testList.getList(), list);
   }
   
   /**
   addSpherocylinder method test.
   */
   @Test public void addSpherocylinderTest() {
      testList.addSpherocylinder("New", 10, 10);
      int index = testList.numberOfSpherocylinders() - 1;
      Assert.assertEquals("New", testList.getList()[index].getLabel());
   }

   
   /**
   findSpherocylinder method test.
   */
   @Test public void findSpherocylingerTest() {
      Spherocylinder found = testList.findSpherocylinder("Example 1");
      Assert.assertEquals(s, found);
      found = testList.findSpherocylinder("Example 10");
      Assert.assertEquals(null, found);  
   }
   
   /**
   deleteSpherocylinder method test.
   */
   @Test public void deleteSpherocylinderTest() {
      Spherocylinder delete = testList.deleteSpherocylinder("example 2");
      Assert.assertEquals(testList.numberOfSpherocylinders(), 2);
      delete = testList.deleteSpherocylinder("Example 10");
      Assert.assertEquals(null, delete);
   }
   
   /**
   editSpherocylinder method test.
   */
   @Test public void editSpherocylinderTest() {
      boolean edited = testList.editSpherocylinder("Example 3", 90, 90);
      Assert.assertEquals(true, edited);
      edited = testList.editSpherocylinder("Example 4", 90, 90);
      Assert.assertEquals(false, edited); 
   }
   
   /**
   findSpherocylinderWithLargestVolume method test.
   */
   @Test public void findSpherocylinderWithLargestVolume() {
      Spherocylinder largestVolume = testList
         .findSpherocylinderWithLargestVolume();
      Assert.assertEquals("Example 3", largestVolume.getLabel());
      largestVolume = emptyList.findSpherocylinderWithLargestVolume();
      Assert.assertEquals(null, largestVolume); 
   }

/*
 Spherocylinder s = new Spherocylinder("Example 1", 0.5, 0.25);
 Spherocylinder m = new Spherocylinder("Example 2", 10.8, 10.1);
 Spherocylinder l = new Spherocylinder("Example 3", 98.32, 99.0);
 Spherocylinder[] list = {s, m, l};
 SpherocylinderList testList = 
          new SpherocylinderList("TestList", list, 3);
          
*/


// 
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
