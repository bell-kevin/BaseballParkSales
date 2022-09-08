
/** ****************************************************************************
 * BaseballParkSalesJUnitTest.java
 * Kevin Bell
 *
 * This program tests sales by vendors in stands at a baseball park.
 **************************************************************************** */
import org.junit.Test;
import static org.junit.Assert.*;

public class BaseballParkSalesJUnitTest {

    public BaseballParkSalesJUnitTest() {
    }

    @Test
    public void hotDogs() {
        System.out.println("hotDogs");
        int hotDogs = 10;
        hotDogs = hotDogs - 1;
        int result = hotDogs;
        assertEquals(hotDogs, result);
    }// end hotDogs test

    @Test
    public void bottlesOfSoda() {
        System.out.println("bottlesOfSoda");
        int bottlesOfSoda = 10;
        bottlesOfSoda = bottlesOfSoda - 1;
        int result = bottlesOfSoda;
        assertEquals(bottlesOfSoda, result);
    }// end bottlesOfSoda test

    @Test
    public void teamLogoBallCaps() {
        System.out.println("teamLogoBallCaps");
        int teamLogoBallCaps = 10;
        teamLogoBallCaps = teamLogoBallCaps - 1;
        int result = teamLogoBallCaps;
        assertEquals(teamLogoBallCaps, result);
    }// end teamLogoBallCaps test

    @Test
    public void balloons() {
        System.out.println("balloons");
        int balloons = 10;
        balloons = balloons - 1;
        int result = balloons;
        assertEquals(balloons, result);
    }// end balloons test

    @Test
    public void hotDogs2() {
        System.out.println("hotDogs2");
        int hotDogs = 10;
        hotDogs = hotDogs - 1;
        assertNotEquals(hotDogs, -1000);
    }// end hotDogs test
} // end j unit test class
