import org.junit.Assert;
// import static org.junit.Assert.*;
// import org.junit.Before;
import org.junit.Test;

/**
* SpherocylinderTest - working with static variables and methods, and JUnit.
* Project 2
* @author Kyle Zimmerman - CS 1220
* @version 10/24/2021
*/

public class SpherocylinderTest {

    /**
    getLabelTest for getter method. 
    */
   @Test public void getLabelTest() {
      Spherocylinder s = new Spherocylinder("Example 1", 0.5, 0.25);
      Assert.assertEquals("Getter Error", "Example 1", s.getLabel());
   }
    
    /**
    getRadiusTest for getter method on Radius field. 
    */
   @Test public void getRadiusTest() {
      Spherocylinder s = new Spherocylinder("Example 1", 0.5, 0.25);
      Assert.assertEquals("Getter Error", 0.5, s.getRadius(), .000001);
   }
      
    /**
    getCylinderHeightTest for getter method on cylinderHeight field. 
    */
   @Test public void getCylinderHeightTest() {
      Spherocylinder s = new Spherocylinder("Example 1", 0.5, 0.25);
      Assert.assertEquals("Getter Error", 0.25, s.getCylinderHeight(), .000001);
   }
   
    /**
    setLabelTest for setter method on label field.
    */
   @Test public void setLabelTest() {
      Spherocylinder s = new Spherocylinder("Example 1", 0.5, 0.25);
      Assert.assertEquals("Getter Error", "Example 1", s.getLabel());
      s = new Spherocylinder(null, 0.5, 0.25);
      Assert.assertEquals("Getter Error", "", s.getLabel());
   }
      
    /**
    setRadiusTest for setter method on radius field.
    */
   @Test public void setRadiusTest() {
      Spherocylinder s = new Spherocylinder("Example 1", 0.5, 0.25);
      Assert.assertEquals("Setter Error", true, s.setRadius(0.6));
      s = new Spherocylinder("Example 1", 0.5, 0.25);
      Assert.assertEquals("Setter Error", false, s.setRadius(-1.0));
   }
   
    /**
    setCylinderHeightTest for setter method on cylinderHeight field. 
    */
   @Test public void setCylinderHeightTest() {
      Spherocylinder s = new Spherocylinder("Example 1", 0.5, 0.25);
      Assert.assertEquals("Setter Error", true, s.setCylinderHeight(0.30));
      s = new Spherocylinder("Example 1", 0.5, 0.25);
      Assert.assertEquals("Setter Error", false, s.setCylinderHeight(-1.0));
   }  
   
     /**
     circumferenceTest for testing the circumference method calculation.
     */
   @Test public void circumferenceTest() {
      Spherocylinder s = new Spherocylinder("Example 1", 0.5, 0.25);
      Assert.assertEquals("Calculation Error", 3.142, s.circumference(), .001);
   
   }
   
   /**
   surfaceAreaTest testing the surfaceArea test method calculation.
   */
   @Test public void surfaceAreaTest() {
      Spherocylinder s = new Spherocylinder("Example 1", 0.5, 0.25);
      Assert.assertEquals("Calculation Error", 3.927, s.surfaceArea(), .001);
   }
   
   /**
   volumeTest for volume method calculation.
   */
   @Test public void volumeTest() {
      Spherocylinder s = new Spherocylinder("Example 1", 0.5, 0.25);
      Assert.assertEquals("Calculation Error", 0.72, s.volume(), .01);
   }
   
   /**
   toStringTest the output to ensure its correct.
   */
   @Test public void toStringTest() {
      Spherocylinder s = new Spherocylinder("Example 1", 0.5, 0.25);
      Assert.assertTrue(s.toString().contains("\"Example 1\""));
   }
   
   /**
   getCountTest tes getCount to ensure it return the correct value.
   */
   @Test public void getCountTest() {
      Spherocylinder s = new Spherocylinder("Example 1", 0.5, 0.25);
      Assert.assertEquals("Count Error", 54, s.getCount());
   }
   
   /**
   resetCountTest test the static method to reset count variable.
   */
   @Test public void resetCountTest() {
      Spherocylinder.resetCount();
      Assert.assertEquals("Reset Count Error", 0, Spherocylinder.getCount());
   }
   
   /**
   equalsTest for the equals method returning the correct boolean.
   */
   @Test public void equalsTest() {
      Spherocylinder s = new Spherocylinder("Example 1", 0.5, 0.25);
      Spherocylinder t = new Spherocylinder("Example 2", 0.5, 0.25);
      Assert.assertEquals("EqualsError", false, s.equals(t));
      t = new Spherocylinder("Example 1", 0.6, 0.25);
      Assert.assertEquals("EqualsError", false, s.equals(t));
      t = new Spherocylinder("Example 1", 0.5, 0.35);
      Assert.assertEquals("EqualsError", false, s.equals(t));
      String a = "Test";
      Assert.assertEquals("EqualsError", false, s.equals(a));
      t = new Spherocylinder("Example 1", 0.5, 0.25);
      Assert.assertEquals("EqualsError", true, s.equals(t));   
   }
   
   /**
   hashCode test for to ensure hash code method returns zero.
   */
   @Test public void hashCodeTest() {
      Spherocylinder s = new Spherocylinder("Example 1", 0.5, 0.25);
      Assert.assertEquals("Error with hashCode", 0, s.hashCode());
   }
   
   /**
   compareTo test for compare to method works properly.
   */
   @Test public void compareTo() {
      Spherocylinder s = new Spherocylinder("Example 1", 0.2, 0.25);
      Spherocylinder t = new Spherocylinder("Example 1", 0.5, 0.25);
      Assert.assertEquals(-1, s.compareTo(t));
      s = new Spherocylinder("Example 1", 0.6, 0.25);
      Assert.assertEquals(1, s.compareTo(t));
      s = new Spherocylinder("Example 1", 0.5, 0.25);
      Assert.assertEquals(0, s.compareTo(t));
   }

   /** Fixture initialization (common initialization
    *  for all tests). **/
   // @Before public void setUp() {
   // }


   /** A test that always fails. **/
   // @Test public void defaultTest() {
      // Assert.assertEquals("Default test added by jGRASP. Delete "
         //    + "this test once you have added your own.", 0, 1);
   // }
}
