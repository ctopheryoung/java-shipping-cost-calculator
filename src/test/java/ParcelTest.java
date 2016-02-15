import org.junit.*;
import static org.junit.Assert.*;

public class ParcelTest {

  @Test
  public void newParcel_instantiatesCorrectly() {
    Parcel testParcel = new Parcel(2, 2 , 2, 3.12);
    assertEquals(true, testParcel instanceof Parcel);
  }
}
