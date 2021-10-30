import java.text.DecimalFormat;

/**
* Spherocylinder - working with static variables and methods, and JUnit.
* Project 2
* @author Kyle Zimmerman - CS 1220
* @version 10/24/2021
*/

public class Spherocylinder implements Comparable<Spherocylinder> {

//class variable
   private static int count = 0;

//instance variables
   private String label = "";
   private double radius = 0;
   private double cylinderHeight = 0;

 /**
 Spherocylinder constructor method for creating spherocylinder objects.
 @param labelIn sets the label given to the object.
 @param radiusIn sets the radius given to the object.
 @param cylinderHeightIn sets the height given to the object.
 */
   public Spherocylinder(String labelIn, 
      double radiusIn, double cylinderHeightIn) {
      
      setLabel(labelIn);
      setRadius(radiusIn);
      setCylinderHeight(cylinderHeightIn);
      count++;   
   
   }
   
   /**
   getLabel accessor method returns the object label.
   @return the label string for the object.
   */
   public String getLabel() {
      return label;
   }
   
   /**
   setLabel setter method to set the label for the object.
   @param labelIn represents the label for the object.
   @return boolean indicating whether the label was set or not.
   */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      
      return false;
   }
   
   /**
   getRadius method gives access to the radius.
   @return radius a double representing the radius of the object.
   */
   public double getRadius() {
      return radius;
   }
   
   /**
   setRadius method sets the radius ofr the object.
   @param radiusIn the radius of the object being created.
   @return boolean whether is been set or not.
   */
   public boolean setRadius(double radiusIn) {
      if (radiusIn >= 0) {
         radius = radiusIn;
         return true;
      }
      
      return false;
   } 
   
   /**
   getCylinderHeight returns the double value for object height.
   @return cylinderHeight double value.
   */
   public double getCylinderHeight() {
      return cylinderHeight;
   }
   
   /**
   setCylinderHeight sets the cylinderHeight and returns a boolean.
   @param cylinderHeightIn is the double value being passed as the height.
   @return boolean indicating whether it was successful.
   */
   public boolean setCylinderHeight(double cylinderHeightIn) {
      if (cylinderHeightIn >= 0) {
         cylinderHeight = cylinderHeightIn;
         return true;
      }
      
      return false;
   }
   
   /**
   circumference finds the circumference of the object.
   @return a double variable c that equals the objects circumference.
   */
   public double circumference() {
      double c = 0;
      c = 2 * Math.PI * radius;
      return c;
   }
   
   /**
   surfaceArea calculates the SA of the object.
   @return a double variable sA that equals the SA of the object.
   */
   public double surfaceArea() {
      double sA = 0;
      sA = 2 * Math.PI * radius * (2 * radius + cylinderHeight);
      return sA;
   }
   
   /**
   volume calculates the volum of the object.
   @return a double variable v that equals the volume of the object.
   */
   public double volume() {
      double v = 0;
      v = Math.PI * Math.pow(radius, 2) 
         * ((4.0 / 3.0) * radius + cylinderHeight);
      return v;
   }
   
   /**
   toString method used print out object feilds.
   @return string value to represent the object.
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "";
      output = "Spherocylinder" + " \"" + getLabel() + "\""
         + " with radius " + df.format(getRadius()) + " and cylinder"
         + " height " + df.format(getCylinderHeight())
         + " has:" + "\n\tcircumference = " + df.format(circumference())
         + " units\n\tsurface area = " + df.format(surfaceArea())
         + " square units\n\tvolume = " + df.format(volume()) + " cubic units";
      return output;
   }
   
    /**
    equals method used to determine if two Spherocylinders are equal.
    @param obj pass in any object.
    @return boolean indicating whether the objects are equal.
    */
   public boolean equals(Object obj) {
      if (!(obj instanceof Spherocylinder)) {
         return false;
      } else {
         Spherocylinder d = (Spherocylinder) obj;
         return (label.equalsIgnoreCase(d.getLabel())
                  && Math.abs(radius - d.getRadius()) < .000001
                  && Math.abs(cylinderHeight - d.getCylinderHeight())
                     < .000001);
      }        
   }
   
   /**
   hashCode required by checkstyle when using equals.
   @return 0 as required.
   */
   public int hashCode() {
      return 0;
   }
   
   /**
   getCount class method that returns the count.
   @return int value for count number of objects created.
   */
   public static int getCount() {
      return count;
   }
   
   /**
   resetCount class method to reset count to 0.
   */
   public static void resetCount() {
      count = 0;
   }
   
   /**
   compareTo method implements the comparable interface.
   @param obj that is of type spherocylinder, object being compared.
   @return an int value rep. if the objects are less, greater, or equal to.
   */
   
   public int compareTo(Spherocylinder obj) {
      if (this.volume() < obj.volume()) {
         return -1;
      } else if (this.volume() > obj.volume()) {
         return 1;
      } else {
         return 0;
      }
   }
}