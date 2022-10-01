Feature: Header

  @WEBAUTO-445
  Scenario: Logged in user view products in wishlist successfully
    Given user open bodyshop website
    When user click login link
    Then login popup displayed
    When user fill email field "testerauto11@gmail.com"
    When user click Masuk Daftar button
    When user fill password field "password123"
    When user click button Masuk
    When user click love icon on header
    Then user redirect to wishlist page

  @WEBAUTO-446
  Scenario: Logged in user wiew products in bag successfully
    Given user open bodyshop website
    When user click login link
    Then login popup displayed
    When user fill email field "testerauto11@gmail.com"
    When user click Masuk Daftar button
    When user fill password field "password123"
    When user click button Masuk
    When user click bag icon on header
    Then user see product in mini cart

  @WEBAUTO-447
  Scenario: Logged in user view profile successfully
    Given user open bodyshop website
    When user click login link
    Then login popup displayed
    When user fill email field "testerauto14@gmail.com"
    When user click Masuk Daftar button
    When user fill password field "Password123"
    When user click button Masuk
    When user click profile icon
    Then user redirect to profile page
    And user see account name "Ironman Sukamto"

  @WEBAUTO-448
  Scenario: User go to homepage successfully by click TBSI logo
    Given user open bodyshop website
    When user click store icon
    Then user redirected to stores page
    When user click TBSI logo
    Then user redirected to homepage

  @WEBAUTO-450
  Scenario: User go to store locator page successfully
    Given user open bodyshop website
    When user click store icon
    Then user redirected to stores page
