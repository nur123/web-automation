Feature: Login

  Background:
    Given user open bodyshop website

  @WEBAUTO-367
  Scenario: User login using email account successfully
    When user click login link
    Then login popup displayed
    When user fill email field "testerauto11@gmail.com"
    When user click Masuk Daftar button
    When user fill password field "password123"
    When user click button Masuk
    Then successfully logged in and alert displayed
    And alert login message "Selamat datang kembali, Akunbaru!" displayed

  @WEBAUTO-375
  Scenario: User login using phone number account successfully
    When user click login link
    Then login popup displayed
    When user fill phone number "875321123"
    When user click Masuk Daftar button
    When user fill password field "password123"
    When user click button Masuk
    Then successfully logged in and alert displayed
    And alert login message "Selamat datang kembali, Tester!" displayed
