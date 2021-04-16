import java.text.DecimalFormat;

/**
 * Tetrahedron class.
 *
 * @author Chris Reed - COMP-1213
 * @version 3-10-2021
 */
public class Tetrahedron {
   private String label = "";
   private double edge = 0;
   private static int count = 0;

   /**
    * Default tetrahedron constructor.
    * @param labelIn Label of tetrahedron.
    * @param edgeIn Edge length of tetrahedron.
    */
   public Tetrahedron(String labelIn, double edgeIn) {
      setLabel(labelIn);
      setEdge(edgeIn);
      count++;
   }

   /**
    * Sets the variable label as labelIn.
    * @param labelIn Label to be set.
    * @return True if operation was successful, false if operation failed.
    */
   public Boolean setLabel(String labelIn) {
      if (labelIn == null || labelIn == "") {
         return false;
      } else {
         label = labelIn.trim();
         return true;
      }
   }

   /**
    * Returns a string variable label.
    * @return Returns the variable label.
    */
   public String getLabel() { return label; }

   /**
    * Sets the variable edge as edgeIn.
    * @param edgeIn Label to be set.
    * @return True if operation was successful, false if operation failed.
    */
   public Boolean setEdge(double edgeIn) {
      if (edgeIn >= 0) {
         edge = edgeIn;
         return true;
      } else {
         return false;
      }
   }

   /**
    * Returns a string variable edge.
    * @return Returns the variable edge.
    */
   public double getEdge() { return edge; }

   /**
    * Performs height calculation of tetrahedron.
    * @return Height of tetrahedron.
    */
   public double height() { return Math.sqrt(2.0 / 3) * edge; }

   /**
    * Performs surface area calculation of tetrahedron.
    * @return Surface area of tetrahedron.
    */
   public double surfaceArea() { return Math.sqrt(3) * Math.pow(edge, 2); }

   /**
    * Performs volume calculation of tetrahedron.
    * @return Volume of tetrahedron.
    */
   public double volume() { return Math.pow(edge, 3) / (6 * Math.sqrt(2)); }

   /**
    * Returns the static count variable.
    * @return Count variable.
    */
   public static int getCount() { return count; }

   /**
    * Sets the variable count back to 0.
    */
   public static void resetCount() { count = 0; }

   /**
    * Checks if object is equal to tetrahedron.
    * @param obj Object to be compared to current object.
    * @return True if object is equal false if it is not.
    */
   public boolean equals(Object obj) {
      if (!(obj instanceof Tetrahedron)) {
         return false;
      } else {
         Tetrahedron temp = (Tetrahedron) obj;
         return (label.equalsIgnoreCase(temp.getLabel())) 
                  && Math.abs(edge - temp.getEdge()) < .000001;
      }
   }

   /**
    * Required for equals method.
    * @return Returns int of 0.
    */
   public int hashCode() {
      return 0;
   }

   /**
    * Returns string of class info.
    * @return String of class info.
    */
   public String toString() {
      DecimalFormat decimalFormat = new DecimalFormat("#,##0.0##");
      String output = "Tetrahedron \"" + label;
      output += "\" with six edges of length ";
      output += decimalFormat.format(edge) + " has:\n";
      output += "\theight = " + decimalFormat.format(height()) + " units\n";
      output += "\tsurface area = ";
      output += decimalFormat.format(surfaceArea()) + " square units\n";
      output += "\tvolume = " + decimalFormat.format(volume());
      output += " cubic units\n";

      return output;
   }
}