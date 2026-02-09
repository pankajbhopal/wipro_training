package measurement.src;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class QuantityMeasurementTest {
  @Test
    void AddFunctionTest(){
      var calc = new QuantityMeasurement();
      assertEquals(5, calc.addNumberForTestCase(2, 3));
  }

}