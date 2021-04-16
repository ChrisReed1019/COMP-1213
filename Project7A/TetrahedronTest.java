import org.junit.Assert;
import org.junit.Test;

/**
 * Tetrahedron test class.
 *
 * @author Chris Reed - COMP-1213
 * @version 3-10-2021
 */
public class TetrahedronTest {
   /**
    * Tests height method.
    */
   @Test public void testHeight() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      Assert.assertEquals(example1.height(), 0.408, 0.001);
   }

   /**
    * Tests surfaceArea method.
    */
   @Test public void testSurfaceArea() {
      Tetrahedron example2 = new Tetrahedron(" Medium Example ", 12.8);
      Assert.assertEquals(example2.surfaceArea(), 283.779, 0.001);
   }

   /**
    * Tests volume method.
    */
   @Test public void testVolume() {
      Tetrahedron example3 = new Tetrahedron("Large Example", 97.36);
      Assert.assertEquals(example3.volume(), 108761.565, 0.001);
   }

   /**
    * Tests manipulator methods.
    */
   @Test public void testManipulators() {
      Tetrahedron temp = new Tetrahedron("Temporary", 0.5);
      temp.setLabel("hello");
      temp.setEdge(1);
      Assert.assertTrue(temp.getLabel() == "hello" && temp.getEdge() == 1);
      Assert.assertTrue(!temp.setLabel(""));
      Assert.assertTrue(!temp.setLabel(null));
      Assert.assertTrue(!temp.setEdge(-1));
   }

   /**
    * Test equals and hashCode.
    */
   @Test public void testEquals() {
      Tetrahedron example3 = new Tetrahedron("Large Example", 97.36);
      Assert.assertTrue(example3.equals(
              new Tetrahedron("Large Example", 97.36)));
      Assert.assertTrue(!example3.equals(
              new Tetrahedron("Small Example", 87.36)));
      Assert.assertEquals(example3.hashCode(), 0, 1);
   }

   /**
    * Tests toString method.
    */
   @Test public void testToString() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      Assert.assertTrue(example1.toString().contains("\"Small Example\""));
   }

   /**
    * Tests count and count methods.
    */
   @Test public void testCount() {
      Assert.assertTrue(Tetrahedron.getCount() > 0);
      Tetrahedron.resetCount();
      Assert.assertTrue(Tetrahedron.getCount() == 0);
   }
}
