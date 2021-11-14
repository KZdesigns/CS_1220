import java.io.FileNotFoundException;

/**
CloudStoragePart2 - Inheritance working with parent and children classes.
Project_5
@author Kyle Zimmerman - CS 1220
@version 11/13/2021
*/
public class CloudStoragePart2 {
   
   /**
   Main method creates storage list and prints reports.
   @param args - takes in file name from command line.
   @throws FileNotFoundException if no file is found.
   */
   public static void main(String[] args) throws FileNotFoundException {
   
      if (args.length <= 0) {
         String output = "File name expected as command line argument.";
         output += "\nProgram ending.";
         System.out.println(output);
      } else {
         CloudStorageList storageList = new CloudStorageList();
         storageList.readFile(args[0]);
         System.out.print(storageList.generateReport());
         System.out.print(storageList.generateReportByName());
         System.out.print(storageList.generateReportByMonthlyCost());
      }
   }
}