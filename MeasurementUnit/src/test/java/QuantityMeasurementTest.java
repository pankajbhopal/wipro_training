import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuantityMeasurementTest {
    @Test
    void AddingNumberTest(){
        QuantityMeasurement calc = new QuantityMeasurement();
        assertEquals(5, calc.addNumberForTestCase(2,3));
    }
}