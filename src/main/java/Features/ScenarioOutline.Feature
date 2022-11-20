Feature: create accounts

  Scenario Outline: target create account


    Given User on alraedy home page
    When user click on sign in
    Then click on create account
    Then user enters "<email>" and "<firstname>" and"<lastname>" and "<password>"
    Then user click on create account
    Then user close the browser
    Examples:
      | email          | firstname | lastname | password |
      | k3g@gmail.com  | tarek     | Ahm      | tarek124 |
      | rtag@gmail.com | ayaat     | Ahme     | Ayyt123  |
      | mum@gmail.com  | mumi      | Ahkam    | Mumi     |