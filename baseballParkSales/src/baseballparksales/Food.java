/** ****************************************************************************
 * Food.java
 * Kevin Bell
 *
 * This program simulates Food Inventory by vendors in stands at a baseball park
 **************************************************************************** */
package baseballparksales;

public class Food extends Inventory {

    public Food(int itemQuantityOnHand, String itemName, double unitPrice) {
        super(itemQuantityOnHand, itemName, unitPrice);
    } // end constructor method    
//******************************************************************************

    @Override
    public double taxCalc(double unitPrice) {
        double taxAmount = unitPrice * FOOD_TAX;
        return taxAmount;
    } // end taxCalc method
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

    @Override
    public double souvenirBulkDiscountCalc(double qty) {
        return 0;
    } // end souvenirBulkDiscountCalc method
//******************************************************************************
} // end Food class
