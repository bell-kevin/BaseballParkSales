/** ****************************************************************************
 * Inventory.java
 * Kevin Bell
 *
 * This super class simulates Inventory by vendors in stands at a baseball park.
 **************************************************************************** */
package baseballparksales;

public abstract class Inventory implements Tax {

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
} // end Inventory class
