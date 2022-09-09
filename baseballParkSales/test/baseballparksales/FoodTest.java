/**
 * ****************************************************************************
 * BaseballParkSalesJUnitTest.java Kevin Bell
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
public class FoodTest {

    public FoodTest() {
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
            {4, 11.00},
            {16, 0},
            {5, 13.75},
            {14, 38.50},
            {1, 2.75}
        };
        return Arrays.asList(data);
    }

    @Test
    public void testCalcCost() {
        Food food;
        food = new Food(15, "test", 2.50);
        double actual = food.calcCost(qnty);
        assertEquals(result, actual, 0.01);
    } // end test class
} // end j unit test class
