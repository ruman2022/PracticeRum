Feature: login account


  Scenario: fb sigIn account


    Given User on alraedy home page
    Then user enters email and password
    |   ruman311@gmail.com  | zAbre123 |


    Then user click on login button
    Then user close the browser
