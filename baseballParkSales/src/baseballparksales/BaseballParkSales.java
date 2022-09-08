/** ****************************************************************************
 * BaseballParkSales.java
 * Kevin Bell
 *
 * This driver program simulates sales by vendors in stands at a baseball park.
 **************************************************************************** */
package baseballparksales;

import java.util.*;

public class BaseballParkSales {

    public static void main(String[] args) {
        System.out.println("Module 2 Baseball Park Sales by Kevin Bell \n");
        ArrayList<Inventory> inventory = new ArrayList<>();
        inventory.add(new Food(20, "hot dog", 2.50));
        inventory.add(new Food(30, "soda", 3.00));
        inventory.add(new Souvenirs(200, "balloon", 1.00));
        inventory.add(new Souvenirs(50, "team cap", 12.50));
        for (Inventory inventoryStock : inventory) {
            inventoryStock.display();
            /*
            System.out.print("How many do you want to purchase? ");
            Scanner computerKeyboardInput = new Scanner(System.in);
            int qty = computerKeyboardInput.nextInt();
            inventoryStock.calcCost(qty);
             */
        } // end for-each loop
        System.out.println("");
        for (Inventory inventoryStock : inventory) {
            System.out.print("Buy " + inventoryStock.itemName + "\n");
            inventoryStock.display();
            for (int i = 0; i < 2; i++) {
                System.out.print("How many do you want? ");
                Scanner computerKeyboardInput = new Scanner(System.in);
                int qty = computerKeyboardInput.nextInt();
                inventoryStock.souvenirBulkDiscountCalc(qty);
                inventoryStock.calcCost(qty);
            } // end for loop
            System.out.println("");
        } // end for-each loop
        System.out.println("Final Inventory");
        for (Inventory inventoryStock : inventory) {
            inventoryStock.display();
        } // for-each loop
    } // end main method
} // end BaseballParkSales class
