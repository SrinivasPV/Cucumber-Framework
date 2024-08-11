Feature: Order a product in Flipkart e-commers site

@Placeorder
Scenario Outline: Place an order
Given Go to loging page
When Enter username <name> and password <pass>
Then Click on login button
And Search for the product <prod> and add it cart
And Checkout to verify the <prod>

Examples:
|name|pass|prod|
|8248607808|Santyvas@1203|Jawa 42|