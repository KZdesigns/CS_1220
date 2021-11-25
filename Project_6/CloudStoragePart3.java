import java.io.FileNotFoundException;

/**
CloudStoragePart3 - accepts command line args and handles errors.
Project 6
@author Kyle Zimmerman - CS 1220
@version 11/18/21
*/
public class CloudStoragePart3 {
   
   /**
   Main program creates storageList and runs reports.
   @param args - file name from command line.
   */
   public static void main(String[] args) {
      if (args.length <= 0) {
         String output = "File name expected as command line argument.";
         output += "\nProgram ending.";
         System.out.println(output);
      } else {
         try {
            CloudStorageList storageList = new CloudStorageList();
            storageList.readFile(args[0]);
            System.out.print(storageList.generateReport());
            System.out.print(storageList.generateReportByName());
            System.out.print(storageList.generateReportByMonthlyCost());
            System.out.print(storageList.generateInvalidRecordsReport());
         }
         catch (FileNotFoundException err) {
            System.out.println("*** Attempted to read file: " 
               + args[0] + " (No such file or directory)");
         } 
      }
   }

}