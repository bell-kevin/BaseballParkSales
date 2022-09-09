/** ****************************************************************************
 * Souvenirs.java
 * Kevin Bell
 *
 * This program simulates vendor Souvenir Inventory in stands at baseball park
 **************************************************************************** */
package baseballparksales;

public class Souvenirs extends Inventory implements SouvenirBulkDiscount {

    public Souvenirs(int itemQuantityOnHand, String itemName, double unitPrice) {
        super(itemQuantityOnHand, itemName, unitPrice);
    } // end constructor method 
//******************************************************************************

    @Override
    public double taxCalc(double unitPrice) {
        double taxAmount = unitPrice * SOUVENIRS_TAX;
        return taxAmount;
    } // end taxCalc method
//******************************************************************************

    @Override
    public double souvenirBulkDiscountCalc(int qty) {
        if (qty > 15) {
            System.out.println("Volume discount rate of 15.00 percent");
            double subtotal = (unitPrice * qty - ((unitPrice * qty) * DISCOUNT_RATE_15));
            return subtotal;
        } else if (qty > 8 && qty < 15) {
            System.out.println("Volume discount rate of 5.00 percent");
            double subtotal = (unitPrice * qty - ((unitPrice * qty) * DISCOUNT_RATE_8));
            return subtotal;
        } else {
            System.out.println("no discount");
            return unitPrice;
        } // if/else if condition
    } // end souvenirBulkDiscountCalc method
//******************************************************************************

    @Override
    public double calcCost(int qty) {
        if (itemQuantityOnHand >= qty) {
            double subTotal = (souvenirBulkDiscountCalc(qty));
            double tax = taxCalc(subTotal);
            double total = (tax + subTotal);
            itemQuantityOnHand = (itemQuantityOnHand - qty);
            System.out.printf("That costs $%1.2f\n", total);
            display();
            return total;
        } else {
            System.out.println("Not enough quantity on hand to sell");
            display();
            return 0;
        }// end if/else condition 
    } // end calcCost method
//******************************************************************************    
} // end Souvenirs class
