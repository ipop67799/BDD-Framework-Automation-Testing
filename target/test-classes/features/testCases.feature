Feature: Urban Ladder Website Testing

Scenario: TestCase01
Given Navigate to homepage
When Pass "abcd@gmail.com" in subscribe
Then Check if "THANKS FOR SUBSCRIBING!" text is showing

Scenario: TestCase02
Given Navigate to homepage
When Search "Arabia - Capra 6 Seater Dining Table Set (With Bench)"
Then Get sale percentage off

Scenario: TestCase03
Given Navigate to homepage
When Search "chairs" and click on "Galen Study Chair"
Then Print "price" on log file

Scenario: TestCase04
Given Navigate to homepage
When Click on "Stores" and click on "Hadapsar, Pune"
Then Prints "address" on log file

Scenario: TestCase05
Given Navigate to homepage
When Click on "Gift Cards"
Then Print "terms and conditions" text in log file

Scenario: TestCase06
Given Navigate to homepage
When Clicking on "cart"
Then Store "Cart is empty" text in log file

Scenario: TestCase07
Given Navigate to homepage
When Clicked on "About us"
Then Store "email id" text in log

Scenario: TestCase08
Given Navigate to homepage
Then Print the "CIN" text in log file

Scenario: TestCase09
Given Navigate to homepage
When Searched "study tables"
Then Exclude out of stock and print price of "Anton Study Table"

Scenario: TestCase10
Given Navigate to homepage
When Click on help and search "What is the estimated delivery time?"
Then Get the Delivery Query Response and store in log file