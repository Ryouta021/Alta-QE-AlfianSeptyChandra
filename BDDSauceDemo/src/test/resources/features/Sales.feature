@Purchase
  Feature:
    As a user i want to purchase one item from product list


  Scenario: Filter product list
    Given User already on a login page
    When User input "standard_user" as userName "secret_sauce" as a password
    Then User already will go to product page
    When User filter list  product by "Name (Z to A)"
    And  User click item "Test.allTheThings() T-Shirt (Red)"
    And  User click item "Sauce Labs Onesie"
    And User click cart
    Then User already on a cart page
    When User click remove "Test.allTheThings() T-Shirt (Red)"
    And User click checkout button
    And User input "alfian" as firstName "septy" as a lastName and input "210901" as a postalCode
    Then User already in a checkout page and see the name of "Sauce Labs Onesie" as a produk
    When User click finsih button
    Then User will go to checkout complete page
    And User click back to home button