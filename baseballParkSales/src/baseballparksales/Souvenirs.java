/** ****************************************************************************
 * Souvenirs.java
 * Kevin Bell
 *
 * This program simulates vendor Souvenir Inventory in stands at baseball park
 **************************************************************************** */
package baseballparksales;

public class Souvenirs extends Inventory {

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
    public double souvenirBulkDiscountCalc(double qty) {
        if (qty > 15) {
            System.out.println("Volume discount rate of 15.00 percent");
            //return unitPrice = (unitPrice * DISCOUNT_RATE_15);
            return 1000;
        } else if (qty > 8 && qty < 16) {
            System.out.println("Volume discount rate of 5.00 percent");
            //return unitPrice = (unitPrice * DISCOUNT_RATE_8);
            return 50;
        } else {
            System.out.println("no discount");
            // return unitPrice;
            return 5000;
        } // if/else if condition

// ((unitPrice*qty)-((unitPrice*qty)*DISCOUNT_RATE_15))+(((unitPrice*qty)-
// ((unitPrice*qty)*DISCOUNT_RATE_15))*SOUVENIRS_TAX) = 22.3125
// (25-(25*.15))+((25-(25*.15))*.05) = 22.3125
    } // end souvenirBulkDiscountCalc method
//******************************************************************************

    @Override
    public double calcCost(int qty) {
        if (itemQuantityOnHand >= qty) {
            double subTotal = (qty * unitPrice);
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
