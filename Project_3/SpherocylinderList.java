import java.text.DecimalFormat;

/**
Spherocylinder - working arrays.
Project 3
@author Kyle Zimmerman - CS 1220
S@version 10/29/2021
*/
public class SpherocylinderList {

   private String listName = "";
   private Spherocylinder[] list;
   private int listCount;
   
   /**
   Constructor method creates an instance of spherocylinderList.
   @param nameIn name of the list.
   @param listIn array of spherocylinder objects.
   @param listCountIn int number of objects in array.
   */
   public SpherocylinderList(String nameIn, 
      Spherocylinder[] listIn, int listCountIn) {
   
      listName = nameIn;
      list = listIn;
      listCount = listCountIn;
   }
   
   /**
   getName method return the string value of name.
   @return listName of the object.
   */
   public String getName() {
      return listName;
   }
   
   /**
   numberOfSpherocylinders return an in for the number of objects.
   @return int listCount number of objects in list.
   */
   public int numberOfSpherocylinders() {
      return listCount;
   }
   
   /**
   totalSurfaceArea calculates the total surface area of the objects.
   @return the total surfaceArea.
   */
   public double totalSurfaceArea() {
      double total = 0;
      
      int index = 0;
      while (index < listCount) {
         total += list[index].surfaceArea();
         index++;
      }
      
      return total;
   }
   
   /**
   totalVolume calculates the total volume of the objects.
   @return the total volume.
   */
   public double totalVolume() {
      double total = 0;
      
      int index = 0;
      while (index < listCount) {
         total += list[index].volume();
         index++;
      }
      
      return total;
   }
   
   /**
   averageSurfaceArea calculates the average SA of the objects.
   @return the average SA.
   */
   public double averageSurfaceArea() {
      
      if (listCount == 0) {
         return 0;
      } else {
         return totalSurfaceArea() / listCount;
      }
   }
   
   /**
   averageSurfaceArea calculates the average SA of the objects.
   @return the average volume.
   */
   public double averageVolume() {
     
      if (listCount == 0) {
         return 0;
      } else {
         return totalVolume() / listCount;
      }
   }
   
   /**
   toString method converts object to string.
   @return an output string.
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + getName() + " -----";
      result += "\nNumber of Spherocylinders: " + numberOfSpherocylinders(); 
      result += "\nTotal Surface Area: " + df.format(totalSurfaceArea()); 
      result += "\nTotal Volume: " + df.format(totalVolume()); 
      result += "\nAverage Surface Area: " + df.format(averageSurfaceArea()); 
      result += "\nAverage Volume: " + df.format(averageVolume()); 
   
      return result;
   }
   
   /**
   getList return the list of objects.
   @return list of spherocylinder objects.
   */
   public Spherocylinder[] getList() {
      return list;
   }
   
   /**
   addSpherocylinder add an object to the list.
   @param label of the new object.
   @param radius of the new object.
   @param cylinderHeight of the new object.
   */
   public void addSpherocylinder(String label, 
      double radius, double cylinderHeight) {
      
      Spherocylinder newObj = new Spherocylinder(label, radius, cylinderHeight);
      Spherocylinder[] newArray = new Spherocylinder[listCount + 1];
      
      for (int i = 0; i < listCount; i++) {
         newArray[i] = list[i];
      }
      
      newArray[listCount] = newObj;
      
      list = newArray;
      listCount++;
   }
   
   /**
   findSpherocylinder looks for a matching object.
   @param label to match in list.
   @return the matching object or null if not found.
   */
   public Spherocylinder findSpherocylinder(String label) {
      Spherocylinder output = null;
      
      for (int i = 0; i < listCount; i++) {
         if (list[i].getLabel().equalsIgnoreCase(label)) {
            output = list[i];
         }         
      }
      
      return output;
   }
   
   /**
   deleteSpherocylinder deletes an object from the list.
   @param label looking to delete from list.
   @return the deleted object or null if not found.
   */
   public Spherocylinder deleteSpherocylinder(String label) {
      Spherocylinder output = null;
      
      for (int i = 0; i < listCount; i++) {
         if (list[i].getLabel().equalsIgnoreCase(label)) {
            output = list[i];
            
            for (int j = i; j < listCount - 1; j++) {
               list[j] = list[j + 1];
            }
            
            list[listCount - 1] = null;
            listCount--;
            break;
         }
      }
      
      return output;
   }
   
   /**
   editSpherocylinder method that allows you to edit an object in the list.
   @param label to match.
   @param radius to be updated.
   @param cylinderHeight to be updated.
   @return boolean indicating whether the object has been edited.
   */
   public boolean editSpherocylinder(String label, 
      double radius, double cylinderHeight) {
      
      boolean output = false;
      
      for (int i = 0; i < listCount; i++) {
         if (list[i].getLabel().equalsIgnoreCase(label)) {
            list[i].setRadius(radius);
            list[i].setCylinderHeight(cylinderHeight);
            output = true;
         }
      }
      
      return output;
   }
   
   /**
   findSpherocylinderWithLargestVolume find obj with largest volume.
   @return object with largest volume.
   */
   public Spherocylinder 
      findSpherocylinderWithLargestVolume() {
      
      Spherocylinder output = null;
      
      if (listCount <= 0) {
      
         return output;
         
      } else {
         
         output = list[0];
         for (int i = 0; i < listCount; i++) {
            if (output.volume() < list[i].volume()) {
               output = list[i];
            }
         }
      
      }
      
      return output;
   }
   
   
   
   
   
   
   
   
   
   
   
   

}