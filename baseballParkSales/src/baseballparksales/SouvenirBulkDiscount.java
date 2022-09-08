/** ****************************************************************************
 * SouvenirBulkDiscount.java
 * Kevin Bell
 *
 * This interface simulates bulk discounts on souvenirs
 **************************************************************************** */
package baseballparksales;

public interface SouvenirBulkDiscount {
    /* 
Also, it is possible to get volume discounts on souvenir items. There are 2 
discounts available -- if you buy more than 15 items, the discount rate is 15%; 
if you buy more than 8 items, the discount rate is 5%. Notice these discounts 
are to the sale of each item, before any sales tax is applied. When the sale 
qualifies for a discount, print a message with the discount rate (see images 
below).
    
Use another interface for the volume discounts for souvenirs; it must include a 
method to calculate the discount in a sale. Make sure interfaces are implemented
in logical and appropriate locations.
     */
    double DISCOUNT_RATE_15 = .15;
    double DISCOUNT_RATE_8 = .05;

    double souvenirBulkDiscountCalc(double qty);
} // end interface SouvenirBulkDiscount
