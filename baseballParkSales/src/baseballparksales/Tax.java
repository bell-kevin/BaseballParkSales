/** ****************************************************************************
 * Tax.java
 * Kevin Bell
 *
 * This interface simulates tax on inventory sales for food & non-food items
 * at a baseball park.
 **************************************************************************** */
package baseballparksales;

public interface Tax {

    double FOOD_TAX = .10;
    double ITEM_TAX = .05;

    double taxCalc(double unitCost);
} // end interface Tax
