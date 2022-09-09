/** ****************************************************************************
 * Tax.java
 * Kevin Bell
 *
 * This interface simulates tax on inventory sales for food & non-food items
 **************************************************************************** */
package baseballparksales;

public interface Tax {

    double FOOD_TAX = .10;
    double SOUVENIRS_TAX = .05;

    double taxCalc(double unitPrice);
} // end interface Tax
