/** ****************************************************************************
 * Inventory.java
 * Kevin Bell
 *
 * This super class simulates Inventory by vendors in stands at a baseball park.
 **************************************************************************** */
package baseballparksales;

public abstract class Inventory implements Tax, SouvenirBulkDiscount {

    int itemQuantityOnHand;
    String itemName;
    double unitPrice;

    public Inventory() {
    } // end zero-parameter constructor

    public Inventory(int itemQuantityOnHand, String itemName,
            double unitPrice) {
        this.itemQuantityOnHand = itemQuantityOnHand;
        this.itemName = itemName;
        this.unitPrice = unitPrice;
    } // end constructor
//******************************************************************************

    public void display() {
        System.out.printf("Item %s costs $%3.2f, there are %d on "
                + "hand\n", itemName, unitPrice, itemQuantityOnHand);
    } // end display method
//******************************************************************************

    public abstract double calcCost(int qty);
    /*
    In the Inventory class, create an abstract method to sell an object; making 
    it abstract will require that the method is implemented appropriately in the
    sub classes. When implemented, this method determines the price of a sale of
    that quantity of the object, and subtracts that quantity from the quantity 
    on hand. It first needs to check that there is enough quantity on hand for 
    the purchase; if true, calculate the price of the sale, subtract the 
    quantity of the sale from the quantity on hand, and return the calculated 
    price; if false, return a value of zero. To determine the price of the sale,
    calculate the price of the sale of that quantity, with discounts as 
    appropriate, and add the appropriate sales tax.
     */
} // end Inventory class
