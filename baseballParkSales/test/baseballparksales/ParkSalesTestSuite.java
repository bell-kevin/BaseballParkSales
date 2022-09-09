/**
 * ****************************************************************************
 * BaseballParkSalesJUnitTest.java Kevin Bell
 *
 * This program tests sales by vendors in stands at a baseball park.
 * ***************************************************************************
 */
package baseballparksales;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({baseballparksales.SouvenirTest.class, baseballparksales.FoodTest.class})
public class ParkSalesTestSuite {
}
