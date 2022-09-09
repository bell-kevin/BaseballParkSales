/**
 * ****************************************************************************
 * BaseballParkSalesJUnitTest.java
 * Kevin Bell
 *
 * This program tests sales by vendors in stands at a baseball park.
 * ***************************************************************************
 */
package baseballparksales;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SouvenirTest {

    public SouvenirTest() {
    }
    //# of items purchased
    @Parameterized.Parameter(0)
    public int qnty;
    //expected result
    @Parameterized.Parameter(1)
    public double result;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
            {7, 7.35},
            {200, 0},
            {42, 37.49},
            {90, 80.33},
            {1, 1.05}
        };
        return Arrays.asList(data);
    }

    @Test
    public void testCalcCost() {
        Souvenirs s = new Souvenirs(100, "test", 1.00);
        double actual = s.calcCost(qnty);
        assertEquals(result, actual, 0.01);
    } // end testCalcCost test
} // end SouvenirTest class
