Feature: Login in to demo web shop

  Scenario Outline: sucesssful login to demo web shop.
    Given user navigates to demo web shop
    When I enter Email as "<Email>" and Password as "<password>"
    Then user shall able to view homepage

    Examples: 
      | Email                | Password   |
      | karthik456@gmail.com | karthik456 |
      | sri_123@gmail.com    | Pass123    |
