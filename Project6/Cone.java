import java.text.DecimalFormat;

/**
 * Class for cones.
 *
 * @author Chris Reed - COMP-1213
 * @version 2-10-2021
 */
public class Cone {
   //instance variables
   private String label = "";
   private double height = 0;
   private double radius = 0;

   //constructor

   /**
    * Constructor for cone class.
    * @param labelIn Label of cone.
    * @param heightIn Height of cone.
    * @param radiusIn Radius of cone.
    */
   public Cone(String labelIn, double heightIn, double radiusIn) {
      setLabel(labelIn);
      setHeight(heightIn);
      setRadius(radiusIn);
   }

   //methods
   /**
    * Returns label.
    *
    * @return Returns the variable label.
    */
   public String getLabel() { return label; }

   /**
    * Sets label as labelIn.
    *
    * @param labelIn String to set label as.
    * @return Whether process was successful or not.
    */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      } else {
         return false;
      }
   }

   /**
    * Returns height.
    *
    * @return Returns the variable height.
    */
   public double getHeight() { return height; }

   /**
    * Sets height as heightIn.
    *
    * @param heightIn String to set label as.
    * @return Whether process was successful or not.
    */
   public boolean setHeight(double heightIn) {
      if (heightIn > 0) {
         height = heightIn;
         return true;
      } else {
         return false;
      }
   }

   /**
    * Returns radius.
    *
    * @return Returns the variable radius.
    */
   public double getRadius() { return radius; }

   /**
    * Sets radius as radiusIn.
    *
    * @param radiusIn String to set label as.
    * @return Whether process was successful or not.
    */
   public boolean setRadius(double radiusIn) {
      if (radiusIn > 0) {
         radius = radiusIn;
         return true;
      } else {
         return false;
      }
   }

   /**
    * Returns base perimeter.
    * @return Returns the base perimeter.
    */
   public double basePerimeter() { return 2 * Math.PI * getRadius(); }

   /**
    * Returns base perimeter.
    * @return Returns the base area.
    */
   public double baseArea() { return Math.PI * Math.pow(getRadius(), 2.0); }

   /**
    * Returns slant height.
    * @return Returns the slant height.
    */
   public double slantHeight() { 
      return Math.sqrt(Math.pow(getRadius(), 2.0) + Math.pow(getHeight(), 2.0));
   }

   /**
    * Returns side area.
    * @return Returns side area.
    */
   public double sideArea() { return Math.PI * getRadius() * slantHeight(); }

   /**
    * Returns surface area.
    * @return Returns total surface area.
    */
   public double surfaceArea() {
      return Math.PI * getRadius() * (getRadius() + slantHeight());
   }

   /**
    * Returns volume.
    * @return Returns volume.
    */
   public double volume() {
      return Math.PI * Math.pow(getRadius(), 2.0) * (getHeight() / 3);
   }

   /**
    * Returns string value.
    * @return Returns the string value of the cone object.
    */
   public String toString() {
      DecimalFormat decimalFormat = new DecimalFormat("#,##0.0##");
      String output = "\"" + getLabel() + "\" is a cone with height = ";
      output += decimalFormat.format(getHeight());
      output += " units and radius = ";
      output += decimalFormat.format(getRadius());
      output += " units,\nwhich has base perimeter = ";
      output += decimalFormat.format(basePerimeter());
      output += " units, base area = ";
      output += decimalFormat.format(baseArea());
      output += " square units,\nslant height = ";
      output += decimalFormat.format(slantHeight());
      output += " units, side area = ";
      output += decimalFormat.format(sideArea());
      output += " square units,\nsurface area = ";
      output += decimalFormat.format(surfaceArea());
      output += " square units, and volume = ";
      output += decimalFormat.format(volume());
      output += " cubic units.";
      return output;
   }
}