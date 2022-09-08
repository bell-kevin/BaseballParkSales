# BaseballParkSales
In Competency Exercises, you demonstrate your skill and ability to use the programming principles you've learned in the current and previous modules. You must complete this assignment by yourself, much like a module exam. You can ask instructors for clarification about the project -- you can not ask instructors or other students for help with logic or coding. If you are struggling with the project, you can look at previous assignments where you did similar work, and you can review the pertinent sections in the book.

Write unit tests to verify the results of your project. Include at least 5 sets of test data. Take screenshots of the successful unit test.

Module 2 Competency Project: Baseball Park Sales

In this project, you will simulate sales by the vendors in the stands at a baseball park. They walk around selling hot dogs, bottles of soda, team-logo ball caps, and balloons, in this simulation. These items are 2 categories of inventory -- food and souvenirs. Food items have a 10% tax. Souvenir items have a 5% tax. Also, it is possible to get volume discounts on souvenir items. There are 2 discounts available -- if you buy more than 15 items, the discount rate is 15%; if you buy more than 8 items, the discount rate is 5%. Notice these discounts are to the sale of each item, before any sales tax is applied. When the sale qualifies for a discount, print a message with the discount rate (see images below).

Create an Inventory class which describes the instance variables for all Inventory items -- name, unit price, and quantity on hand. Since all sales include sales tax, but at different rates, this class will implement an interface for sales tax. There will be 2 sub classes that inherit the Inventory class -- Food and Souvenir. There are no additional variables to add in these sub classes to better describe food items and souvenir items in this simulation.

Use an interface for the tax rates; it must include a method to require calculation of the tax in a sale. Use another interface for the volume discounts for souvenirs; it must include a method to calculate the discount in a sale. Make sure interfaces are implemented in logical and appropriate locations.

In the Inventory class, create an abstract method to sell an object; making it abstract will require that the method is implemented appropriately in the sub classes. When implemented, this method determines the price of a sale of that quantity of the object, and subtracts that quantity from the quantity on hand. It first needs to check that there is enough quantity on hand for the purchase; if true, calculate the price of the sale, subtract the quantity of the sale from the quantity on hand, and return the calculated price; if false, return a value of zero. To determine the price of the sale, calculate the price of the sale of that quantity, with discounts as appropriate, and add the appropriate sales tax.

In the main method, create an Array List to hold 2 food objects and 2 souvenir objects. 

To declare the objects, here are the values used in the sample session:

One Food item has name "hot dog", unit cost of $2.50, quantity on hand is 20

One Food item has name "soda", unit cost of $3.00, quantity on hand is 30

One Souvenir item has name "balloon", unit cost of $1.00, quantity on hand is 200

One Souvenir item has name "team cap", unit cost of $12.50, quantity of 50

You may instantiate each of these objects into object variables and then add those variables to the Array List. OR you may instantiate anonymous objects to the Array List.

Display the vendor's inventory using a for-each loop to iterate across the Array List. Here is a sample of the beginning of the project, listing the inventory items:

![Ch 14 Baseball Inventory launch](https://github.com/bell-kevin/BaseballParkSales/blob/main/c14-baseball-launch.PNG)

Next, using a for-each loop, "sell" each item 2 times. That for-each loop will perform these tasks: (1) Print a header with the name of the object being purchased, and display the single item. (2) Use a For loop inside of the for-each loop to perform 2 sales. In each sale, (2a) ask the user how many of that item they want, (2b) use the sell method for the item to get the cost for that sale (zero means not enough quantity on hand, and any other number is the cost of a good sale). (2c) If it's a good sale, display the cost, using appropriate formatting for the numbers representing money. If it's an invalid sale, display a message. (2d) Display the single item again to see any change in inventory.

Here is a sample session for selling the food items. Notice that each one has an invalid sale.

![Ch 14 Baseball Inventory food](https://github.com/bell-kevin/BaseballParkSales/blob/main/c14-baseball-food.PNG)

Here is a sample session for selling souvenir items. Notice the volume discounts in three of the sales, and the invalid sale.

![Ch 14 Baseball Inventory souvenir](https://github.com/bell-kevin/BaseballParkSales/blob/main/c14-baseball-stuff.PNG)

After all of the items have been sold 2 times, display the final inventory, using a for-each loop to display each item.

Here is a sample of that final inventory listing:

![Ch 14 Baseball Inventory final](https://github.com/bell-kevin/BaseballParkSales/blob/main/c14-baseball-final.PNG)

Run the project to match the samples, take screenshots like the examples above. Change all of the data about the objects in the Array list and run the project, being sure to include some invalid sales and at least 1 of each discount rate; take screenshots.

Submission: the specified screenshots (of execution of the project and successful unit tests) and the root folder for the project

Pay careful attention to the rubric for this assignment.

Note that you must use correct formatting in the code -- appropriate indentation is most important. You can use Shift-Alt-F to have NetBeans automatically format the code correctly. If the formatting is incorrect, it will be returned to you for changes with a grade of zero.

Note: You need to submit the whole project for these assignments. In File Explorer, go to the location where you created the project. There will be a folder with the name of your project -- that is the root folder of the project.  If you submit the root folder of the project, the instructor can run it on a different machine to grade it. If you don't submit the proper folder, it won't run on another machine, and the assignment will be marked with a zero.

== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project. I have a [website](https://bellKevin.me) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the [Give up GitHub](https://GiveUpGitHub.org) campaign 
from [the Software Freedom Conservancy](https://sfconservancy.org) to understand some of the reasons why GitHub is not 
a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
email me at **bellKevin@pm.me** for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
