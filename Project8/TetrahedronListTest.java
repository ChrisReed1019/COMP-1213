import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for TetrahedronList.
 *
 * @author Chris Reed - COMP-1213
 * @version 3-22-2021
 */
public class TetrahedronListTest {
   /**
    * Test toString method.
    */
   @Test public void testToString() {
      Tetrahedron[] array = new Tetrahedron[] {
         new Tetrahedron("Test1", 4.5),
         new Tetrahedron("Test2", 8.9),
         new Tetrahedron("Test3", 3.7)};
      TetrahedronList tetrahedronList = new TetrahedronList(
              "TetrahedronList1", array, 3);
      Assert.assertTrue(
              tetrahedronList.toString().contains(tetrahedronList.getName()));
   }

   /**
    * Test numberOfTetrahedrons method.
    */
   @Test public void testNumberMethod() {
      Tetrahedron[] array = new Tetrahedron[] {
         new Tetrahedron("Test1", 4.5),
         new Tetrahedron("Test2", 8.9),
         new Tetrahedron("Test3", 3.7)};
      TetrahedronList tetrahedronList = new TetrahedronList(
              "TetrahedronList1", array, 3);
      Assert.assertTrue(tetrahedronList.numberOfTetrahedrons() == 3);
   }

   /**
    * Test total and average methods.
    */
   @Test public void testTotalsAndAverages() {
      Tetrahedron[] array = new Tetrahedron[] {
         new Tetrahedron("Test1", 4.5),
         new Tetrahedron("Test2", 8.9),
         new Tetrahedron("Test3", 3.7)};
      TetrahedronList tetrahedronList = new TetrahedronList(
              "TetrahedronList1", array, 3);
      Tetrahedron[] array2 = {};
      TetrahedronList tetrahedronList2 = new TetrahedronList(
              "TetrahedronList2", array2, 0);
      Tetrahedron[] array3 = new Tetrahedron[5];
      TetrahedronList tetrahedronList3 = new TetrahedronList(
              "TetrahedronList3", array3, 0);
      Assert.assertTrue(tetrahedronList2.averageVolume() == 0);
      Assert.assertTrue(tetrahedronList2.averageSurfaceArea() == 0);
      Assert.assertTrue(tetrahedronList2.totalSurfaceArea() == 0);
      Assert.assertTrue(tetrahedronList2.totalVolume() == 0);
      Assert.assertTrue(tetrahedronList3.totalSurfaceArea() == 0);
      Assert.assertTrue(tetrahedronList3.totalVolume() == 0);
      Assert.assertTrue(tetrahedronList3.averageSurfaceArea() == 0);
      Assert.assertTrue(tetrahedronList3.averageVolume() == 0);
      Assert.assertEquals(tetrahedronList.totalVolume(), 99.79009, 0.00001);
      Assert.assertEquals(tetrahedronList.totalSurfaceArea(), 
         195.98154, 0.00001);
      Assert.assertEquals(tetrahedronList.averageVolume(), 33.26336, 0.00001);
      Assert.assertEquals(tetrahedronList.averageSurfaceArea(), 
         65.32718, 0.00001);
   }

   /**
    * Test addTetrahedron method.
    */
   @Test public void testAddTetrahedron() {
      Tetrahedron[] array = new Tetrahedron[] {
         new Tetrahedron("Test1", 4.5),
         new Tetrahedron("Test2", 8.9),
         new Tetrahedron("Test3", 3.7)};
      TetrahedronList tetrahedronList = new TetrahedronList(
              "TetrahedronList1", array, 3);
      tetrahedronList.addTetrahedron(new Tetrahedron("Test4", 9.9));
      tetrahedronList.addTetrahedron(null);
      Assert.assertTrue(tetrahedronList.getList().length == 4);
      tetrahedronList.addTetrahedron("Test5", 7.9);
      Assert.assertTrue(tetrahedronList.getList().length == 5);
   }
   /**
    * Test deleteTetrahedron method.
    */
   @Test public void testDeleteTetrahedron() {
      Tetrahedron[] array = new Tetrahedron[] {
         new Tetrahedron("Test1", 4.5),
         new Tetrahedron("Test2", 8.9),
         new Tetrahedron("Test3", 3.7)};
      TetrahedronList tetrahedronList = new TetrahedronList(
              "TetrahedronList1", array, 3);
      Tetrahedron[] array2 = {};
      TetrahedronList tetrahedronList2 = new TetrahedronList(
              "TetrahedronList2", array2, 0);
      Tetrahedron[] array3 = new Tetrahedron[5];
      TetrahedronList tetrahedronList3 = new TetrahedronList(
              "TetrahedronList3", array3, 0);
      tetrahedronList.deleteTetrahedron("Test3");
      tetrahedronList.deleteTetrahedron("Test4");
      tetrahedronList2.deleteTetrahedron(null);
      tetrahedronList2.deleteTetrahedron("Test3");
      tetrahedronList3.deleteTetrahedron(null);
      tetrahedronList3.deleteTetrahedron("Test3");
      Assert.assertTrue(tetrahedronList.getList().length == 2);
   }

   /**
    * Test editTetrahedron method.
    */
   @Test public void testEditTetrahedron() {
      Tetrahedron[] array = new Tetrahedron[] {
         new Tetrahedron("Test1", 4.5),
         new Tetrahedron("Test2", 8.9),
         new Tetrahedron("Test3", 3.7)};
      TetrahedronList tetrahedronList = new TetrahedronList(
              "TetrahedronList1", array, 3);
      tetrahedronList.editTetrahedron("Test3", 9.9);
      tetrahedronList.editTetrahedron("Test4", 4.9);
      Assert.assertTrue(tetrahedronList.getList()[2].equals(
              new Tetrahedron("Test3", 9.9)));
   }

   /**
    * Test findTetrahedron method.
    */
   @Test public void testFind() {
      Tetrahedron[] array = new Tetrahedron[] {
         new Tetrahedron("Test1", 4.5),
         new Tetrahedron("Test2", 8.9),
         new Tetrahedron("Test3", 3.7)};
      TetrahedronList tetrahedronList = new TetrahedronList(
              "TetrahedronList1", array, 3);
      Tetrahedron[] array2 = {};
      TetrahedronList tetrahedronList2 = new TetrahedronList(
              "TetrahedronList2", array2, 0);
      Tetrahedron[] array3 = new Tetrahedron[5];
      TetrahedronList tetrahedronList3 = new TetrahedronList(
              "TetrahedronList3", array3, 0);
      Assert.assertTrue(tetrahedronList.findTetrahedron("Test3") == array[2]);
      Assert.assertTrue(tetrahedronList.findTetrahedron(null) == null);
      Assert.assertTrue(tetrahedronList.findTetrahedron("Test4") == null);
      Assert.assertTrue(tetrahedronList2.findTetrahedron("Test3") == null);
      Assert.assertTrue(tetrahedronList2.findTetrahedron(null) == null);
      Assert.assertTrue(tetrahedronList3.findTetrahedron("Test3") == null);
      Assert.assertTrue(tetrahedronList3.findTetrahedron(null) == null);
   }

   /**
    * Test findTetrahedronWithLargestVolume method.
    */
   @Test public void largestVolume() {
      Tetrahedron[] array = new Tetrahedron[] {
         new Tetrahedron("Test1", 4.5),
         new Tetrahedron("Test2", 8.9),
         new Tetrahedron("Test3", 3.7)};
      TetrahedronList tetrahedronList = new TetrahedronList(
              "TetrahedronList1", array, 3);
      Tetrahedron[] array2 = {};
      TetrahedronList tetrahedronList2 = new TetrahedronList(
              "TetrahedronList2", array2, 0);
      Tetrahedron[] array3 = new Tetrahedron[5];
      TetrahedronList tetrahedronList3 = new TetrahedronList(
              "TetrahedronList3", array3, 0);
      Assert.assertTrue(tetrahedronList.findTetrahedronWithLargestVolume()
         == array[1]);
      Assert.assertTrue(tetrahedronList2.findTetrahedronWithLargestVolume()
         == null);
      Assert.assertTrue(tetrahedronList3.findTetrahedronWithLargestVolume()
         == null);
   }
}
