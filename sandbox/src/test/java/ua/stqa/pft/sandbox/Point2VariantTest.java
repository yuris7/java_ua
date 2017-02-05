package ua.stqa.pft.sandbox;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Point2VariantTest {

  @Test
  public void testDistance(){
    Point2Variant p1 = new Point2Variant();
    Point2Variant p2 = new Point2Variant(2,1);
    Assert.assertEquals(p1.length(p2),2.23606797749979);
    return;
  }

}
