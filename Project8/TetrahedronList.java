import java.text.DecimalFormat;

/**
 * Class for list of Tetrahedron objects.
 *
 * @author Chris Reed - COMP-1213
 * @version 3-21-2021
 */
public class TetrahedronList {
   private String name = "";
   private Tetrahedron[] array;
   private int numObjects = 0;

   /**
    * Default TetrahedronList constructor.
    * @param nameIn Label of Tetrahedron list.
    * @param arrayIn Tetrahedron array.
    * @param numObjectsIn Number of Tetrahedron objects.
    */
   public TetrahedronList(String nameIn,
                          Tetrahedron[] arrayIn, int numObjectsIn) {
      name = nameIn;
      array = arrayIn;
      numObjects = numObjectsIn;
   }

   /**
    * Returns name string.
    * @return Name string.
    */
   public String getName() { return name; }

   /**
    * Returns numObjects int.
    * @return NumObjects int.
    */
   public int numberOfTetrahedrons() { return numObjects; }

   /**
    * Returns total surface area of tetrahedrons.
    * @return Double of total tetrahedron surface area.
    */
   public double totalSurfaceArea() {
      double total = 0;
      for (Tetrahedron tetrahedron : array) {
         if (tetrahedron != null) {
            total += tetrahedron.surfaceArea();
         }
      }
      return total;
   }

   /**
    * Returns total volume of tetrahedrons.
    * @return Double of total tetrahedron volume.
    */
   public double totalVolume() {
      double total = 0;
      for (Tetrahedron tetrahedron : array) {
         if (tetrahedron != null) {
            total += tetrahedron.volume();
         }
      }
      return total;
   }

   /**
    * Returns average surface area of tetrahedrons.
    * @return Double of average tetrahedron surface area.
    */
   public double averageSurfaceArea() {
      double total = 0;
      for (Tetrahedron tetrahedron : array) {
         if (tetrahedron != null) {
            total += tetrahedron.surfaceArea();
         }
      }
      if (array.length != 0 && numObjects > 0) {
         return total / numObjects;
      } else {
         return 0;
      }
   }

   /**
    * Returns average volume of tetrahedrons.
    * @return Double of average tetrahedron volume.
    */
   public double averageVolume() {
      double total = 0;
      for (Tetrahedron tetrahedron : array) {
         if (tetrahedron != null) {
            total += tetrahedron.volume();
         }
      }
      if (array.length != 0 && numObjects > 0) {
         return total / numObjects;
      } else {
         return 0;
      }
   }

   /**
    * Returns tetrahedron array.
    * @return Tetrahedron array.
    */
   public Tetrahedron[] getList() { return array; }

   /**
    * Adds tetrahedron to array.
    * @param tetrahedron Tetrahedron to be added.
    */
   public void addTetrahedron(Tetrahedron tetrahedron) {
      if (tetrahedron != null) {
         Tetrahedron[] tempArray = new Tetrahedron[array.length + 1];
         int i = 0;
         for (Tetrahedron obj : array) {
            tempArray[i] = obj;
            i++;
         }
         tempArray[array.length] = tetrahedron;
         numObjects++;
         array = tempArray;
      }
   }

   /**
    * Adds tetrahedron to array.
    * @param label Label of tetrahedron to be added.
    * @param edge Edge length of tetrahedron to be added.
    */
   public void addTetrahedron(String label, double edge) {
      Tetrahedron tetrahedron = new Tetrahedron(label, edge);
      Tetrahedron[] tempArray = new Tetrahedron[array.length + 1];
      int i = 0;
      for (Tetrahedron obj : array) {
         tempArray[i] = obj;
         i++;
      }
      tempArray[array.length] = tetrahedron;
      numObjects++;
      array = tempArray;
   }

   /**
    * Finds tetrahedron based on label given.
    * @param label Label to compare tetrahedron to.
    * @return Tetrahedron object if found, null if not found.
    */
   public Tetrahedron findTetrahedron(String label) {
      for (Tetrahedron tetrahedron : array) {
         if (tetrahedron != null) {
            if (tetrahedron.getLabel().equalsIgnoreCase(label)) {
               return tetrahedron;
            }
         }
      }
      return null;
   }

   /**
    * Finds and deletes tetrahedron based on label given.
    * @param label Label to compare tetrahedron to.
    * @return Tetrahedron object if found and deleted, null if not found.
    */
   public Tetrahedron deleteTetrahedron(String label) {
      for (Tetrahedron tetrahedron : array) {
         if (tetrahedron != null) {
            if (tetrahedron.getLabel().equalsIgnoreCase(label)) {
               Tetrahedron[] tempArray = new Tetrahedron[array.length - 1];
               int i = 0;
               for (Tetrahedron obj : array) {
                  if (obj != tetrahedron) {
                     tempArray[i] = obj;
                     i++;
                  }
               }
               numObjects--;
               array = tempArray;
               return tetrahedron;
            }
         }
      }
      return null;
   }

   /**
    * Finds and edits tetrahedron based on label given.
    * @param label Label of tetrahedron to be edited.
    * @param edge Edge to be edited.
    * @return True if Tetrahedron object is
    * found and edited, false if not found.
    */
   public Boolean editTetrahedron(String label, double edge) {
      for (int i = 0; i < array.length; i++) {
         if (array[i].getLabel().equalsIgnoreCase(label)) {
            array[i].setEdge(edge);
            return true;
         }
      }
      return false;
   }

   /**
    * Finds tetrahedron with largest volume.
    * @return Tetrahedron object with largest volume.
    */
   public Tetrahedron findTetrahedronWithLargestVolume() {
      if (array.length != 0) {
         double max = 0;
         Tetrahedron maxTetrahedron = null;
         for (Tetrahedron tetrahedron : array) {
            if (tetrahedron != null) {
               max = array[0].getEdge();
               maxTetrahedron = array[0];
            }
         }
         for (Tetrahedron tetrahedron : array) {
            if (tetrahedron != null) {
               if (max < tetrahedron.getEdge()) {
                  max = tetrahedron.getEdge();
                  maxTetrahedron = tetrahedron;
               }
            }
         }
         return maxTetrahedron;
      } else {
         return null;
      }
   }

   /**
    * ToString override for TetrahedronList class.
    * @return String of TetrahedronList class.
    */
   public String toString() {
      DecimalFormat format = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + getName() + " -----\n";
      output += "Number of Tetrahedrons: " + numberOfTetrahedrons() + "\n";
      output += "Total Surface Area: " + format.format(totalSurfaceArea())
              + " square units\n";
      output += "Total Volume: " + format.format(totalVolume())
              + " cubic units\n";
      output += "Average Surface Area: "
              + format.format(averageSurfaceArea()) + " square units\n";
      output += "Average Volume: " + format.format(averageVolume())
              + " cubic units";

      return output;
   }
}