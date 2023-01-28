Feature: Planit Assigmnet

  Background:
    Given Navigate to the URL

  @planitassignment
  Scenario: Automate Tricentis webpage
    When User Click on login button
    When User login with credentials
    Then validate the user account id
    Then User clear shoppingcart
    When mousehover on the given category
    And User selects a computer from the list
    And User get the price details
    And User enters quantity of product
    When User click on Add to cart
    Then validate the success message of product has been added
    Then validate subTotal price 
    When User clicks on checkout
    Then User select billing address
    And User clicks on continue
    And User selects the shipping address
    #And User clicks on continue
    #And User selects shipping method
    #And User clicks on continue
    When User choose the payment method as COD
    #And User clicks on continue
    Then user validate message for COD confirmation
    #And User clicks on continue
    When User clicks on confirm button
    Then validate the message for successful order
    And User clicks on continue
    Then User logout from the application
    
    
     
    