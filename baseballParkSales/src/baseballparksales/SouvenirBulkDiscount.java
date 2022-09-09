/** ****************************************************************************
 * SouvenirBulkDiscount.java
 * Kevin Bell
 *
 * This interface simulates bulk discounts on souvenirs
 **************************************************************************** */
package baseballparksales;

public interface SouvenirBulkDiscount {

    double DISCOUNT_RATE_15 = .15;
    double DISCOUNT_RATE_8 = .05;

    double souvenirBulkDiscountCalc(int qty);
} // end interface SouvenirBulkDiscount
