import java.util.Arrays;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

/**
CloudStorageList - Inheritance working with parent and children classes.
Project_5
@author Kyle Zimmerman - CS 1220
@version 11/13/2021
*/
public class CloudStorageList {

   private CloudStorage[] storageList;
   private String[] invalidList;
   
   /**
   Contructor, CloudStorageList sets the cloudstorage/invalid array to 0.
   */
   public CloudStorageList() {
      storageList = new CloudStorage[0];
      invalidList = new String[0];
   }
   
   /**
   return the storageList array.
   @return the storageList array.
   */
   public CloudStorage[] getCloudStorageArray() {
      return storageList;
   }
   
   /**
   return the string array for invalid records.
   @return the invalid array.
   */
   public String[] getInvalidRecordsArray() {
      return invalidList;
   }
   
   /**
   addCloudStorage takes in a new eleement adds it to the end of the array.
   @param newElement new cloud storage object to be added.
   */
   public void addCloudStorage(CloudStorage newElement) {
      storageList = Arrays.copyOf(storageList, storageList.length + 1);
      storageList[storageList.length - 1] = newElement;
   }
   
   /**
   addInvalidRecord addes a new string to invalid array.
   @param newElement the invalid string. 
   */
   public void addInvalidRecord(String newElement) {
      invalidList = Arrays.copyOf(invalidList, invalidList.length + 1);
      invalidList[invalidList.length - 1] = newElement;
   }
   
   /**
   readFile reads csv file, populates array list.
   @param fileName - name of the csv.
   @throws FileNotFoundException when an incorrect file is provided.
   */
   public void readFile(String fileName) throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileName));
      
      
      while (scanFile.hasNext()) {
         String line = scanFile.nextLine();
         Scanner scanLine = new Scanner(line);
         scanLine.useDelimiter(",");
         
         char type = scanLine.next().toUpperCase().charAt(0);
         
         switch (type) {
         
            case 'D':
               String name = scanLine.next();
               String storage = scanLine.next();
               String server = scanLine.next();
               double storageCost = Double.parseDouble(storage);
               double serverCost = Double.parseDouble(server); 
               DedicatedCloud dcStorage = 
                  new DedicatedCloud(name, storageCost, serverCost);
               this.addCloudStorage(dcStorage);
               break; 
            case 'S':
               name = scanLine.next();
               storage = scanLine.next();
               String stored = scanLine.next();
               String limit = scanLine.next();
               storageCost = Double.parseDouble(storage);
               double dataStored = Double.parseDouble(stored);
               double dataLimit = Double.parseDouble(limit);
               SharedCloud scStorage = 
                  new SharedCloud(name, storageCost, dataStored, dataLimit);
               this.addCloudStorage(scStorage);
               break;
            case 'C':
               name = scanLine.next();
               storage = scanLine.next();
               stored = scanLine.next();
               limit = scanLine.next();
               storageCost = Double.parseDouble(storage);
               dataStored = Double.parseDouble(stored);
               dataLimit = Double.parseDouble(limit);
               PublicCloud pcStorage = 
                  new PublicCloud(name, storageCost, dataStored, dataLimit);
               this.addCloudStorage(pcStorage);
               break;
            case 'P':
               name = scanLine.next();
               storage = scanLine.next();
               stored = scanLine.next();
               limit = scanLine.next();
               storageCost = Double.parseDouble(storage);
               dataStored = Double.parseDouble(stored);
               dataLimit = Double.parseDouble(limit);
               PersonalCloud pStorage = 
                  new PersonalCloud(name, storageCost, dataStored, dataLimit);
               this.addCloudStorage(pStorage);
               break;
            default:
               break;    
         }
      }
      
   }
   
   /**
   generateReport prints the items in the array.
   @return output string for each element in the array.
   */
   public String generateReport() {
      String output = "-------------------------------";
      output += "\nMonthly Cloud Storage Report";
      output += "\n-------------------------------\n";
      
      for (CloudStorage storageItem : storageList) {
         output += storageItem + "\n\n";
      }
      
      return output;
   }
   
   /**
   generateReportByName return the report ordered by name.
   @return output report ordered by name.
   */
   public String generateReportByName() {
      String output = "-----------------------------------------";
      output += "\nMonthly Cloud Storage Report (by Name)";
      output += "\n-----------------------------------------\n";
      
      Arrays.sort(getCloudStorageArray());
      
      for (CloudStorage storageItem : storageList) {
         output += storageItem + "\n\n";
      }
      
      return output;
   }
   
   /**
   generateReportByMonthlyCost returns the report sorted by cost.
   @return output report ordered by monthly cost.
   */
   public String generateReportByMonthlyCost() {
      String output = "-------------------------------------------------";
      output += "\nMonthly Cloud Storage Report (by Monthly Cost)";
      output += "\n-------------------------------------------------\n";
      
      Arrays.sort(getCloudStorageArray(), new MonthlyCostComparator()); 
      
      for (CloudStorage storageItem : storageList) {
         output += storageItem + "\n\n";
      }
      
      return output;
   
   }

}
