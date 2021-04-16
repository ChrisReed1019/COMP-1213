import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Cone List Class.
 *
 * @author Chris Reed - COMP-1213
 * @version 2-18-2021
 */
public class ConeList {
   //instance variables
   private ArrayList<Cone> coneList;
   private String name;

   //constructors

   /**
    * Contructor of ConeList.
    * @param nameIn Name variable.
    * @param coneListIn Arraylist of cones.
    */
   public ConeList(String nameIn, ArrayList<Cone> coneListIn) {
      coneList = coneListIn;
      name = nameIn;
   }

   //methods
   public String getName() { return name; }

   public int numberOfCones() { return coneList.size(); }

   public ArrayList<Cone> getList() { return coneList; }

   /**
    * Finds cone in ConeList.
    * @param label Label of cone to be found(case insensitive).
    * @return Returns cone if found, null if not found.
    */
   public Cone findCone(String label) {
      for (Cone cone : coneList) {
         if (cone.getLabel().equalsIgnoreCase(label)) {
            return cone;
         }
      }
      return null;
   }

   /**
    * Finds cone in ConeList and deletes it.
    * @param label Label of cone to be found amd deleted(case insensitive).
    * @return Returns cone if found, null if not found.
    */
   public Cone deleteCone(String label) {
      for (Cone cone : coneList) {
         if (cone.getLabel().equalsIgnoreCase(label)) {
            coneList.remove(cone);
            return cone;
         }
      }
      return null;
   }

   /**
    * Finds cone in ConeList and edits it.
    * @param label Label of cone to be found amd edited(case insensitive).
    * @param height Height to be edited.
    * @param radius Radius to be edited.
    * @return Returns true if found, false if not found.
    */
   public boolean editCone(String label, double height, double radius) {
      for (Cone cone : coneList) {
         if (cone.getLabel().equalsIgnoreCase(label)) {
            cone.setRadius(radius);
            cone.setHeight(height);
            return true;
         }
      }
      return false;
   }

   /**
    * Adds cone to ConeList.
    * @param label Label of cone.
    * @param height Height of cone.
    * @param radius Radius of cone.
    */
   public void addCone(String label, double height, double radius) {
      coneList.add(new Cone(label, height, radius));
   }

   /**
    * Reads file and returns cone list object based on formatted data.
    * @param file File to be read.
    * @return ConeList object of read file.
    * @throws IOException IOException can be thrown.
    */
   public ConeList readFile(String file) throws IOException {
      Scanner fileInput = new Scanner(file);
      ArrayList<Cone> tempList = new ArrayList<Cone>();

      String listName = fileInput.nextLine();
      while (fileInput.hasNextLine()) {
         Cone tempCone = new Cone(fileInput.nextLine(),
                 Double.parseDouble(fileInput.nextLine()),
                 Double.parseDouble(fileInput.nextLine()));
         tempList.add(tempCone);
      }

      return new ConeList(listName, tempList);
   }

   /**
    * Method to return total base perimeter.
    * @return Returns total base perimeter.
    */
   public double totalBasePerimeter() {
      double total = 0;
      for (Cone cone : coneList) {
         total += cone.basePerimeter();
      }
      return total;
   }

   /**
    * Method to return total base area.
    * @return Returns total base area.
    */
   public double totalBaseArea() {
      double total = 0;
      for (Cone cone : coneList) {
         total += cone.baseArea();
      }
      return total;
   }

   /**
    * Method to return total slant height.
    * @return Returns total slant height.
    */
   public double totalSlantHeight() {
      double total = 0;
      for (Cone cone : coneList) {
         total += cone.slantHeight();
      }
      return total;
   }

   /**
    * Method to return total side area.
    * @return Returns total side area.
    */
   public double totalSideArea() {
      double total = 0;
      for (Cone cone : coneList) {
         total += cone.sideArea();
      }
      return total;
   }

   /**
    * Method to return total surface area.
    * @return Returns total surface area.
    */
   public double totalSurfaceArea() {
      double total = 0;
      for (Cone cone : coneList) {
         total += cone.surfaceArea();
      }
      return total;
   }

   /**
    * Method to return total volume.
    * @return Returns total volume.
    */
   public double totalVolume() {
      double total = 0;
      for (Cone cone : coneList) {
         total += cone.volume();
      }
      return total;
   }

   /**
    * Method to return average surface area.
    * @return Returns average surface area.
    */
   public double averageSurfaceArea() {
      double total = 0;
      for (Cone cone : coneList) {
         total += cone.surfaceArea();
      }
      if (coneList.size() > 0) {
         return total / coneList.size();
      } else {
         return 0;
      }
   }

   /**
    * Method to return average volume.
    * @return Returns average volume.
    */
   public double averageVolume() {
      double total = 0;
      for (Cone cone : coneList) {
         total += cone.volume();
      }
      if (coneList.size() > 0) {
         return total / coneList.size();
      } else {
         return 0;
      }
   }

   /**
    * Returns string output of class.
    * @return String output of class.
    */
   public String toString() {
      String output = name + "\n\n";
      for (Cone cone : coneList) {
         output += cone.toString();
         output += "\n\n";
      }
      return output;
   }

   /**
    * Summary of arraylist of cones.
    * @return String of summary.
    */
   public String summaryInfo() {
      DecimalFormat decimalFormat = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + name + " -----\n";
      output += "Number of Cones: " + coneList.size() + "\n";
      output += "Total Base Perimeter: "
              + decimalFormat.format(totalBasePerimeter()) + "\n";
      output += "Total Base Area: "
              + decimalFormat.format(totalBaseArea()) + "\n";
      output += "Total Slant Height: "
              + decimalFormat.format(totalSlantHeight()) + "\n";
      output += "Total Side Area: "
              + decimalFormat.format(totalSideArea()) + "\n";
      output += "Total Surface Area: "
              + decimalFormat.format(totalSurfaceArea()) + "\n";
      output += "Total Volume: "
              + decimalFormat.format(totalVolume()) + "\n";
      output += "Average Surface Area: "
              + decimalFormat.format(averageSurfaceArea()) + "\n";
      output += "Average Volume: "
              + decimalFormat.format(averageVolume());
      return output;
   }
}