import org.junit.*;
import static org.junit.Assert.*;

public class ParcelTest {

  @Test
  public void newParcel_instantiatesCorrectly() {
    Parcel testParcel = new Parcel(2.0, 2.0, 2.0, 3.12);
    assertEquals(true, testParcel instanceof Parcel);
  }

  @Test
  public void getVolume_addsDimensions() {
    Parcel testParcel = new Parcel(2.0, 3.0, 4.0, 5.0);
    assertEquals(24.0, testParcel.getVolume(), 2);
  }

  @Test
  public void getBasicShippingCost_secretShippingFormula_mBasicShippingCost() {
    Parcel testParcel = new Parcel(2.0, 3.0, 4.0, 5.0);
    assertEquals(12.0, testParcel.getBasicShippingCost(), 2);
  }

  @Test
  public void speedModifier_addSurchargesToCost() {
    Parcel testParcel = new Parcel(4.3, 12.4, 4.1, 3.98);
    testParcel.getBasicShippingCost();
    assertEquals(130.51, testParcel.speedModifier(1.5), 2);
  }
}
